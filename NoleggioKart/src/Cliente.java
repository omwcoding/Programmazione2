import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class Cliente implements Serializable{
    private String nome;
    private String codiceFiscale;
    private int numeroMassimoKart;
    private String cognome;
    private String indirizzo;
    private String telefono;

    
    public Cliente(String nome, String cognome,  int numeroMassimoKart, String codiceFiscale, String indirizzo, String telefono) {
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.numeroMassimoKart = numeroMassimoKart;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }

    //metodi getter e setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    public int getNumeroMassimoKart() {
        return numeroMassimoKart;
    }
    public void setNumeroMassimoKart(int numeroMassimoKart) {
        this.numeroMassimoKart = numeroMassimoKart;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //metodo per registrare un cliente da tastiera  
    public static Cliente registraClienteDaTastiera(Scanner scanner, List<Cliente> clienti) {
        String nome;
        String cognome;
        String codiceFiscale;
        int numeroMassimoKart;
        String indirizzo;
        String telefono;
    
        do {
            System.out.print("Inserisci il nome del cliente: ");
            nome = scanner.nextLine().trim();
        } while (nome.isEmpty());
    
        do {
            System.out.print("Inserisci il cognome del cliente: ");
            cognome = scanner.nextLine().trim();
        } while (cognome.isEmpty());
    
        boolean codiceFiscaleValido;
        boolean codiceFiscaleUnico;
        do {
            System.out.print("Inserisci il codice fiscale del cliente (es. RSSMRA80A01H501Z): ");
            codiceFiscale = scanner.nextLine().trim();
    
            // Controllo se il codice fiscale è valido e unico
            codiceFiscaleValido = codiceFiscale.matches("[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]");
            codiceFiscaleUnico = codiceFiscaleValido && !isCodiceFiscaleAlreadyUsed(codiceFiscale, clienti);
    
            if (!codiceFiscaleValido) {
                System.out.println("Il codice fiscale inserito non è valido. Assicurati di inserire un codice fiscale nel formato corretto.");
            } else if (!codiceFiscaleUnico) {
                System.out.println("Il codice fiscale inserito è già presente. Assicurati di inserire un codice fiscale unico.");
            }
        } while (!codiceFiscaleValido || !codiceFiscaleUnico);
    
        do {
            System.out.print("Inserisci il numero massimo di kart che il cliente può noleggiare: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Devi inserire un numero intero valido per il numero massimo di kart: ");
                scanner.next();
            }
            numeroMassimoKart = scanner.nextInt();
            scanner.nextLine(); // Consuma il resto della linea
            if (numeroMassimoKart <= 0) {
                System.out.println("Il numero massimo di kart deve essere un numero intero positivo.");
            }
        } while (numeroMassimoKart <= 0);
    
        do {
            System.out.print("Inserisci l'indirizzo del cliente: ");
            indirizzo = scanner.nextLine().trim();
            if (indirizzo.isEmpty()) {
                System.out.println("L'indirizzo non può essere vuoto. Assicurati di inserire un indirizzo valido.");
            }
        } while (indirizzo.isEmpty());
    
        do {
            System.out.print("Inserisci il numero di telefono del cliente: ");
            telefono = scanner.nextLine().trim();
            if (telefono.isEmpty()) {
                System.out.println("Il numero di telefono non può essere vuoto. Assicurati di inserire un numero di telefono valido.");
            }
        } while (telefono.isEmpty());
    
        return new Cliente(nome, cognome, numeroMassimoKart, codiceFiscale, indirizzo, telefono);
    }
    
    
    

    @Override
    public String toString() {
        return new StringBuffer("Nome: ").append(this.nome).append(" Cognome : ").append(this.cognome)
        .append(" Codice Fiscale : ").append(this.codiceFiscale).append(" Numero Massimo Kart : ")
        .append(this.numeroMassimoKart).append(" Indirizzo : ").append(this.indirizzo)
        .append(" Telefono : ").append(this.telefono).toString();
    }   
    

    public static List<Cliente> leggiClientiDaFile(String filePath) {
        Gson gson = new Gson();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            JsonElement jsonElement = JsonParser.parseReader(reader);
            if (jsonElement.isJsonObject()) {
                // Se il JSON è un oggetto, crea una lista contenente l'unico cliente nel JSON
                Cliente cliente = gson.fromJson(jsonElement, Cliente.class);
                List<Cliente> clienti = new ArrayList<>();
                clienti.add(cliente);
                return clienti;
            } else if (jsonElement.isJsonArray()) {
                // Se il JSON è un array, leggi e restituisci la lista di clienti
                TypeToken<List<Cliente>> typeToken = new TypeToken<List<Cliente>>(){};
                return gson.fromJson(jsonElement, typeToken.getType());
            }
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file " + filePath + ".");
            e.printStackTrace();
        }
        return null;
    }
    

    public static void salvaClientiSuFile(Cliente nuovoCliente, String filePath) {
        Gson gson = new Gson();
        List<Cliente> clienti = leggiClientiDaFile(filePath);
        if (clienti == null) {
        clienti = new ArrayList<>();
        }
        clienti.add(nuovoCliente);

        
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(clienti, writer);

        } catch (IOException e) {
            System.out.println("Errore nel salvataggio dei clienti nel file " + filePath + ".");
            e.printStackTrace();
        }
    }
    
    public static void mostraClientiRegistrati() {
        List<Cliente> clientiLetti = leggiClientiDaFile("Clienti.json");
        System.out.println("## Elenco clienti registrati: ##\n");
        for (Cliente c : clientiLetti) {
            System.out.println(c);
        }
        System.out.println();
    }

    public static void richiestaDatiCliente(){
        String decisione = "y";
        Scanner scanner = new Scanner(System.in);
        @SuppressWarnings("unused")
        boolean continuaInserimento = true;
        
        List<Cliente> clienti = leggiClientiDaFile("Clienti.json"); // Leggi l'elenco dei clienti dal file
    
        while (decisione.equals("y")){
            Cliente nuovoCliente = Cliente.registraClienteDaTastiera(scanner, clienti);  // Passa l'elenco dei clienti
            Cliente.salvaClientiSuFile(nuovoCliente, "Clienti.json");       //salva il cliente su file
            System.out.println("Cliente registrato come: [ " + nuovoCliente + " ]"); //ci mostra il cliente registrato
            
            System.out.println("Inserire nuovo cliente?\nInserisci 'y' per dire sì, altrimenti esci con 'n'/n");      //chiede se si vuole continuare
            
            // Verifica se c'è ancora input disponibile prima di chiamare il metodo nextLine()
            if (scanner.hasNextLine()) {
                decisione = scanner.nextLine().toLowerCase();       //converte la stringa in minuscolo
            } else {
                decisione = "n";
            }
    
            if (decisione.equals("n")) {
                continuaInserimento = false;
            }
        }
    }
    
    public static boolean isCodiceFiscaleAlreadyUsed(String codiceFiscale, List<Cliente> clienti) {
        for (Cliente cliente : clienti) {
            if (cliente.getCodiceFiscale().equalsIgnoreCase(codiceFiscale)) {
                return true;
            }
        }
        return false;
    }
    
}