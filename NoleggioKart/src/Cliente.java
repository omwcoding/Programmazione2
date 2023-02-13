public class Cliente {
    private String nome;
    private String codiceFiscale;
    private int numeroMassimoKart;
    private String cognome;
    private String indirizzo;
    private String telefono;
    private String email;

    public Cliente(String nome, String codiceFiscale, int numeroMassimoKart, String cognome, String indirizzo, String telefono, String email) {
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.numeroMassimoKart = numeroMassimoKart;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.email = email;
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
    public String getEmail() {
        return email;
    }
    
}