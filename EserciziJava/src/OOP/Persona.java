package OOP;

public class Persona {
	
	String nome;
	String cognome;
	static int numeroPersone; //questa variabile è uguale per tutti gli oggetti di tipo Persona, è condivisa
	
	//costruttore per Persona
	Persona(String nome, String cognome){
		
		this.nome = nome;
		this.cognome = cognome;
		numeroPersone++; //ogni volta che creo un oggetto di tipo Persona, incremento la variabile numeroPersone
		//System.out.println(numeroPersone);
	}

	public String toString(){
		String stringa = this.nome + " " + this.cognome + "\n";
		return stringa;
	}
	
	static void stampaNumeroPersone() {
		System.out.println("numero persone: " + numeroPersone);
	}
	void saluta(Persona personadaSalutare) {
		System.out.println("Ciao " + personadaSalutare.nome + ", io sono " + this.nome);
	}
	
	void addizione(int a, int b) {
		int risultato = a + b;
		this.qwerty(risultato);
	}
	
	void qwerty(int prova) {
		System.out.println("il risultato è" + prova);
	}
	void saluta(){
		System.out.println("Ciao!");
	}
}
