import java.util.Scanner;
import java.util.Locale;

public class uri1035 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int a, b, c, d;
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		
		int somaAB = a + b;
		int somaCD = c + d;
		
		if((b > c) && (d > a) && (somaCD > somaAB) && (c > 0) && (d > 0) && ((a % 2) == 0)) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}

}
