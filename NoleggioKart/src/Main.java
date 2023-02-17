import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int scelta = -1;

        while (scelta != 0){
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Inserisci uno o più clienti");
            System.out.println("2. Mostra tutti i clienti registrati");
            System.out.println("3. Opzione 3");
            System.out.println("0. Esci dal programma");
        

            try {
                scelta = scanner.nextInt();
                scanner.nextLine();  // pulisci il buffer
                } catch (Exception e) {
                    System.out.println("Inserisci un numero valido!");
                    scanner.nextLine();  // pulisci il buffer
                    continue;
            }

            switch (scelta) {
                
                case 1:
                    List<Cliente> clienti = new ArrayList<Cliente>();
                    String decisione = "y";
                
                    while (decisione.equals("y")){
                        Cliente nuovo = Cliente.registraClienteDaTastiera(scanner);
                        clienti.add(nuovo);
                        System.out.println("Continuare? y/n");
                        decisione = scanner.nextLine().toLowerCase();
                    }
                    
                    ObjectIO objectIO = new ObjectIO();
                    objectIO.writeObjectToFile(clienti);
                    break;
                
                case 2:
                    GestoreClienti.mostraClientiRegistrati();
                    break;
                case 3:
                    // esegui l'opzione 3
                    break;
                case 0:
                    System.out.println("Uscita dal programma...");
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }












        
        
        
        /*Kart kartbase1 = new Kart("Ferrari", true, 1);
        KartAvanzato kartavanzato1 = new KartAvanzato("Suzuki", 3, true, 100);
        Kart kartmedio1 = new Kart("Yamaha", false, 4);
        */

        
        }
    scanner.close();
    }
}