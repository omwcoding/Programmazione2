//Programmazione ad oggetti

//suddividiamo il programma in diversi classi e oggetti
public class IntroduzioneOOP {

	public static void main(String[] args) {
		
		//creiamo un oggetto, un'istanza della classe
		Persona persona1 = new Persona();
		/*questa è una nuova istanza (persona 2) di tipo Persona
		sono due oggetti totalmente diversi*/
		Persona persona2 = new Persona();
		
		System.out.println(persona1.nome);
		System.out.println(persona2.nome);
		
		//richiamiamo metodo
		persona1.saluta();
		persona2.cammina();
		
	}

}
