import java.util.Locale;
import java.util.Scanner;

public class uri1091 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int k, n, m, x, y;

		while (true) {
			k = input.nextInt();

			if (k == 0) {
				break;
			}

			n = input.nextInt();
			m = input.nextInt();

			for (int i = 0; i < k; ++i) {
				x = input.nextInt();
				y = input.nextInt();

				if (x > n && y > m) {
					System.out.println("NE");
				} else if (x > n && y < m) {
					System.out.println("SE");
				} else if (x < n && y > m) {
					System.out.println("NO");
				} else if (x < n && y < m) {
					System.out.println("SO");
				} else if (x == n || y == m) {
					System.out.println("divisa");
				}
			}

		}

	}
}
