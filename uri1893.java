import java.util.Scanner;
import java.util.Locale;

public class uri1893 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int i,f;
		
		i = input.nextInt();
		f = input.nextInt();
		
		if(3 <= f && f <= 96 && f > i) {
			System.out.println("crescente");
		} else if(3 <= f && f <= 96 && f < i) {
			System.out.println("minguante");
		} else if (0 <= f && f <= 2) {
			System.out.println("nova");
		} else if(97 <= f && f <= 100) {
			System.out.println("cheia");
		}
	}

}
