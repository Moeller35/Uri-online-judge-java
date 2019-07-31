import java.util.Locale;
import java.util.Scanner;

public class uri1533 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n;

		n = input.nextInt();

		while (n != 0) {
			int[] aux = new int[n];

			for (int i = 0; i < n; i++) {
				aux[i] = input.nextInt();
			}
			int maior = aux[0];
			int maiorPosicao = 0;
			
			for (int i = 1; i < n; i++) {
				if (maior <= aux[i]) {
					maior = aux[i];
					maiorPosicao = i;
				}
			}

			aux[maiorPosicao] = 0;

			maior = aux[0];
			maiorPosicao = 0;
			
			for (int i = 1; i < n; i++) {
				if (maior <= aux[i]) {
					maior = aux[i];
					maiorPosicao = i;
				}
			}

			System.out.println(maiorPosicao + 1);
			n = input.nextInt();
		}

	}
}
