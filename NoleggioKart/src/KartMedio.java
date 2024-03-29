import java.time.LocalDate;

public class KartMedio extends Kart {
    public KartMedio(String marca, int numeroSeriale, String tipoCambio, Noleggio noleggioCorrente, String tipoKart, LocalDate dataRegistrazione) {
        super(marca, numeroSeriale, "Automatico", noleggioCorrente, tipoKart, dataRegistrazione); // Aggiornato il costruttore per includere tipoKart
        // eventuali inizializzazioni aggiuntive
    }
    
    @Override
    public double calcolaCostoNoleggio() {
        // Aggiungi qui la logica per calcolare il costo del noleggio per KartMedio
        // Ad esempio:
        double costoBase = 30.0; // Costo base del noleggio per KartMedio
        return costoBase;
}
}