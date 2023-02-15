package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args){

        File file = new File("prova.txt");

        //verifichiamo se il file esiste
        if(file.exists()){
            System.out.println("Il file esiste");
            System.out.println(file.getPath());
            System.out.println("Il path esatto e': " +file.getAbsoluteFile());
            System.out.println("È un file? " +file.isFile());
            //file.delete();
        }
        else{
            System.out.println("Il file non esiste");
        }
        
        try {
            FileWriter writer = new FileWriter("prova.txt");
            //sovrascrive tutto ciò che c'è scritto nel file
            writer.write("Ciao sono Omar \nSto imparando Java\n");
            //aggiunge testo alla fine del file
            writer.append("Bel file\n");
            //chiudiamo la stream del writer
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader("prova.txt");
            int data = reader.read();
            System.out.println("Il contenuto del file è:");
            while(data!=-1){
                System.out.print((char)data);
                data = reader.read();
            }
            //chiudi la stream del reader
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
