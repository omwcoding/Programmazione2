
public class KartAvanzato extends Kart {
    private boolean frenoADisco = true;
    private int contaChilometri;

    public KartAvanzato(String marca, int numeroSeriale, boolean frenoADisco, int contaChilometri) {
        super(marca, true, numeroSeriale);
        this.frenoADisco = frenoADisco;
        this.contaChilometri = contaChilometri;
    }

    public boolean isFrenoADisco() {
        return frenoADisco;
    }

    public int getContachilometri() {
        return contaChilometri;
    }

    public int setContachilometri(){
        return this.contaChilometri;
    }
    
}