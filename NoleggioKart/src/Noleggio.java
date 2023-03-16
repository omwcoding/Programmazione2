import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;
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
    public static IntervalloDate richiestaIntervalloDate(Scanner scanner) {
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataInizio = null;
        LocalDate dataFine = null;
        while (dataInizio == null || dataFine == null) {
            if (dataInizio == null) {
                System.out.println("Inserisci la data di inizio nel formato GG-MM-AAAA:");
                String input = scanner.nextLine().trim().replace(" ", "-");
                try {
                    LocalDate parsedDate = LocalDate.parse(input, outputFormatter);
                    if (parsedDate.isAfter(LocalDate.now())) {
                        System.out.println("La data di inizio deve essere uguale o minore alla data corrente.");
                        continue;
                    }
                    dataInizio = parsedDate;
                } catch (DateTimeParseException e) {
                    System.out.println("Formato data non valido. Riprova.");
                }
            }
            if (dataFine == null) {
                System.out.println("Inserisci la data di fine nel formato GG-MM-AAAA:");
                String input = scanner.nextLine().trim().replace(" ", "-");
                try {
                    LocalDate parsedDate = LocalDate.parse(input, outputFormatter);
                    if (parsedDate.isBefore(dataInizio)) {
                        System.out.println("La data di fine deve essere successiva o uguale alla data di inizio.");
                        continue;
                    }
                    dataFine = parsedDate;
                } catch (DateTimeParseException e) {
                    System.out.println("Formato data non valido. Riprova.");
                }
            }
        }
        return new IntervalloDate(dataInizio, dataFine);
    }
    
    public static class IntervalloDate {
        private LocalDate dataInizio;
        private LocalDate dataFine;
    
        public IntervalloDate(LocalDate dataInizio, LocalDate dataFine) {
            this.dataInizio = dataInizio;
            this.dataFine = dataFine;
        }
    
        public LocalDate getDataInizio() {
            return dataInizio;
        }
    
        public LocalDate getDataFine() {
            return dataFine;
        }
    }

}

