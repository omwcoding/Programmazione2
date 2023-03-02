import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta = -1;
        System.out.println("## Benvenuto nel programma di gestione noleggio kart!  ##");

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
                        Cliente nuovoCliente = Cliente.registraClienteDaTastiera(scanner);  //registra un nuovo cliente da tastiera
                        Cliente.salvaClientiSuFile(nuovoCliente, "Clienti.json");       //salva il cliente su file
                        System.out.println("Cliente registrato come: [ " + nuovoCliente + " ]"); //ci mostra il cliente registrato
                        System.out.println("Continuare? y/n");      //chiede se si vuole continuare
                        decisione = scanner.nextLine().toLowerCase();       //converte la stringa in minuscolo
                    }
                    break;
                
                case 2:

                    Cliente.mostraClientiRegistrati();  //mostra i clienti registrati richiamando il metodo mostraClientiRegistrati
                    break;

                case 3:

                    Noleggio.IntervalloDate intervallo = Noleggio.richiestaIntervalloDate(scanner);

                    System.out.println("Hai inserito le seguenti date:");
                    System.out.println("Data di inizio: " + intervallo.getDataInizio().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                    System.out.println("Data di fine: " + intervallo.getDataFine().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
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