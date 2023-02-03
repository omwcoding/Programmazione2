
public class OperazioniAritmetiche {

	public static void main(String[] args) {
		int x = 10;
		int y= 2;
		//int z= x+y;
		x+=3; //uguale a x=x+3
		x++; //incremento di 1
		x--; //decremento di 1
		
		System.out.println(x+y); //espressione direttamente nel print, inutile la variabile z
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x%y);
		System.out.println("");
		
		int risultato=((x+y)*x)-x+y*5;
		System.out.println(risultato);
		
		
		

	}

}
