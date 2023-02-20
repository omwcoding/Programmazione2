import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class GestoreClienti {
    public static void mostraClientiRegistrati() {

        // leggi la lista dei clienti dal file binario e ordinala per nome
        List<Cliente> clientiLetti = new ArrayList<Cliente>();
        try {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream("C:\\Users\\Omar\\Desktop\\Coding\\Programmazione2\\NoleggioKart\\Clienti.bin"));
            while (true) {
                try {
                    Cliente cliente = (Cliente) reader.readObject();
                    clientiLetti.add(cliente);
                } catch (EOFException e) {
                    break;
                }
            }
            reader.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Errore durante la lettura da file: " + e.getMessage());
        }

        System.out.println("## Elenco clienti registrati: ##");
        // stampa la lista dei clienti letti ordinata per nome
        for (Cliente c : clientiLetti) {
            System.out.println(c);
        }
    }

}