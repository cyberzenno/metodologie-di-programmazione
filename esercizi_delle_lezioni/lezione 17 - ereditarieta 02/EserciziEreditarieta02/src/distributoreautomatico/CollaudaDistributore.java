package distributoreautomatico;

import java.util.Scanner;
import static java.lang.System.out;

public class CollaudaDistributore {

	public static void main(String[] args) {

		final int NUMERO_PRODOTTI = 5;
		final int IMPORTO_MASSIMO = 50;

		DistributoreAutomatico d = new DistributoreAutomatico();
		d.carica(NUMERO_PRODOTTI);

		while (d.prodottiRimasti() > 0) {

			out.print(d);

			d.inserisciImporto(promptDouble("Inserisci importo: ", IMPORTO_MASSIMO));

			while (d.erogazioneAbilitata()) {
				Prodotto p = d.getProdotto(promptInteger("Seleziona prodotto: ", NUMERO_PRODOTTI - 1));

				out.printf("Erogato 10%s\n", p);

				out.print(d);
			}

			out.printf("Erogato resto: %s\n", d.getResto());
			out.println("Grazie e arrivederci!");
		}

		out.println("Prodotti terminati. Ci scusiamo per il disagio");
	}

	private static final Scanner sc = new Scanner(System.in);

	private static int promptInteger(String prompt, int max) {
		System.out.println(prompt);
		int x = sc.nextInt();

		while (x < 0 || x > max) {
			System.out.println("Selezione non valida.");
			System.out.println(prompt);
			x = sc.nextInt();
		}

		return x;
	}

	private static double promptDouble(String prompt, int max) {

		System.out.println(prompt);
		double x = sc.nextDouble();

		while (x <= 0 || x > max) {
			System.out.println("Selezione non valida.");
			System.out.println(prompt);
			x = sc.nextDouble();
		}

		return x;
	}
}
