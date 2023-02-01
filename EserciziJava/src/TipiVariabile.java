public class TipiVariabile {

	public static void main(String[] args) {
		boolean ilBoolean = true;
		byte ilByte = 127;
		short loShort = -32768;
		int ilInt = 2000000000; //2 miliardi
		long ilLong = 999999999999999999l; //9 quintilioni //ha bisogno di "l" finale
		
		float ilFloat = 5.27f; //ha bisogno di "f" finale
		double ilDouble = 5.2888888888888888;
		
		char ilChar = 'o'; //apici, non virgolette
		String laStringa = "Omar Balde"; //REFERENCE
		
		System.out.println(laStringa.toUpperCase());
		//funzione toUpperCase possibile perchè "laStringa" è una referenza
		
	}

}
