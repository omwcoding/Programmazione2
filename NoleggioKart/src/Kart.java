/*Classe che rappresenta un kart con le seguenti proprietà:
- marca
- tipo di cambio
- codice identificativo
Se il Kart è modello base, il tipo di cambio è sempre manuale (valore true). 
Se il Kart è modello medio, il tipo di cambio è sempre automatico (valore false).
Se il Kart è modello avanzato (sottoclasse), avrà le caratteristiche del modello base
e in più avrà delle nuove variabili di istanza: contachilometri e freno a disco.
*/
public class Kart {
    private String marca;
    private boolean cambioManuale = true;
    private int numeroSeriale;

    public Kart(String marca, boolean cambioManuale, int numeroSeriale) {
        this.marca = marca;
        this.cambioManuale = cambioManuale;
        this.numeroSeriale = numeroSeriale;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isCambioManuale() {
        return cambioManuale;
    }

    public int getnumeroSeriale() {
        return numeroSeriale;
    }
}

