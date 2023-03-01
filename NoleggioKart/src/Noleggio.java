import java.util.Date;

public class Noleggio {
    private Kart kartNoleggiato;
    private Cliente clienteAssociato;
    private int penale;
    private Date dataInizioNoleggio;
    private Date dataFineNoleggio;
    
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



    public void noleggiaKart(Kart kart, Cliente cliente, Date dataInizioNoleggio, Date dataFineNoleggio) {
        Noleggio noleggio = new Noleggio(kart, cliente, penale, dataInizioNoleggio, dataFineNoleggio);
        kart.setNoleggioCorrente(noleggio);
    }
}
