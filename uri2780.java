import java.util.Scanner;
import java.util.Locale;

public class uri2780 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int distancia;
		
		distancia = input.nextInt();
		
		if(distancia <= 800) {
			System.out.println("1");
		} else if(distancia <= 1400) {
			System.out.println("2");
		} else if(distancia > 1400 || distancia <= 2000) {
			System.out.println("3");
		}
	}

}
