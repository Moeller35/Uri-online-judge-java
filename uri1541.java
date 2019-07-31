import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class uri1541 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int a, b, c, aux1, aux2;
		double z = 0.5;
		
		while(true) {
			a = input.nextInt();
			if(a == 0) {
				break;
			}
			b = input.nextInt();
			c = input.nextInt();
			
			aux1 = a * b;
			aux2 = aux1 * 100 / c;
			aux2 = (int) (Math.pow(aux2, z));
			
			System.out.println(aux2);
			
		}
	}

}
