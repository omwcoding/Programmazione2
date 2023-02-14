package OOP;

public class KeywordFinalandStatic {
    public static void main(String[] args){
        final int prova = 5; //questa variabile non può essere modificata (costante)
        //prova = 10; ci da errore per il final
        System.out.println(prova);

        Persona persona1 = new Persona("Mario", "Rossi");
        Persona persona2 = new Persona("Luca", "Verdi");
        Persona persona3 = new Persona("Giuseppe", "Bianchi");
        //System.out.println(persona1);
        System.out.println("numero pesone: " + Persona.numeroPersone);
        Persona.stampaNumeroPersone();
    }
}
