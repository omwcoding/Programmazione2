import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class GestoreClienti {
    public static void mostraClientiRegistrati() {
        List<Cliente> clientiLetti = new ArrayList<Cliente>();
        try {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream("C:\\Users\\Omar\\Desktop\\Coding\\Programmazione2\\NoleggioKart\\Clienti.bin"));
            clientiLetti = (List<Cliente>) reader.readObject();
            reader.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Errore durante la lettura da file: " + e.getMessage());
        }
    
        System.out.println("## Elenco clienti registrati: ##");
        for (Cliente c : clientiLetti) {
            System.out.println(c);
        }
    }
    

}