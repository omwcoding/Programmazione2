public class Main {
    public static void main(String[] args) {
        Kart kartbase1 = new Kart("Ferrari", true, 1);
        KartAvanzato kartavanzato1 = new KartAvanzato("Suzuki", 3, true, 100);
        KartMedio kartmedio1 = new KartMedio("Yamaha", 4);
        
        System.out.println("Kart 1: " + kartbase1.getMarca() + " " + kartbase1.getnumeroSeriale() + " " + kartbase1.isCambioManuale());
        System.out.println("Kart 2:" + kartavanzato1.getMarca() + " " + kartavanzato1.getnumeroSeriale() + " " + kartavanzato1.isCambioManuale() + " " + kartavanzato1.isFrenoADisco() + " " + kartavanzato1.getContachilometri());
        System.out.println("Kart 3:" + kartmedio1.getMarca() + " " + kartmedio1.getnumeroSeriale() + " " + kartmedio1.isCambioManuale());
    }
}
