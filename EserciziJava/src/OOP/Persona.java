package OOP;

public class Persona {
	
	String nome;
	String cognome;
	int eta;
	String colorePreferito;
	
	//costruttore per Persona
	Persona(String nome, String cognome, int eta, String colorePreferito){
		
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.colorePreferito = colorePreferito;
	}
	
	void saluta() {
		//variabile usabile in ogni parte del codice
		//è stata dichiarata nel costruttore in riga 13
		System.out.println("Ciao sono " + this.nome);
	}
	
	void addizione(int a, int b) {
		int risultato = a + b;
		this.qwerty(risultato);
	}
	
	void qwerty(int prova) {
		System.out.println("il risultato è" + prova);
	}
}
