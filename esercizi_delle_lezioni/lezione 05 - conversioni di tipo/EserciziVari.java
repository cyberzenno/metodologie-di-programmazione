import java.util.Scanner;

public class EserciziVari {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String nomeEsercizio = "";

		while (!nomeEsercizio.equals("stop")) {

			nomeEsercizio = userInput("Inserisci nome esercizio: ");

			switch (nomeEsercizio) {
			case "moltiplica":
				moltiplica();

				break;
			case "stampaNome":
				stampaNome();

				break;
			case "sommaEnne":
				sommaEnne();

				break;
			case "dividiPerDue":
				dividiPerDue();

				break;
			case "generaNumeri":
				generaNumeri();

				break;

			case "stop":

				userOutput("Grazie e arrivederci!");

				break;

			default:
				System.out.println("Esercizio non trovato");
			}

		}

		scanner.close();

	}

	private static void generaNumeri() {

		userOutput("geneareNumeri");

		String _max = userInput("inserici max: ");
		int max = Integer.parseInt(_max);

		double r = Math.random();

		int finalRandom = (int) (r * max);

		userOutput("finalRandom: " + finalRandom);
	}

	private static void dividiPerDue() {

		userOutput("faiRoba01");

		String s = userInput("inserici s: ");

		int i = Integer.parseInt(s);

		double d = (double) i / 2;
		// double d = i / 2.0; //alternativa piu elegante

		userOutput("s = " + s);
		userOutput("i = " + i);
		userOutput("d = " + d);
	}

	private static void sommaEnne() {

		userOutput("sommaEnne");

		String _n = userInput("inserici n: ");

		int n = Integer.parseInt(_n);

		int somma = 0;
		for (int i = 0; i < n; i++) {
			somma += i;
		}

		System.out.println("somma da 0 a " + n + " = " + somma);
	}

	private static void moltiplica() {

		userOutput("moltiplica");

		String _a = userInput("a: ");
		String _b = userInput("b: ");

		int a = Integer.parseInt(_a);
		int b = Integer.parseInt(_b);

		System.out.print("a * b = " + a * b);
	}

	private static void stampaNome() {

		userOutput("stampaNome");

		String _nome = userInput("inserisci nome: ");

		System.out.println("+----------------------------+");
		System.out.println("   " + _nome);
		System.out.println("+----------------------------+");
	}

	private static void userOutput(String message) {

		System.out.println(message);

	}

	private static String userInput(String prompt) {

		System.out.println(prompt);
		String input = scanner.nextLine();

		return input;
	}
}
