public class KartBase extends Kart {
    public KartBase(String marca, int numeroSeriale, String tipoCambio, Noleggio noleggioCorrente) {
        super(marca, numeroSeriale, "Manuale", noleggioCorrente);
        // eventuali inizializzazioni aggiuntive
    }
    
    @Override
    public double calcolaCostoNoleggio() {
        // Aggiungi qui la logica per calcolare il costo del noleggio per KartBase
        // Ad esempio:
        double costoBase = 20.0; // Costo base del noleggio per KartBase
        return costoBase;
    }
}
