package CopiareOggetti;

public class Main {

    public static void main(String[] args){

        Persona persona1 = new Persona("Omar","Balde");
        Persona persona2 = new Persona("Riccardo", "Costantini");
        
        //facendo così non copiamo l'oggetto ma solo il riferimento
        //viene assegnato il riferimento di persona2 a persona1 quindi avranno lo stesso indirizzo
       // persona2=persona1;

       // facendo così invece copiamo l'oggetto
       //l'indirizzo di persona2 è diverso da persona1
       persona2.copy(persona1);


       persona1.setNome("Giovanni");

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println();
        System.out.println(persona1.getNome());
        System.out.println(persona1.getCognome());
        System.out.println();
        System.out.println(persona2.getNome());
        System.out.println(persona2.getCognome());
    }
    
}
