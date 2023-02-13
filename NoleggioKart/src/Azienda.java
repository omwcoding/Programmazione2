import java.util.List;

public class Azienda {
  private List<Kart> kartsDisponibili;
  private List<Noleggio> noleggiEffettuati;
  private List<Cliente> clientiRegistrati;

  public Azienda(List<Kart> kartsDisponibili, List<Noleggio> noleggiEffettuati, List<Cliente> clientiRegistrati) {
    this.kartsDisponibili = kartsDisponibili;
    this.noleggiEffettuati = noleggiEffettuati;
    this.clientiRegistrati = clientiRegistrati;
  }

  public List<Kart> getKartsDisponibili() {
    return kartsDisponibili;
  }

  public List<Noleggio> getNoleggiEffettuati() {
    return noleggiEffettuati;
  }

  public List<Cliente> getClientiRegistrati() {
    return clientiRegistrati;
  }

  public void setKartsDisponibili(List<Kart> kartsDisponibili) {
    this.kartsDisponibili = kartsDisponibili;
  }

  public void setNoleggiEffettuati(List<Noleggio> noleggiEffettuati) {
    this.noleggiEffettuati = noleggiEffettuati;
  }

  public void setClientiRegistrati(List<Cliente> clientiRegistrati) {
    this.clientiRegistrati = clientiRegistrati;
  }
}
