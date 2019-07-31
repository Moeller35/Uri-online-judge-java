import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class uri1217 {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		int casosTestes, dia;
		double quantidade = 0, valorGasto = 0;
		double valor, kgdia, mediavalor;
		String frutas;

		casosTestes = Integer.parseInt(br.readLine());
		DecimalFormat d = new DecimalFormat("#0.00");

		for (int i = 0; i < casosTestes; i++) {
			valor = Double.parseDouble(br.readLine());
			frutas = (br.readLine());
			String fruta[] = frutas.split(" ");
			
			dia = fruta.length;
			quantidade += fruta.length;
			valorGasto += valor;
			System.out.println("day " + (i + 1) + ": " + dia + " kg");
		}

		kgdia = (quantidade / casosTestes);
		mediavalor = (valorGasto / casosTestes);

		System.out.println(d.format(kgdia).replace(",", ".") + " kg by day");
		System.out.println("R$ " + d.format(mediavalor).replace(",", ".") + " by day");
		
	}
}
