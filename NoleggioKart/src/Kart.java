import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringBuilder;

public abstract class Kart {
    @SerializedName("tipoKart")
    private String tipoKart;
    private String marca;
    private int numeroSeriale;
    private String tipoCambio;
    private Noleggio noleggioCorrente;
    private LocalDate dataRegistrazione;

    public Kart(String marca, int numeroSeriale, String tipoCambio, Noleggio noleggioCorrente, String tipoKart, LocalDate dataRegistrazione) {
        this.marca = marca;
        this.numeroSeriale = numeroSeriale;
        this.tipoCambio = tipoCambio;
        this.noleggioCorrente = noleggioCorrente;
        this.tipoKart = tipoKart;
        this.dataRegistrazione = dataRegistrazione;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroSeriale() {
        return numeroSeriale;
    }

    public void setNumeroSeriale(int numeroSeriale) {
        this.numeroSeriale = numeroSeriale;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Noleggio getNoleggioCorrente() {
        return noleggioCorrente;
    }

    public void setNoleggioCorrente(Noleggio noleggioCorrente) {
        this.noleggioCorrente = noleggioCorrente;
    }

    public static Kart creaKartDaTastiera(Scanner scanner, LocalDate dataRegistrazione) {
        String filePath = "Kart.json";

        String marca;
        int numeroSeriale;
        String tipoCambio;
        String tipoKart;

        Kart nuovoKart = null;

        do {
            System.out.println("Inserisci la marca del kart:");
            marca = scanner.nextLine().trim();
        } while (marca.isEmpty());

        do {
            System.out.println("Inserisci il numero seriale del kart:");
            while (!scanner.hasNextInt()) {
                System.out.println("Inserisci un numero seriale valido:");
                scanner.next();
            }
            numeroSeriale = scanner.nextInt();
            scanner.nextLine();
        } while (numeroSeriale <= 0);

        do {
            System.out.println("Inserisci il tipo di kart (1 per base, 2 per medio, 3 per avanzato):");
            int tipoKartInput;
            while (!scanner.hasNextInt()) {
                System.out.println("Inserisci un numero valido:");
                scanner.next();
            }
            tipoKartInput = scanner.nextInt();
            scanner.nextLine();
            if (tipoKartInput == 1) {
                tipoCambio = "Manuale";
                tipoKart = "Base";
                nuovoKart = new KartBase(marca, numeroSeriale, tipoCambio, null, tipoKart, dataRegistrazione);
            } else if (tipoKartInput == 2) {
                tipoCambio = "Automatico";
                tipoKart = "Medio";
                nuovoKart = new KartMedio(marca, numeroSeriale, tipoCambio, null, tipoKart, dataRegistrazione);
            } else if (tipoKartInput == 3) {
                tipoCambio = "Manuale";
                tipoKart = "Avanzato";
                nuovoKart = creaKartAvanzato(scanner, marca, numeroSeriale, tipoCambio, dataRegistrazione);
            } else {
                System.out.println("Tipo di kart non valido. Riprova.");
            }
        } while (nuovoKart == null);

        salvaKartSuFile(nuovoKart, filePath);

        return nuovoKart;
    }

    private static Kart creaKartAvanzato(Scanner scanner, String marca, int numeroSeriale, String tipoCambio, LocalDate dataRegistrazione) {
        System.out.println("Inserisci il numero di chilometri percorsi:");
        int contaChilometri;
        while (!scanner.hasNextInt()) {
            System.out.println("Inserisci un numero di chilometri valido:");
            scanner.next();
        }
        contaChilometri = scanner.nextInt();
        scanner.nextLine();
        return new KartAvanzato(marca, numeroSeriale, contaChilometri, true, null, tipoCambio, tipoCambio, dataRegistrazione);
    }

    public static List<Kart> leggiKartDaFile(String filePath) {
        Gson gson = new GsonBuilder()
            .registerTypeAdapter(Kart.class, new KartAdapter())
            .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
            .create();
        List<Kart> karts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder jsonString = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonString.append(line);
            }
            JsonElement jsonElement = JsonParser.parseString(jsonString.toString());
            if (jsonElement.isJsonArray()) {
                TypeToken<List<Kart>> typeToken = new TypeToken<List<Kart>>(){};
                karts = gson.fromJson(jsonElement, typeToken.getType());
            }
        } catch (IOException e) {
            System.err.println("Errore durante la lettura del file " + filePath + ": " + e.getMessage());
            e.printStackTrace();
        }
        return karts;
    }
    

    public static void salvaKartSuFile(Kart nuovoKart, String filePath) {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .registerTypeAdapter(Kart.class, new KartAdapter())
                .setPrettyPrinting()
                .create();
        List<Kart> karts = leggiKartDaFile(filePath);
        if (karts == null) {
            karts = new ArrayList<>();
        }
        
        // Controlla se il nuovo kart è già presente nella lista
        boolean kartPresente = false;
        for (Kart kart : karts) {
            if (kart.getNumeroSeriale() == nuovoKart.getNumeroSeriale()) {
                kartPresente = true;
                break;
            }
        }
        
        // Se il kart non è già presente, aggiungilo alla lista
        if (!kartPresente) {
            karts.add(nuovoKart);
        }
        
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(karts, writer);
        } catch (IOException e) {
            System.out.println("Errore nel salvataggio dei kart nel file " + filePath + ".");
            e.printStackTrace();
        }
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(this.marca).append(" Numero Seriale: ").append(this.numeroSeriale).append(" Tipo cambio: ").append(this.tipoCambio)
                .append(" Noleggio Corrente: ").append(this.noleggioCorrente).append(" Tipo kart: ").append(this.getClass().getSimpleName())
                .append(" Freno a disco: ").append(this.getClass().getSimpleName().equals("KartAvanzato") ? ((KartAvanzato)this).isFrenoADisco() : "N/A")
                .append(" Chilometri percorsi: ").append(this.getClass().getSimpleName().equals("KartAvanzato") ? ((KartAvanzato)this).getContaChilometri() : "N/A")
                .append(" Data registrazione: ").append(this.dataRegistrazione); // Aggiungi la data di registrazione
        return sb.toString();
    }

    public abstract double calcolaCostoNoleggio();
}
