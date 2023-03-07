import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta = -1;
        System.out.println("## Benvenuto nel programma di gestione noleggio kart!  ##");

        while (scelta != 0){
            System.out.println("## Scegli un'opzione: ##");
            System.out.println("1. Inserisci un nuovo cliente (o più)");
            System.out.println("2. Mostra tutti i clienti registrati");
            System.out.println("3. Mostra l'elenco dei kart acquistati in un intervallo di tempo specificato");
            System.out.println("4. Stampa su file l'elenco dei kart noleggiati da un cliente in un intervallo di tempo specificato");
            System.out.println("5. [ Funzionalità extra ]");
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
                //FATTO: Inserisci un nuovo cliente (o più)
                case 1:

                    Cliente.richiestaDatiCliente();
                    break;
                
                case 2:

                    Cliente.mostraClientiRegistrati();  //mostra i clienti registrati richiamando il metodo mostraClientiRegistrati
                    System.out.println("Tornando al menu principale...");
                    break;
                
                //FARE: Mostra l'elenco dei kart acquistati in un intervallo di tempo specificato
                case 3:

                    Noleggio.IntervalloDate intervallo = Noleggio.richiestaIntervalloDate(scanner);

                    System.out.println("Hai inserito le seguenti date:");
                    System.out.println("Data di inizio: " + intervallo.getDataInizio().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                    System.out.println("Data di fine: " + intervallo.getDataFine().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

                    //Leggi lista kart noleggiati dal file
                    

                    //Filtra lista kart noleggiati per intervallo di tempo specificato
                    //Stampa su schermo la lista filtrata

                    break;
                

                //FARE: Stampa su file l'elenco dei kart noleggiati da un cliente in un intervallo di tempo specificato
                case 4: 
                    
                    Noleggio.IntervalloDate intervallo2 = Noleggio.richiestaIntervalloDate(scanner);
                    //Leggi lista karat noleggiati
                    //Filtra lista kart noleggiati per cliente
                    //Filtra lista kart noleggiati per intervallo di tempo specificato
                    //Stampa su file la lista filtrata

                    break;
                
                case 5:
                    
                    //Registra un nuovo kart da tastiera
                    //Vedere Kart disponibili(non noleggiati)?
                    //Modificare cliente esistente (eliminare probabilmente inutile come funzione)
                    //Eliminare Kart (magari si rompono o altro)
                    //Assegnare Kart ad un cliente (effettivo noleggio)
                    //...

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