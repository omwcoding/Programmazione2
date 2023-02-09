
public class CicloWhile {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x<5) {
			System.out.println(x+1);
			x++;
		}
		
		do {
			System.out.println("dowhile " + (y+1));
			y++;
		}while(y<5);
	}
}
