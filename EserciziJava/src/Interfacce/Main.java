package Interfacce;
/*  Aggiungiamo funzionalità extra alle nostre classi
 *  Creiamo un'interfaccia che definisce un metodo
 *  che verrà poi implementato dalle classi che la
 *  implementano
 */


public class Main {
    
    public static void main(String[] args){
        Leone leone = new Leone();
        Gazzella gazzella = new Gazzella();
        Pesce pesce = new Pesce();

        gazzella.scappa();
        leone.caccia();
        pesce.caccia();
        pesce.scappa();
    }
}