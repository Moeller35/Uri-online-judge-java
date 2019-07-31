import java.util.Scanner;
import java.util.Locale;

public class uri1051 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double salario;
		double imposto;
		salario = input.nextDouble();
		
		if(salario <= 2000.00) {
			System.out.printf("Isento\n");
		} else if(salario <= 3000.00) {
			imposto = ((salario - 2000.00) * 0.08);
			System.out.printf("R$ %.2f\n", imposto);
		} else if(salario <= 4500.00) {
			imposto = (((salario - 3000.00) * 0.18) + 80.00);
			System.out.printf("R$ %.2f\n", imposto);
		} else if(salario > 4500.00) {
			 imposto = (((salario - 4500) * 0.28) + 350.00);
			 System.out.printf("R$ %.2f\n", imposto);
		}

	}

}
