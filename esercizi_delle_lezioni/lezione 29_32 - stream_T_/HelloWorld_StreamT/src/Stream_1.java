import java.util.Arrays;
import java.util.stream.Collectors;

//import sun.font.FontRunIterator;

import java.util.*;

public class Stream_1 {
	public static void main(String[] args) {
		// dai, andiamo avanti

		String testo = "il gatto sul tetto il tetto era vecchio il gatto dormiva";

		// 1. conta le parole
		List<String> listaDiParole = Arrays.asList(testo.split(" "));
		print("listaDiParole", listaDiParole.stream().collect(MyCustomCollectors.Conta()));

		List<Frutta> listaDiFrutta = Arrays.asList(new Frutta("Mela"), new Frutta("Pera"), new Frutta("Banana"),
				new Frutta("Fragola"), new Frutta("Lampone"), new Frutta("Limone"));
		print("listaDiFrutta", listaDiFrutta.stream().collect(MyCustomCollectors.Conta()));

		print("lettereDiParole", listaDiParole.stream().collect(MyCustomCollectors.ContaCondizionale((box, parola) ->

		// conta tutte le lettere
		box[0] += parola.length()

		)));

		print("lettereNomiFrutta", listaDiFrutta.stream().collect(MyCustomCollectors.ContaCondizionale((box, frutta) ->

		// conta tutte le lettere
		box[0] += frutta.getNome().length()

		)));

		print("quanteParoleHannoDueT",
				listaDiParole.stream().collect(MyCustomCollectors.ContaCondizionale((box, parola) ->

				// conta tutte le lettere
				box[0] += parola.toLowerCase().contains("tt") ? 1 : 0

				)));

		print("summingInt_startsWithT",
				listaDiParole.stream().collect(Collectors.summingInt(x -> x.startsWith("t") ? 1 : 0)));
		
		
		print("summingInt_containsElle",
				listaDiFrutta.stream().collect(Collectors.summingInt(x -> x.getNome().toLowerCase().contains("l") ? 1 : 0)));

	}

	private static void line() {
		print("\n-------------------------\n");
	}

	private static void print(Object banner) {
		System.out.println(banner);
	}

	private static void print(Object banner, Object value) {
		System.out.printf("%s: %s\n", banner, value);
	}
}
