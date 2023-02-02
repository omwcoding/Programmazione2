import java.util.Date;

public class NoleggioKart {
    private Kart kart;
    private Cliente cliente;
    private Date dataInizio;
    private Date dataFine;
    private double costo;
    private double penale;

    public NoleggioKart(Kart kart, Cliente cliente, Date dataInizio, Date dataFine, double costo, double penale) {
        this.kart = kart;
        this.cliente = cliente;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.costo = costo;
        this.penale = penale;
    }

    // metodi getter per accedere alle proprietà del noleggio
    public Kart getKart() {
        return kart;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Date getDataInizio() {
        return dataInizio;
    }
    public Date getDataFine() {
        return dataFine;
    }
    public double getCosto() {
        return costo;
    }
    public double getPenale() {
        return penale;
    }
}
