public class GestoreClienti {
    
    public void mostraClientiRegistrati() {
        System.out.println("Elenco clienti registrati:");
        System.out.println();
        
        for (Cliente cliente : listaClienti) {
            System.out.println(cliente.getNome() + " " + cliente.getCognome());
            System.out.println("Codice fiscale: " + cliente.getCodiceFiscale());
            System.out.println("Numero massimo di kart noleggiabili: " + cliente.getNumeroMassimoKart());
            System.out.println("Indirizzo: " + cliente.getIndirizzo());
            System.out.println("Telefono: " + cliente.getTelefono());
            System.out.println();
        }
    }
    
}
