import java.time.LocalDate;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        // Crea un'istanza di GsonBuilder
        GsonBuilder gsonBuilder = new GsonBuilder();

        // Registra l'adattatore LocalDateAdapter con GsonBuilder
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateAdapter());

        // Crea un'istanza di Gson con GsonBuilder
        Gson gson = gsonBuilder.create();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto nel programma di gestione NoleggioKart!");

        boolean continua = true;
        do {
            continua = GestoreMenu.menu(scanner);
        } while (continua);

        scanner.close();
    }
}
