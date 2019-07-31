import java.util.Locale;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uri1218 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int caso = 1, fem, mas, i;
		String aux, calcado, genero;
		String[] calcados;

		while ((aux = read()) != null) {
			calcados = read().split("\\s");
			i = 0;
			mas = 0;
			fem = 0;
			while (i < calcados.length) {
				calcado = calcados[i++];
				genero = calcados[i++];
				if (aux.equals(calcado)) {
					switch (genero) {
					case "M":
						mas++;
						break;
					case "F":
						fem++;
						break;
					}
				}
			}
			if (caso != 1) {
				System.out.println();
			}
			System.out.printf("Caso %d:\n", caso++);
			System.out.println("Pares Iguais: " + (fem + mas));
			System.out.println("F: " + fem);
			System.out.println("M: " + mas);
		}

	}

	private static String read() throws IOException {
		return br.readLine();

	}

}
