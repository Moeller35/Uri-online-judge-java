import java.util.Scanner;
import java.util.Locale;
public class uri1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int horaI, horaF, duracao;
		
		horaI = input.nextInt();
		horaF = input.nextInt();
		
		duracao = horaF - horaI;
		
		if(duracao < 0) {
			duracao = 24 + (horaF - horaI);
		}
		
		if(horaI == horaF) {
			System.out.printf("O JOGO DUROU 24 HORA(S)\n");
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		}
	}

}
