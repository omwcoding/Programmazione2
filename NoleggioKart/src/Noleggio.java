import java.util.Date;

public class Noleggio {
    private Kart kart;
    private Cliente cliente;
    private Date dataInizio;
    private Date dataFine;
    private double costo;
    private double penale;

    public Noleggio(Kart kart, Cliente cliente, Date dataInizio, Date dataFine, double costo, double penale) {
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
    // metodi setter per modificare le proprietà del noleggio
    public void setKart(Kart kart) {
        this.kart = kart;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }
    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public void setPenale(double penale) {
        this.penale = penale;
    }
    
}
