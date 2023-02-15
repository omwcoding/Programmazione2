package Casting;
// Casting: è il processo di conversione di un tipo di dato in un altro tipo di dato
// esistono due tipi di casting:
// 1. Casting implicito: è quando il compilatore Java converte automaticamente un tipo di dato in un altro tipo di dato più ampio
// 2. Casting esplicito: è quando il programmatore Java converte manualmente un tipo di dato in un altro tipo di dato più ristretto
public class Main {

    public static void main(String[] args){

        // Casting implicito
        //variabile double dichiarata con valore int
        double x = 9;
        System.out.println(x);

        // Casting esplicito
        //variabile int dichiarata con valore double
        int y = (int) 9.78;
        System.out.println(y);

    }
    
}
