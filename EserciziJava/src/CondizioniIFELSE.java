
public class CondizioniIFELSE {

	public static void main(String[] args) {

		String nome = "Omar";
		if (nome == "Luca") {
			System.out.println("è Luca!");
		}
			else if(nome == "Marco"){
				System.out.println("è Marco!");
			}
			else {
				System.out.println("non so!");
			}
		int numero=4; 
		if(numero<10) {
			if(numero%2==0) {
				System.out.println("numero è minore di 10 e pari!");
			}
}
		String x = 3<10 ? "3 è minore di 10" : "3 non è maggiore di 10";
		System.out.println(x);
}
		
}