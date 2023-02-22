//import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int scelta = -1;

        while (scelta != 0){
            System.out.println("## Scegli un'opzione: ##");
            System.out.println("1. Inserisci uno o più nuovi clienti");
            System.out.println("2. Mostra tutti i clienti registrati");
            System.out.println("3. Mostra l'elenco dei kart acquistati in un intervallo di tempo specificato");
            System.out.println("4. Stampa su file l'elenco dei kart noleggiati da un cliente in un intervallo di tempo specificato");
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
                    String decisione = "y";
                
                    while (decisione.equals("y")){
                        Cliente nuovoCliente = Cliente.registraClienteDaTastiera(scanner);
                        Cliente.salvaClientiSuFile(nuovoCliente, "Clienti.json");
                        System.out.println("Cliente registrato come: [ " + nuovoCliente + " ]");
                        System.out.println("Continuare? y/n");
                        decisione = scanner.nextLine().toLowerCase();
                    }
                    break;
                
                case 2:
                    Cliente.mostraClientiRegistrati();
                    break;
                case 3:
                /* 
                    System.out.println("Inserisci la data di inizio nel formato YYYY-MM-DD:");
                    String dataInizioStr = scanner.nextLine();
                    LocalDate dataInizio = LocalDate.parse(dataInizioStr);
                
                    System.out.println("Inserisci la data di fine nel formato YYYY-MM-DD:");
                    String dataFineStr = scanner.nextLine();
                    LocalDate dataFine = LocalDate.parse(dataFineStr);
                
                */
                    // esegui l'opzione 3
                    break;
                case 4:
                    // esegui l'opzione 4
                    break;
                case 0:
                    System.out.println("Uscita dal programma...");
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }        
        }
    scanner.close();
    }
}