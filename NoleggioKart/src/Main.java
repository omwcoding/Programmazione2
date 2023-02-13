public class Main {
    public static void main(String[] args) {
        Kart k1 = new Kart("Kart1", true, 1);
        Kart k2 = new Kart("Kart2", false, 2);
        KartAvanzato k3 = new KartAvanzato("Kart3", 3, true, 100);
        KartAvanzato k4 = new KartAvanzato("Kart4", 4, false, 200);
        KartAvanzato k5 = new KartAvanzato("Kart5", 5, true, 300);
        KartAvanzato k6 = new KartAvanzato("Kart6", 6, false, 400);
        KartAvanzato k7 = new KartAvanzato("Kart7", 7, true, 500);
        KartAvanzato k8 = new KartAvanzato("Kart8", 8, false, 600);
        KartAvanzato k9 = new KartAvanzato("Kart9", 9, true, 700);
        KartAvanzato k10 = new KartAvanzato("Kart10", 10, false, 800);
        KartAvanzato k11 = new KartAvanzato("Kart11", 11, true, 900);
        KartAvanzato k12 = new KartAvanzato("Kart12", 12, false, 1000);
        KartAvanzato k13 = new KartAvanzato("Kart13", 13, true, 1100);
        KartAvanzato k14 = new KartAvanzato("Kart14", 14, false, 1200);
        KartAvanzato k15 = new KartAvanzato("Kart15", 15, true, 1300);
        KartAvanzato k16 = new KartAvanzato("Kart16", 16, false, 1400);
        KartAvanzato k17 = new KartAvanzato("Kart17", 17, true, 1500);
        KartAvanzato k18 = new KartAvanzato("Kart18", 18, false, 1600);
        KartAvanzato k19 = new KartAvanzato("Kart19", 19, true, 1700);
        KartAvanzato k20 = new KartAvanzato("Kart20", 20, false, 1800);
        
        System.out.print("Kart1: " + k1.getMarca() + " " + k1.getnumeroSeriale() + " " + k1.isCambioManuale());
    }
}
