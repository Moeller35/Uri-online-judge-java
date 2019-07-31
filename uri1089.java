import java.util.Locale;
import java.util.Scanner;

public class uri1089 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner input = new Scanner(System.in);

		int amostras, resultado, aux1 = 0, aux2 = 0;
		int vetor[] = new int[3];

		while (true) {
			amostras = input.nextInt();
			if (amostras == 0) {
				break;
			}
			resultado = 0;
			vetor[0] = input.nextInt();
			vetor[1] = input.nextInt();

			if (amostras == 2) {
				if (vetor[0] != vetor[1])
					resultado = 2;
			} else {
				aux1 = vetor[0];
				aux2 = vetor[1];

				for (int i = 2; i < amostras; i++) {
					vetor[2] = input.nextInt();
					if (((vetor[1] > vetor[0]) && (vetor[1] > vetor[2])) || ((vetor[1] < vetor[0]) && (vetor[1] < vetor[2]))) {
						resultado++;
					}
					vetor[0] = vetor[1];
					vetor[1] = vetor[2];
				}
				if ((aux1 > aux2 && aux1 > vetor[2]) || (aux1 < aux2 && aux1 < vetor[2])) {
					resultado++;
				}
				if ((vetor[2] > vetor[0] && vetor[2] > aux1) || (vetor[2] < vetor[0] && vetor[2] < aux1)) {
					resultado++;
				}
			}
			System.out.println(resultado);
		}

	}

}
