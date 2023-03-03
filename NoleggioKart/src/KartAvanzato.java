public class KartAvanzato extends Kart {
    private int contaChilometri;
    private boolean frenoADisco;

    public KartAvanzato(String marca, int numeroSeriale, int contaChilometri, boolean frenoADisco, Noleggio noleggioCorrente, String tipoCambio) {
        super(marca, numeroSeriale, "Manuale", noleggioCorrente);
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
}