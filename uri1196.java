import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class uri1196 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final String alfabeto = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
	static final char[] teclado = alfabeto.toCharArray();

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String digito;
		char[] entrada = null;
		int indice = 0;
		
		while ((digito = br.readLine()) != null) {
			entrada = digito.toCharArray();
			for (char letter : entrada) {
				indice = alfabeto.indexOf(letter);
				System.out.print(indice != -1 ? teclado[indice - 1] : letter);
			}
			System.out.println();
		}

	}

}
