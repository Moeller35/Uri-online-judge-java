import java.util.Locale;
import java.util.Scanner;

public class uri1546 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n, k, x;
		
		n = input.nextInt();
		
		for(int i = 0; i < n; ++i) {
			k = input.nextInt();
			
			for(int j = 0; j < k; ++j) {
				x = input.nextInt();
				
				if(x == 1) {
					System.out.println("Rolien");
				} else if(x == 2) {
					System.out.println("Naej");
				} else if (x == 3) {
					System.out.println("Elehcim");
				} else {
					System.out.println("Odranoel");
				}
			}
		}

	}

}
