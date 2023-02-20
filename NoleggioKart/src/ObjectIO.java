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
        try {
            File file = new File(filepath);
            FileOutputStream fos = new FileOutputStream(file, true); // true indica che i dati vanno scritti in append
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(clienti);
            oos.close();
            fos.close();
            System.out.println("Dati scritti correttamente su file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    @SuppressWarnings("unchecked")
    public static List<Cliente> readObjectFromFile(String fileName) {
        List<?> objectList = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            objectList = (List<?>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (List<Cliente>) objectList; // Suppress warning with @SuppressWarnings("unchecked")
    }
     
}