import java.util.Scanner;
import java.util.Locale;

public class uri1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double n = 3.14159;
		double raio;
		double area;
		
		raio = input.nextDouble();
		
		area = (n * (raio * raio));
		
		System.out.printf("A=%.4f\n", area);
	}

}
