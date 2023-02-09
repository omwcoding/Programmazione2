
public class Array {

	public static void main(String[] args) {
		
		//array di 3 elementi interi
		int[] numeri = new int[3];
		
		numeri[0] = 10;
		numeri[1] = 20;
		numeri[2] = 30;
		
		//mostra lunghezza array "numeri"
		System.out.println(numeri.length);
		
		System.out.println(numeri[0]);
		System.out.println(numeri[1]);
		System.out.println(numeri[2]);
		
		numeri[1] = 100;
		
		System.out.println(numeri[0]);
		System.out.println(numeri[1]);
		System.out.println(numeri[2]); 
		
		int[] altrinumeri = {60,70,80};
		
		System.out.println(altrinumeri[0]);
		System.out.println(altrinumeri[1]);
		System.out.println(altrinumeri[2]);
		
		//mostra ultimo elemento
		System.out.println(altrinumeri[numeri.length-1]);
		
		
		//for con array
		for(int j=0; j<numeri.length; j++) {
			System.out.println(numeri[j]);
			
		//foreach con array
		for (int numero:numeri) {
			System.out.println(numero);
		}
		}
	}

}
