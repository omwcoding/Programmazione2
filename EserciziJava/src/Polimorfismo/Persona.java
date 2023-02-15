package Polimorfismo;

public class Persona {
    
    private String nome;
    private String cognome;

    Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
    //getter pubblico per il campo nome
    //il getter è un metodo che restituisce il valore di un campo privato
    public String getNome() {
        return nome;
    }
    //setter pubblico per il campo nome
    //il setter è un metodo che modifica il valore di un campo privato
    public void setNome(String nome) {
        this.nome = nome;
    }
    //getter pubblico per il campo cognome
    public String getCognome() {
        return cognome;
    }
    //setter pubblico per il campo cognome
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    public void saluta(){
        System.out.println("Ciao");
    }
}