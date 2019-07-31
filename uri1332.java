import java.util.Locale;
import java.util.Scanner;

public class uri1332 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n;
		n = input.nextInt();
		String[] s;
		String x;

		while (n > 0) {
			x = input.next();
			s = x.split("");

			if (s.length == 5) {
				System.out.println("3");
			} else if (("o".equals(s[0]) || "n".equals(s[1])) && ("n".equals(s[1]) || "e".equals(s[2]))&& ("o".equals(s[0]) || "e".equals(s[2]))) {
				System.out.println("1");
			} else if (("t".equals(s[0]) || "w".equals(s[1])) && ("w".equals(s[1]) || "o".equals(s[2]))&& ("t".equals(s[0]) || "o".equals(s[2]))) {
				System.out.println("2");
			}
			n = n - 1;
		}

	}

}
