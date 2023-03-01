import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Noleggio {
    private Kart kartNoleggiato;
    private Cliente clienteAssociato;
    private int penale;
    private Date dataInizioNoleggio;
    private Date dataFineNoleggio;
    private Date dataConsegnaNoleggio; //?? in caso di consegna in ritardo potremmo usare questa data per calcolare la penale
    
    public Noleggio(Kart kartNoleggiato, Cliente clienteAssociato, int penale, Date dataInizioNoleggio, Date dataFineNoleggio) {
        this.kartNoleggiato = kartNoleggiato;
        this.clienteAssociato = clienteAssociato;
        this.penale = penale;
        this.dataInizioNoleggio = dataInizioNoleggio;
        this.dataFineNoleggio = dataFineNoleggio;
    }
    
    public Kart getKartNoleggiato() {
        return kartNoleggiato;
    }

    public void setKartNoleggiato(Kart kartNoleggiato) {
        this.kartNoleggiato = kartNoleggiato;
    }

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public void setClienteAssociato(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }

    public int getPenale() {
        return penale;
    }

    public void setPenale(int penale) {
        this.penale = penale;
    }

    public Date getDataInizioNoleggio() {
        return dataInizioNoleggio;
    }

    public void setDataInizioNoleggio(Date dataInizioNoleggio) {
        this.dataInizioNoleggio = dataInizioNoleggio;
    }

    public Date getDataFineNoleggio() {
        return dataFineNoleggio;
    }

    public void setDataFineNoleggio(Date dataFineNoleggio) {
        this.dataFineNoleggio = dataFineNoleggio;
    }

    public Date getDataConsegnaNoleggio() {
        return dataConsegnaNoleggio;
    }

    public void setDataConsegnaNoleggio(Date dataConsegnaNoleggio) {
        this.dataConsegnaNoleggio = dataConsegnaNoleggio;
    }


    /* 
    public void noleggiaKart(Kart kart, Cliente cliente, Date dataInizioNoleggio, Date dataFineNoleggio) {
        Noleggio noleggio = new Noleggio(kart, cliente, penale, dataInizioNoleggio, dataFineNoleggio);
        kart.setNoleggioCorrente(noleggio);
    }
    */

    public static LocalDate[] registraDateDaTastiera(){
        Scanner scanner = new Scanner(System.in); 
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");  //formato data
        
        LocalDate dataInizio = null;
        while (dataInizio == null) {
            System.out.println("Inserisci la data di inizio nel formato GG-MM-AAAA:");
            String input = "";
            try {
                input = scanner.nextLine().trim().replace(" ", "-");  //rimuove gli spazi e sostituisce gli spazi con un trattino
            } catch (NoSuchElementException e) {
                System.out.println("Nessuna linea disponibile. Riprova.");
                continue;
            }
            try {
                LocalDate parsedDate = LocalDate.parse(input, outputFormatter);  //converte la stringa in data
                if (parsedDate.isAfter(LocalDate.now())) {
                    System.out.println("La data di inizio deve essere precedente o uguale alla data odierna!");
                    continue;
                }
                dataInizio = parsedDate;    //assegna la data di inizio
            } catch (DateTimeParseException e) {
                System.out.println("Formato data non valido. Riprova!");
            }
        }
        
        LocalDate dataFine = null;
        while (dataFine == null) {
        System.out.println("Inserisci la data di fine nel formato GG-MM-AAAA:");
            String input = null;
            try {
                input = scanner.nextLine().trim().replace(" ", "-");
            } catch (NoSuchElementException e) {
                System.out.println("Non è stato inserito alcun valore.");
                continue;
            }
            if (input.isEmpty()) {
                System.out.println("Non è stato inserito alcun valore.");
                continue;
            }
            try {
                LocalDate parsedDate = LocalDate.parse(input, outputFormatter);
                if (parsedDate.isBefore(dataInizio)) {
                    System.out.println("La data di fine deve essere successiva o uguale alla data di inizio!");
                    continue;
                }
                dataFine = parsedDate;
            } catch (DateTimeParseException e) {
                System.out.println("Formato data non valido. Riprova!");
            }
        }
        scanner.close();
        LocalDate[] dateArray = {dataInizio, dataFine};
        return dateArray;
    }
}

