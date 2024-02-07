import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta = -1;
        System.out.println("## Benvenuto nel programma di gestione NoleggioKart!  ##");

        while (scelta != 0){
            System.out.println("## Scegli un'opzione: ##");
            System.out.println("1. Inserisci un nuovo cliente (o più)");
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
                //Terminato: Registra con successo un cliente

                    Cliente.richiestaDatiCliente();
                    break;

                case 2:
                //Terminato: Mostra tutti i clienti registrati su file
                //TODO: Aggiungere controllo se non ci sono clienti registrati

                    Cliente.mostraClientiRegistrati();  //mostra i clienti registrati richiamando il metodo mostraClientiRegistrati
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
                    
                    //Noleggio.IntervalloDate intervallo2 = Noleggio.richiestaIntervalloDate(scanner);
                    //Leggi lista kart noleggiati
                    //Filtra lista kart noleggiati per cliente
                    //Filtra lista kart noleggiati per intervallo di tempo specificato
                    //Stampa su file la lista filtrata

                    break;

                case 0:
                    System.out.println("Grazie per aver utilizzato NoleggioKart! Uscita in corso...");
                    break;

                default:
                    System.out.println("Scelta non valida!");
            }        
        }
    scanner.close(); // chiudi lo scanner per evitare memory leak
    }
}