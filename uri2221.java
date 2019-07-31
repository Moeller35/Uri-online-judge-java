import java.util.Locale;
import java.util.Scanner;

public class uri2221 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int t, bonus, golpe1, golpe2;
		int ataque1 = 0, defesa1 = 0, bonus1 = 0, nivel1 = 0;
		int ataque2 = 0, defesa2 = 0, bonus2 = 0, nivel2 = 0;

		t = input.nextInt();

		for (int i = 0; i < t; i++) {
			bonus = input.nextInt();

			ataque1 = input.nextInt();
			defesa1 = input.nextInt();
			nivel1 = input.nextInt();

			if (nivel1 % 2 == 0) {
				bonus1 = bonus;
			} else {
				bonus1 = 0;
			}

			golpe1 = (ataque1 + defesa1) / 2 + bonus1;

			ataque2 = input.nextInt();
			defesa2 = input.nextInt();
			nivel2 = input.nextInt();

			if (nivel2 % 2 == 0) {
				bonus2 = bonus;
			} else {
				bonus2 = 0;
			}
			
			golpe2 = (ataque2 + defesa2)/2 + bonus2;
			
			if(golpe1 > golpe2) {
				System.out.println("Dabriel");
			} else if (golpe2 > golpe1) {
				System.out.println("Guarte");
			} else {
				System.out.println("Empate");
			}
			
		}

	}

}
