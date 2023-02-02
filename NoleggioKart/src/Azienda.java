import java.util.List;

public class Azienda {
  private List<Kart> kartsDisponibili;
  private List<NoleggioKart> noleggiEffettuati;
  private List<Cliente> clientiRegistrati;

  public Azienda(List<Kart> kartsDisponibili, List<NoleggioKart> noleggiEffettuati, List<Cliente> clientiRegistrati) {
    this.kartsDisponibili = kartsDisponibili;
    this.noleggiEffettuati = noleggiEffettuati;
    this.clientiRegistrati = clientiRegistrati;
  }

  public List<Kart> getKartsDisponibili() {
    return kartsDisponibili;
  }

  public List<NoleggioKart> getNoleggiEffettuati() {
    return noleggiEffettuati;
  }

  public List<Cliente> getClientiRegistrati() {
    return clientiRegistrati;
  }

  public void setKartsDisponibili(List<Kart> kartsDisponibili) {
    this.kartsDisponibili = kartsDisponibili;
  }

  public void setNoleggiEffettuati(List<NoleggioKart> noleggiEffettuati) {
    this.noleggiEffettuati = noleggiEffettuati;
  }

  public void setClientiRegistrati(List<Cliente> clientiRegistrati) {
    this.clientiRegistrati = clientiRegistrati;
  }
}
