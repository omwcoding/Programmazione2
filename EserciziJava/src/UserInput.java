import java.util.Scanner; //importata la libreria e funzione Scanner

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Inserisci cognome:");
		String cognome = scanner.nextLine();
		
		System.out.println("Inserisci eta':");
		int eta = scanner.nextInt();
		scanner.nextLine(); //int non va a capo da solo
		
		System.out.println("Inserisci citta':");
		String citta = scanner.nextLine();
		
		System.out.println("Ciao " + nome + " " + cognome + ", vivi a " + citta + " e hai " + eta + " anni!" );
		
		

	}

}
