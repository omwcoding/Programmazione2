package OOP;

public class CostruttoriOverloaded {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza("Integrale", "Pomodoro", "Mozzarella", "Salame");
		Pizza pizza2 = new Pizza("Normale", "Pomodoro");
		Pizza pizza3 = new Pizza("Normale", "Pomodoro", "Formaggio", "Salame", "Patatine");


		System.out.println("La pizza uno è: " + pizza1.impasto + pizza1.formaggio + pizza1.salsa + pizza1.extra);
		
	}

	
	
}
