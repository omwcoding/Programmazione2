/*Per identificare unicamente ogni cliente tramite il proprio codice fiscale, puoi usare il codice fiscale come chiave univoca per ciascun cliente. 
Potresti creare una mappa (ad esempio HashMap) che associ a ciascun codice fiscale un oggetto Cliente, in modo che ogni volta che si desidera accedere a un cliente, 
si possa cercare la sua informazione mediante il codice fiscale.
In questo modo, ogni volta che vuoi accedere a un cliente, puoi usare il metodo trovaCliente della classe ClienteController e passare come parametro 
il codice fiscale del cliente per ottenere un'istanza di Cliente corrispondente.
*/
import java.util.HashMap;

public class ClienteController {
    private HashMap<String, Cliente> clienti;

    public ClienteController() {
        this.clienti = new HashMap<>();
    }

    // Aggiungi un cliente all'hashmap
    public void aggiungiCliente(Cliente cliente) {
        this.clienti.put(cliente.getCodiceFiscale(), cliente);
    }

    // Trova un cliente dato il suo codice fiscale
    public Cliente trovaCliente(String codiceFiscale) {
        return this.clienti.get(codiceFiscale);
    }

    // Rimuovi un cliente dato il suo codice fiscale
    public Cliente rimuoviCliente(String codiceFiscale) {
        return this.clienti.remove(codiceFiscale);
    }

    // Verifica se un cliente esiste dato il suo codice fiscale
    public boolean clienteEsiste(String codiceFiscale) {
        return this.clienti.containsKey(codiceFiscale);
    }

    // Restituisci il numero totale di clienti
    public int numeroTotaleClienti() {
        return this.clienti.size();
    }

    // Restituisci tutti i clienti
    public HashMap<String, Cliente> getClienti() {
        return this.clienti;
    }

    // Restituisci tutti i clienti come array
    public Cliente[] getClientiArray() {
        return this.clienti.values().toArray(new Cliente[0]);
    }

}
