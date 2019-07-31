import java.util.Scanner;
import java.util.Locale;
public class uri1794 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n, la, lb, sa, sb;
		
		n = input.nextInt();
		la = input.nextInt();
		lb = input.nextInt();
		sa = input.nextInt();
		sb = input.nextInt();
		
		if(n < la || n > lb || n < sa || n > sb) {
			System.out.println("impossivel");
		} else {
			System.out.println("possivel");
		}
		
	}

}
