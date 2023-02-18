import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestoreKart {
    @SuppressWarnings("unchecked")
    public static void mostraKartNoleggiatiInIntervallo(LocalDate dataInizio, LocalDate dataFine) {
        //leggi la lista dei kart nolleggiati dal file binario
        List<Kart> kartLetti = new ArrayList<Kart>();
        try {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream("C:\\Users\\Omar\\Desktop\\Coding\\Programmazione2\\NoleggioKart\\KartNoleggiati.bin"));
            kartLetti = (List<Kart>) reader.readObject();
            reader.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Errore durante la lettura da file: " + e.getMessage());
        }
        //ordina la lista dei kart noleggiati in base al tipo di kart (base, medio, avanzato)
        //e nel caso di kart dello stesso tipo in base al costo del noleggio


        //stampa la lista dei kart noleggiati ordinata
    
 
   }
   
}