import java.util.Locale;
import java.util.Scanner;

public class uri1387 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int filhas, filhos;
		
		while (true) {
			filhos = input.nextInt();
			filhas = input.nextInt();
			
			if((filhos == 0) && (filhas == 0)) {
				break;
			}
			
			System.out.println(filhos + filhas);
		}

	}

}
