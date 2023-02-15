package Interfacce;

public class Pesce implements preda, predatore {
    
        @Override
        public void scappa() {
            System.out.println("Il pesce piccolo scappa");
        }
    
        @Override
        public void caccia() {
            System.out.println("Il pesce grosso caccia");
        }
    
}
