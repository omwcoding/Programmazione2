import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestoreMenu {
    public static boolean menu(Scanner scanner) {
        System.out.println("## Scegli un'opzione: ##");
        System.out.println("1. Inserisci un nuovo cliente (o più)");
        System.out.println("2. Mostra tutti i clienti registrati");
        System.out.println("3. Mostra l'elenco dei kart acquistati in un intervallo di tempo specificato");
        System.out.println("4. Stampa su file l'elenco dei kart noleggiati da un cliente in un intervallo di tempo specificato");
        System.out.println("0. Esci dal programma");
    
        int scelta = -1;
        try {
            scelta = scanner.nextInt();
            scanner.nextLine();  // pulisci il buffer
        } catch (Exception e) {
            System.out.println("Inserisci un numero valido!");
            scanner.nextLine();  // pulisci il buffer
        }

        switch (scelta) {
            case 1:
                Cliente.richiestaDatiCliente();
                break;

            case 2:
                Cliente.mostraClientiRegistrati();
                System.out.println("Tornando al menu principale...");
                break;
            
            case 3:
            //TODO: Mostra l'elenco dei kart acquistati in un intervallo di tempo specificato

                Noleggio.IntervalloDate intervallo = Noleggio.richiestaIntervalloDate(scanner);
                System.out.println("Hai inserito le seguenti date:");
                System.out.println("Data di inizio: " + intervallo.getDataInizio().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                System.out.println("Data di fine: " + intervallo.getDataFine().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

                //Leggi lista kart noleggiati dal file
                //Filtra lista kart noleggiati per intervallo di tempo specificato
                //Stampa su schermo la lista filtrata
                break;
                

            case 4: 
            //TODO: Stampa su file l'elenco dei kart noleggiati da un cliente in un intervallo di tempo specificato
                
                //Richiedi dati cliente 
                //Fare un metodo per richiedere i dati del cliente (basandoci su CODICE FISCALE?)

                //Richiedi intervallo di tempo
                Noleggio.IntervalloDate intervallo2 = Noleggio.richiestaIntervalloDate(scanner);
                System.out.println("Hai inserito le seguenti date:");
                System.out.println("Data di inizio: " + intervallo2.getDataInizio().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                System.out.println("Data di fine: " + intervallo2.getDataFine().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                
                //Leggi lista kart noleggiati
                //Filtra lista kart noleggiati per cliente
                //Filtra lista kart noleggiati per intervallo di tempo specificato
                //Stampa su file la lista filtrata
                break;

            case 0:
                System.out.println("Grazie per aver utilizzato NoleggioKart! Uscita in corso...");
                return false;

            default:
                System.out.println("Scelta non valida!");
        }        

        return true;
    }
}
