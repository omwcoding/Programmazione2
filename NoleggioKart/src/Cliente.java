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

    public String getnome() {
        return nome;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public int getnumeroMassimoKart() {
        return numeroMassimoKart;
    }
    public String getcognome() {
        return cognome;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public String getTelefono() {
        return telefono;
    }
    
}