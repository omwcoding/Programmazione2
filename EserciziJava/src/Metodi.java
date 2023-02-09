//Metodi o Funzioni
public class Metodi {

	public static void main(String[] args) {
		
		addizione(2, 3); //passiamo parametri 2 e 3
		
		int totaleSottrazione = sottrazione(10, 1);
		System.out.println("Totale sottrazione: " + totaleSottrazione);
	}
	
	//void non ritorna nessun valore
	//passiamo parametro di tipo intero
	static void addizione(int a, int b) {
		int risultato = a + b;
		System.out.println("Totale addizione: " + risultato);
	}
	
	//int perchè ritorniamo un valore
	static int sottrazione(int a, int b) {
		int risultatosott = a - b;
		return risultatosott;
	}
}
