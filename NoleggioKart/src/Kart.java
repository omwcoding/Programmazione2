import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.StringBuilder;
import com.google.gson.Gson;

public abstract class Kart {
    private String marca;
    private int numeroSeriale;
    private String tipoCambio;
    private Noleggio noleggioCorrente;

    public Kart(String marca, int numeroSeriale,  String tipoCambio, Noleggio noleggioCorrente) {
        this.marca = marca;
        this.numeroSeriale = numeroSeriale;
        this.tipoCambio = tipoCambio;
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
    


    //metodo per registrare un kart da tastiera   
    public Kart registraKartDaTastiera(Scanner scanner) {
        do{
            System.out.println("Inserisci la marca del kart");
            String marca = scanner.nextLine();
            if(marca.length() > 0){
                this.setMarca(marca);
                break;
            }
            System.out.println("La marca non può essere vuota");
        }
        while(true);

        do{
            System.out.println("Inserisci il numero seriale del kart");
            int numeroSeriale = scanner.nextInt();
            if(numeroSeriale > 0){
                this.setNumeroSeriale(numeroSeriale);
                break;
            }
            System.out.println("Il numero seriale non può essere negativo");
        }
        while(true);

        do{
            System.out.println("Inserisci il tipo di kart (1 per base, 2 per medio, 3 per avanzato)");
            int tipoKart = scanner.nextInt();
            scanner.nextLine();
            if(tipoKart == 1){
                this.setTipoCambio("Manuale");
                return new KartBase(marca, numeroSeriale, tipoCambio, noleggioCorrente);
            }
            else if(tipoKart == 2){
                this.setTipoCambio("Automatico");
                return new KartMedio(marca, numeroSeriale, tipoCambio, noleggioCorrente);
            }
            else if(tipoKart == 3){
                this.setTipoCambio("Manuale");
                System.out.println("Inserisci il numero di chilometri percorsi");
                int contaChilometri = scanner.nextInt();
                scanner.nextLine();

                return new KartAvanzato(marca, numeroSeriale, contaChilometri, true, noleggioCorrente, tipoCambio);
            }
        }
        while(true);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(this.marca).append(" Numero Seriale: ").append(this.numeroSeriale).append(" Tipo cambio: ").append(this.tipoCambio)
            .append(" Noleggio Corrente: ").append(this.noleggioCorrente).append(" Tipo kart: ").append(this.getClass().getSimpleName())
            .append(" Freno a disco: ").append(this.getClass().getSimpleName().equals("KartAvanzato") ? ((KartAvanzato)this).isFrenoADisco() : "N/A")
            .append(" Chilometri percorsi: ").append(this.getClass().getSimpleName().equals("KartAvanzato") ? ((KartAvanzato)this).getContaChilometri() : "N/A");
        return sb.toString();
    }
    
    
   
}

