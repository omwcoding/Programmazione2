public class KartAvanzato extends Kart {
    private int contaChilometri;
    private boolean frenoADisco;

    public KartAvanzato(String marca, int numeroSeriale, String tipoCambio, int contaChilometri, boolean frenoADisco, Noleggio noleggioCorrente) {
        super(marca, numeroSeriale, tipoCambio, noleggioCorrente);
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