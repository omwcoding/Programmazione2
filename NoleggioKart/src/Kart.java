import java.util.Scanner;

public class Kart {
    private String marca;
    private boolean cambioManuale;
    private int numeroSeriale;

    public Kart(String marca, boolean cambioManuale, int numeroSeriale) {
        this.marca = marca;
        this.cambioManuale = cambioManuale;
        this.numeroSeriale = numeroSeriale;
    }

    public class KartBase extends Kart {
        public KartBase(String marca, int numeroSeriale) {
            super(marca, true, numeroSeriale);
        }
    }

    public class KartMedio extends Kart {
        public KartMedio(String marca, int numeroSeriale) {
            super(marca, false, numeroSeriale);
        }
    }

    //metodi getter e setter
    public String getMarca() {
        return marca;
    }

    public String setMarca(){
        return this.marca;
    }

    public boolean isCambioManuale() {
        return cambioManuale;
    }

    public int getNumeroSeriale() {
        return numeroSeriale;
    }

    public int setNumeroSeriale(){
        return this.numeroSeriale;
    }

    //metodo per registrare un kart da tastiera
    public Kart registraKartDaTastiera(Scanner scanner) {
        System.out.println("Inserisci la marca del kart");
        String marca = scanner.nextLine();

        System.out.println("Inserisci il numero seriale del kart");
        int numeroSeriale = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Inserisci il tipo di kart (1 per base, 2 per medio, 3 per avanzato)");
        int tipoKart = scanner.nextInt();
        scanner.nextLine();

        switch (tipoKart) {
            case 1:
                return new KartBase(marca, numeroSeriale);
            case 2:
                return new KartMedio(marca, numeroSeriale);
            case 3:
                System.out.println("Inserisci il numero di chilometri percorsi");
                int contaChilometri = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Il kart ha freno a disco? (1 per true/2 per false)");
                boolean frenoADisco = scanner.nextBoolean();
                
                return new KartAvanzato(marca, numeroSeriale, frenoADisco, contaChilometri);
            default:
                return null;
        }
    }


    
   
}

