import java.util.Scanner;
import java.util.Locale;

public class uri1160 {

	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		long t, pa, pb;
		double g1, g2;
		int anos, sec;

		t = input.nextLong();

		for (int i = 0; i < t; i++) {
			pa = input.nextLong();
			pb = input.nextLong();
			g1 = input.nextDouble();
			g2 = input.nextDouble();

			anos = 0;
			sec = 0;

			while (pa <= pb) {
				pa += pa * g1 / 100;
				pb += pb * g2 / 100;

				anos++;
				if (anos > 100) {
					sec = 1;
					break;
				}
			}
			if (sec == 0) {
				System.out.println(anos + " anos.");
			} else {
				System.out.println("Mais de 1 seculo.");
			}
		}
	}
}