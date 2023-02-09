
public class Array2D {

	public static void main(String[] args) {
		
		String[][] classi = new String[3][5];
		
		classi[0][0] = "Luca";
		classi[0][1] = "Anna";
		classi[0][2] = "Marco";
		
		classi[1][0] = "Omar";
		classi[1][1] = "Leonardo";
		classi[1][2] = "Alessandro";

		classi[2][0] = "Gabriella";
		classi[2][1] = "Filippo";
		classi[2][2] = "Fabrizio";
		
		for(int i=0; i<classi.length; i++) {
			System.out.println();
			for(int j=0; j<classi.length; j++) {
				System.out.print(classi[i][j] + " ");
			}
		}
	}

}
