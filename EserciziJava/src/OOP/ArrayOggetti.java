package OOP;

public class ArrayOggetti {
    public static void main(String[] args){
        
        //creo un oggetto di tipo Persona
        Persona persona1 = new Persona("Mario", "Rossi");
        Persona persona2 = new Persona("Luca", "Verdi");
        Persona persona3 = new Persona("Giuseppe", "Bianchi");
        //assegno gli oggetti di tipo Persona all'array
        Persona[] persone = {persona1, persona2, persona3};
        //stampo l'array
        for(int i = 0; i < persone.length; i++){
            System.out.println(persone[i]);
        }
    }
}
