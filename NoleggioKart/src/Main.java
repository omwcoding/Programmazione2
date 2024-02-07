import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto nel programma di gestione NoleggioKart!");

        boolean continua = true;
        do {
            continua = GestoreMenu.menu(scanner);
        } while (continua);

        scanner.close();
    }
}
