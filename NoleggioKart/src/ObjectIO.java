import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectIO {
 
    private static final String filepath="C:\\Users\\Omar\\Desktop\\Coding\\Programmazione2\\NoleggioKart\\Clienti.bin";
 
    public static void main(String args[]) {
 

    }
 
    public void writeObjectToFile(List<Cliente> clienti) {
        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(filepath))) {
            writer.writeObject(clienti);
            System.out.println("Clienti aggiunti con successo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    

    public List<Cliente> readObjectFromFile(File file) throws IOException, ClassNotFoundException {
        List<Cliente> result = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                try {
                    Cliente cliente = (Cliente) ois.readObject();
                    result.add(cliente);
                } catch (EOFException e) {
                    break;
                }
            }
        }
        return result;
    }
    
        
    
}