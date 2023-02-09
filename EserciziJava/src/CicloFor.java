
public class CicloFor {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println("riga" + (i+1));
			for (int j=0; j<5; j++) {
				System.out.println("colonna" + (j+1));
			}
		}
		
		//versione enhanced (o foreach) [si usa solo con gli array]
		int[] numeri = {10, 20, 30, 40, 50};
		for (int numero: numeri) {
			System.out.println(numero);
		}
		
		//break (esce dal ciclo se)
		for (int i=0; i<10; i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		//continua (skippa il ciclo se)
				for (int i=0; i<10; i++) {
					if(i==4) {
						continue;
					}
					System.out.println(i);
				}
		
		
	}

}
