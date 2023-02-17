import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
 
public class ObjectIO {
 
    private static final String filepath="C:\\Users\\Omar\\Desktop\\Coding\\Programmazione2\\NoleggioKart\\Clienti.bin";
 
    public static void main(String args[]) {
 

    }
 
    public void writeObjectToFile(List<Cliente> clienti) {
            // Scrivi tutti i clienti presenti nella coda sul file
            try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(filepath))) {
                
                    writer.writeObject(clienti);
                
                System.out.println("Cliente aggiunto con successo.");
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    

    public Object readObjectFromFile(File file) throws IOException, ClassNotFoundException {
        Object result = null;
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            result = ois.readObject();
        }
        return result;
    }
        
    
}