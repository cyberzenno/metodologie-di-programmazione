
public class CorniceAvanzata {

	public static void main(String[] args) {

		int n = 6;
		String testo = "Cornici in Java";

		int indiceTesto = 0;

		for (int y = 0; y < n; y++) {
			for (int x = 0; x < n; x++) {

				boolean isFirstOrLastLine = x == 0 || x == n - 1;
				boolean isFirstOrLastChar = y == 0 || y == n - 1;

				if (isFirstOrLastLine || isFirstOrLastChar)
					System.out.print("*");
				else {
					if (indiceTesto < testo.length()) {
						System.out.print(testo.charAt(indiceTesto++));
					}else {
						System.out.print(" ");
					}
				}

			}

			System.out.println();
		}

	}
}
