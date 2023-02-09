import java.util.ArrayList;

//ARRAY RIDIMENSIONABILI, DINAMICI
public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> persone = new ArrayList<String>();
		
		//aggiungiamo elementi all'ArrayList
		persone.add("Omar");
		persone.add("Riccardo");
		persone.add("Andrea");
		
		//restituiamo i valori
		for(int i=0; i<persone.size(); i++) {
			System.out.println(persone.get(i));
		}
		
		//sostituisce valore in posizione 0
		persone.set(0, "Omar Balde");
		System.out.println(persone.get(0));
		
		//rimuove valore in posizione 2
		persone.remove(2);
		for(int i=0; i<persone.size(); i++) {
			System.out.println(persone.get(i));
		}
		
		//pulisce l'arraylist
		persone.clear();
		
		
		ArrayList<Integer> numeri = new ArrayList<Integer>();
		numeri.add(1);
		numeri.add(2);
		numeri.add(777);
		
		//ARRAYLIST 2D
		ArrayList<ArrayList<String>> classi = new ArrayList();
		
		ArrayList<String> classe1 = new ArrayList<String>();
		classe1.add("Umberto");
		classe1.add("Marco");
		
		ArrayList<String> classe2 = new ArrayList<String>();
		classe1.add("Fabrizio");
		classe1.add("Francesco");
		
		classi.add(classe1);
		classi.add(classe2);
		
		for(int j=0; j<classi.size(); j++) {
			System.out.println();
			for (int k=0; k<classi.get(j).size(); k++) {
				System.out.print(classi.get(j).get(k)+ " ");
			}
		}
		
		
	}

}
