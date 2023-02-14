package OOP;

public class OggettiParametri {
    public static void main(String[] args){
        Persona persona1 = new Persona("Mario", "Rossi");
        Persona persona2 = new Persona("Luca", "Verdi");
        
        persona1.saluta(persona2);
        persona2.saluta(persona1);

    }
}
