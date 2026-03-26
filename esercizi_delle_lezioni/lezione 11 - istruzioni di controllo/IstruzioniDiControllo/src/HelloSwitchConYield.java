
import java.util.Scanner;

public class HelloSwitchConYield {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		print("Ciao!");

		var azione = "";
		
		do {

			azione = prompt("Puoi selezionare tra queste opzioni: 1) miao, 2) bau, 3) wow, 4) ciao. Quale scegli?");

			var reazione = "";

			// java >= 13

			reazione = switch (azione) {
			case "1":
				yield "Miao! Miao! Miao! Il gatto fa cosi!!";
			case "2":
				yield "Bau! Bau! Bau! Il Cane fa cosi!!";
			case "3":
				yield "Wow! Wow! Wow! L'entusiasta fa cosi!!";
			case "4":
				yield "Ciao! Ciao! Ciao! Il programma termina qui! Arrivederci!";

			default:
				yield "Riprova per favore.";
			};

			print(reazione);			
			
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
