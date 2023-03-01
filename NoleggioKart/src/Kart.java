public abstract class Kart {
    private String marca;
    private int numeroSeriale;
    private String tipoCambio;
    private Noleggio noleggioCorrente;

    public Kart(String marca, int numeroSeriale,  String tipoCambio, Noleggio noleggioCorrente) {
        this.marca = marca;
        this.numeroSeriale = numeroSeriale;
        this.tipoCambio = tipoCambio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroSeriale() {
        return numeroSeriale;
    }

    public void setNumeroSeriale(int numeroSeriale) {
        this.numeroSeriale = numeroSeriale;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Noleggio getNoleggioCorrente() {
        return noleggioCorrente;
    }

    public void setNoleggioCorrente(Noleggio noleggioCorrente) {
        this.noleggioCorrente = noleggioCorrente;
    }
    


    //metodo per registrare un kart da tastiera
    /*
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
 */   
}

