package Polimorfismo;
//Capacità di un oggetto di assumere più forme
public class Main {
    
    public static void main(String[] args){

        Studente studente1 = new Studente("Omar", "Balde");
        Insegnante insegnante1 = new Insegnante("Mario", "Rossi");
        Studente studente2 = new Studente("Luca", "Bianchi");

        //creiamo un array di oggetti di tipo Persona
        //che contiene gli oggetti studente1 e insegnante1
        //in questo modo possiamo accedere ai metodi della classe Persona
        Persona[] classe = {studente1, studente2, insegnante1};

        for(Persona persona : classe){
            persona.saluta();
        }


    } 
}
