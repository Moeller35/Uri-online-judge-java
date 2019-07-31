import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

public class uri1248 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int N, aux;
		String dieta;
		char[] comidas;
		String[] saida;
		boolean condicao;

		N = readInt();
		while (N-- > 0) {
			dieta = read();
			comidas = (read() + read()).toCharArray();
			condicao = true;
			for (char comida : comidas) {
				aux = dieta.length();
				dieta = dieta.replaceFirst(String.valueOf(comida), "");
				if (aux == dieta.length()) {
					condicao = false;
					break;
				}
			}
			if (condicao) {
				saida = dieta.split("");
				Arrays.sort(saida);
				for (String str1 : saida) {
					System.out.print(str1);
				}
				System.out.println();
			} else {
				System.out.println("CHEATER");
			}
		}
	}

	private static String read() throws IOException {
		return br.readLine();
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(br.readLine());

	}

}
