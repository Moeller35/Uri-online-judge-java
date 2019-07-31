import java.util.Locale;
import java.util.Scanner;

public class uri1943 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int colocacao;
		
		colocacao = input.nextInt();
		
		if(colocacao == 1) {
			System.out.println("Top 1");
		} else if (colocacao <= 3) {
			System.out.println("Top 3");
		} else if (colocacao <= 5) {
			System.out.println("Top 5");
		} else if (colocacao <= 10) {
			System.out.println("Top 10");
		} else if(colocacao <= 25) {
			System.out.println("Top 25");
		} else if (colocacao <= 50) {
			System.out.println("Top 50");
		} else if (colocacao <= 100) {
			System.out.println("Top 100");
		}

	}

}
