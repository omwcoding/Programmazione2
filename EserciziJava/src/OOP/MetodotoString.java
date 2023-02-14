package OOP;

public class MetodotoString {
    public static void main(String[] args){
        Persona persona = new Persona("Mario", "Rossi");
        //override della funzione toString (in Persona.java) che ci permette di ottenere una stringa con i valori delle variabili
        System.out.println(persona.toString());
        //stampa la stringa senza dover chiamare la funzione toString
        System.out.println(persona);
    }
}
