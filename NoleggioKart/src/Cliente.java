import java.util.Scanner;

public class Cliente {
    private String nome;
    private String codiceFiscale;
    private int numeroMassimoKart = 5; //m numero da scegliere
    private String cognome;
    private String indirizzo;
    private String telefono;

    public Cliente(String nome, String codiceFiscale, int numeroMassimoKart, String cognome, String indirizzo, String telefono) {
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.numeroMassimoKart = numeroMassimoKart;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public int getNumeroMassimoKart() {
        return numeroMassimoKart;
    }
    public String getCognome() {
        return cognome;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public String getTelefono() {
        return telefono;
    }

    public static Cliente registraClienteDaTastiera() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome del cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci il cognome del cliente: ");
        String cognome = scanner.nextLine();

        System.out.print("Inserisci il codice fiscale del cliente: ");
        String codiceFiscale = scanner.nextLine();

        System.out.print("Inserisci il numero massimo di kart che il cliente può noleggiare: ");
        int numeroMassimoKart = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Inserisci l'indirizzo del cliente: ");
        String indirizzo = scanner.nextLine();

        System.out.print("Inserisci il numero di telefono del cliente: ");
        String telefono = scanner.nextLine();
        
        scanner.close();
        return new Cliente(nome, cognome, numeroMassimoKart, codiceFiscale, indirizzo, telefono);
    }
    
}