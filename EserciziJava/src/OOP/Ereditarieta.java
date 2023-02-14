package OOP;

public class Ereditarieta {
    public static void main(String[] args){

        Studente studente1 = new Studente("Luca", "Verdi", "Matematica");
        //Possiamo usare il metodo saluta() della classe Studente
        //override del metodo saluta() della classe Persona
        studente1.saluta();
        //studente1.studia();

        Insegnante insegnante1 = new Insegnante("Giuseppe", "Bianchi", "Informatica");
        //Possiamo usare il metodo saluta() della classe Insegnante
        //override del metodo saluta() della classe Persona
        insegnante1.saluta();
        //insegnante1.insegna();

        System.out.println("Insegnante 1: " + insegnante1.nome + " " + insegnante1.cognome + " " + insegnante1.materia);
        System.out.println("Studente 1: " + studente1.nome + " " + studente1.cognome + " " + studente1.materiaPreferita);
    }
}
