package OOP;

public class Studente extends Persona {
    String materiaPreferita;

    Studente (String nome, String cognome, String materiaPreferita){
        super(nome, cognome);
        this.materiaPreferita = materiaPreferita;

    }

    void studia(){
        System.out.println("Sto studiando");
    }

    @Override
    void saluta(){
        System.out.println("Buongiorno professore");
    }
}
