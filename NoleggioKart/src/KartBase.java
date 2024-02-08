import java.time.LocalDate;

public class KartBase extends Kart {
    public KartBase(String marca, int numeroSeriale, String tipoCambio, Noleggio noleggioCorrente, String tipoKart, LocalDate dataRegistrazione) {
        super(marca, numeroSeriale, "Manuale", noleggioCorrente, tipoKart, dataRegistrazione); // Aggiornato il costruttore per includere tipoKart
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
