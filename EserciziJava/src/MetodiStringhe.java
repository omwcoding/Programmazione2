
public class MetodiStringhe {

	public static void main(String[] args) {
		
		String nome = "Omar";
		
		//check se nome è ESATTAMENTE UGUALE a stringa (true or false)
		boolean risultato = nome.equals("Omar");
		System.out.println(risultato);
		
		//check se nome è uguale a stringa, ignorando gli upper o downcase (true or false)
		boolean risultato2 = nome.equalsIgnoreCase("omar");
		System.out.println(risultato2);
		
		//restituisce lunghezza stringa
		int risultato3 = nome.length();
		System.out.println(risultato3);
		
		//restituisce carattere alla posizione fornita (3 in questo caso)
		char risultato4 = nome.charAt(2);
		System.out.println(risultato4);
		
		//restituisce posizione del carattere fornito (a in questo caso)
		int risultato5 = nome.indexOf("a");
		System.out.println(risultato5);
		
		//check se la stringa è vuota
		boolean risultato6 = nome.isEmpty();
		System.out.println(risultato6);
		
		//trasforma la stringa in upper case
		String risultato7 = nome.toUpperCase();
		System.out.println(risultato7);
		
		//trasforma la stringa in lower case
		String risultato8 = nome.toLowerCase();
		System.out.println(risultato8);
		
		//elimina gli spazi nella stringa all'inzio e fine
		String risultato9 = nome.trim();
		System.out.println(risultato9);
		
		//sostituisce tutti i caratteri impostati con altro carattere impostato
		String risultato10 = nome.replace('O', 'W');
		System.out.println(risultato10);
		
		
		
	}

}
