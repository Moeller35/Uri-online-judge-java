import java.util.Locale;
import java.util.Scanner;

public class uri2523 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			String frase = input.nextLine();
			char fraseChar[] = frase.toCharArray();
			
			int tamanho;
			String aux;

			tamanho = Integer.parseInt(input.nextLine());
			String[] alfabeto = new String[tamanho];
			int[] letras = new int[tamanho];
			aux = input.nextLine();
			alfabeto = aux.split(" ");
			
			for (int i = 0; i < tamanho; i++) {
				letras[i] = Integer.parseInt(alfabeto[i]) - 1;
			}
			for (int i = 0; i < tamanho; i++) {
				System.out.printf("%s", fraseChar[letras[i]]);
			}
			
			System.out.println();
		}

	}

}
