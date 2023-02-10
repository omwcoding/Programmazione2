//metodi con lo stesso nome che fanno cose diverse
//ci possono essere più metodi con le stesso nome, 
//basta che i parametri passati siano diversi in numero e/o in tipo 
public class MetodiOverloaded {

	public static void main(String[] args) {
		
		int doppioInt = addizione(2, 3);
		int triploInt = addizione(2, 3, 5);
		double virgolaInt = addizione(2.3, 5.7);
		
		System.out.println(doppioInt);
		System.out.println(triploInt);
		System.out.println(virgolaInt);

	}
	
	static int addizione(int a, int b) {
		int risultato = a + b;
		return risultato;
	}
	
	static int addizione(int a, int b, int c) {
		int risultato = a + b + c;
		return risultato;
	}
	
	static double addizione(double a, double b) {
		double risultato = a + b;
		return risultato;
	}
}
