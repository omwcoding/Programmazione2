package OOP;

public class CostruttoreClasse {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Luca", "Rossi", 25, "blu");
		Persona persona2 = new Persona("Marco", "Verdi", 15, "rosso");

		System.out.println(persona1.cognome);
		System.out.println(persona2.cognome);
			
	}

}
