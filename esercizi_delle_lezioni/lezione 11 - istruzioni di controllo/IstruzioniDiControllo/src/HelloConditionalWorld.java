import java.util.Scanner;

public class HelloConditionalWorld {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ciao! Inserisci una stringa, cosi ti ritorno il carattere o i caratteri centrali! Woooh!");
		String testo = input.nextLine();

		String caratteriCentrali = estraiCarattereCentrale(testo);

		System.out.println("I caratteri centrali sono: " + caratteriCentrali);

	}

	private static String estraiCarattereCentrale(String testo) {

		// versione 02
		boolean testoPari = testo.length() % 2 == 0;
		int centro = testo.length() / 2;
		int lunghezza = centro + 1;

		if (testoPari) {
			centro -= 1;
		}

		return testo.substring(centro, lunghezza);

	}
}
