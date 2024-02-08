import java.time.LocalDate;

public class KartAvanzato extends Kart {
    private int contaChilometri;
    private boolean frenoADisco;

    public KartAvanzato(String marca, int numeroSeriale, int contaChilometri, boolean frenoADisco, Noleggio noleggioCorrente, String tipoCambio, String tipoKart, LocalDate dataRegistrazione) {
        super(marca, numeroSeriale, "Manuale", noleggioCorrente, "Avanzato", dataRegistrazione);
        this.contaChilometri = contaChilometri;
        this.frenoADisco = frenoADisco;
        // eventuali inizializzazioni aggiuntive
    }

    public int getContaChilometri() {
        return contaChilometri;
    }

    public void setContaChilometri(int contaChilometri) {
        this.contaChilometri = contaChilometri;
    }

    public boolean isFrenoADisco() {
        return frenoADisco;
    }

    public void setFrenoADisco(boolean frenoADisco) {
        this.frenoADisco = frenoADisco;
    }

    @Override
    public double calcolaCostoNoleggio() {
        // Aggiungi qui la logica per calcolare il costo del noleggio per KartAvanzato
        // Ad esempio:
        double costoBase = 40.0; // Costo base del noleggio per KartAvanzato
        // Aggiungi eventuali costi aggiuntivi in base alle caratteristiche avanzate del kart
        return costoBase;
}
}