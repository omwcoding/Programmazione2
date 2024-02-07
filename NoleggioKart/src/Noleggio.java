import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Noleggio {
    private Kart kartNoleggiato;
    private Cliente clienteAssociato;
    private int penale;
    private LocalDate dataInizioNoleggio;
    private LocalDate dataFineNoleggio;
    private LocalDate dataConsegnaNoleggio; //?? in caso di consegna in ritardo potremmo usare questa data per calcolare la penale
    
    public Noleggio(Kart kartNoleggiato, Cliente clienteAssociato, int penale, LocalDate dataInizioNoleggio, LocalDate dataFineNoleggio) {
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

    public LocalDate getDataInizioNoleggio() {
        return dataInizioNoleggio;
    }

    public void setDataInizioNoleggio(LocalDate dataInizioNoleggio) {
        this.dataInizioNoleggio = dataInizioNoleggio;
    }

    public LocalDate getDataFineNoleggio() {
        return dataFineNoleggio;
    }

    public void setDataFineNoleggio(LocalDate dataFineNoleggio) {
        this.dataFineNoleggio = dataFineNoleggio;
    }

    public LocalDate getDataConsegnaNoleggio() {
        return dataConsegnaNoleggio;
    }

    public void setDataConsegnaNoleggio(LocalDate dataConsegnaNoleggio) {
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

    public double calcolaCostoNoleggio() {
    double costo = 0.0;
    
    if (kartNoleggiato != null && dataInizioNoleggio != null && dataFineNoleggio != null) {
        // Calcola la durata del noleggio in giorni
        long durataNoleggio = ChronoUnit.DAYS.between(dataInizioNoleggio, dataFineNoleggio);
        
        // Ottieni il costo del noleggio del kart
        double costoKart = kartNoleggiato.calcolaCostoNoleggio();
        
        // Calcola il costo totale del noleggio
        costo = costoKart * durataNoleggio;
    }
    
    return costo;
    }
}

