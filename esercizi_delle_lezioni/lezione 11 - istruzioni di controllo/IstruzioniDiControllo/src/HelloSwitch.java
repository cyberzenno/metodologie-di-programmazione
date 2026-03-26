import java.util.Scanner;

public class HelloSwitch {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		print("Ciao!");

		var azione = "";

		do {

			azione = prompt("Puoi selezionare tra queste opzioni: 1) miao, 2) bau, 3) wow, 4) ciao. Quale scegli?");

			//java < 13
			switch (azione) {
			case "1":
				print("Miao! Miao! Miao! Il gatto fa cosi!!");
				break;
			case "2":
				print("Bau! Bau! Bau! Il Cane fa cosi!!");
				break;
			case "3":
				print("Wow! Wow! Wow! L'entusiasta fa cosi!!");
				break;
			case "4":
				print("Ciao! Ciao! Ciao! Il programma termina qui! Arrivederci!");
				break;
			default:
				print("Non ho ricevuto. Hai digitato: " + azione + " Riprova per favore.");
				break;
			}

		} while (!azione.equals("4"));

	}

	private static String prompt(String message) {
		System.out.println(message);

		var input = scanner.nextLine();
		return input;
	}

	private static void print(String message) {
		System.out.println(message);
	}

}
