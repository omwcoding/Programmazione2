public class Main {
    public static void main(String[] args) {
        Kart kartbase1 = new Kart("Ferrari", true, 1);
        KartAvanzato kartavanzato1 = new KartAvanzato("Suzuki", 3, true, 100);
        Kart kartmedio1 = new Kart("Yamaha", false, 4);
        Cliente cliente1 = new Cliente("Omar", "123456789", 5, "Balde", "Via Roma 1", "123456789");
        
        System.out.println("Kart 1: " + kartbase1.getMarca() + " " + kartbase1.getNumeroSeriale() + " " + kartbase1.isCambioManuale());
        System.out.println("Kart 2: " + kartavanzato1.getMarca() + " " + kartavanzato1.getNumeroSeriale() + " " + kartavanzato1.isCambioManuale() + " " + kartavanzato1.isFrenoADisco() + " " + kartavanzato1.getContachilometri());
        System.out.println("Kart 3: " + kartmedio1.getMarca() + " " + kartmedio1.getNumeroSeriale() + " " + kartmedio1.isCambioManuale());
        System.out.println("Cliente 1: " + cliente1.getnome() + " " + cliente1.getCodiceFiscale() + " " + cliente1.getnumeroMassimoKart() + " " + cliente1.getcognome() + " " + cliente1.getIndirizzo() + " " + cliente1.getTelefono());
    }
}
