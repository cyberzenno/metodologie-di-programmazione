import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//import java.util.Collect;

public class EvvaiColMapping_2 {
	public static void main(String[] args) {

		// ESERCIZIO 1 — Inversione della mappa
		// Hai questa mappa:
		Map<String, String> paesiConCapitali = Map.of("Italia", "Roma", "Francia", "Parigi", "Germania", "Berlino");
		// Crea una nuova mappa invertita: Map<String, String> dove le chiavi diventano
		// valori e viceversa. Usa gli stream.

		// v: no stream
		Map<String, String> capitaliConPaesiSenzaStream = new LinkedHashMap<String, String>();
		paesiConCapitali.forEach((k, v) -> {

			capitaliConPaesiSenzaStream.put(v, k);

		});

		print("paesiConCapitali", paesiConCapitali);
		print("capitaliConPaesiSenzaStream", capitaliConPaesiSenzaStream);

		line();
		// v: stream
		Map<String, String> capitaliConPaesiConStream = paesiConCapitali.entrySet().stream()
				.collect(Collectors.toMap(x -> x.getValue(), x -> x.getKey()));
		print("capitaliConPaesiConStream", capitaliConPaesiConStream);

		line();

		// ESERCIZIO 2 — Raggruppamento
		// Hai una lista di parole:
		List<String> parole = List.of("mela", "mare", "banana", "barca", "montagna", "maglia", "carrozza", "motorino");
		// Crea una Map<Character, List<String>> che raggruppa le parole per lettera
		// iniziale.
		// Il risultato atteso è tipo:
		// m -> [mela, mare, montagna, maglia]
		// b -> [banana, barca]
		// Hint: esiste un collector fatto apposta per questo.
		Map<Character, List<String>> parolePerIniziale = parole.stream()
				.collect(Collectors.groupingBy((String entry) -> entry.charAt(0)));

		print(parolePerIniziale);

		line();

		// ESERCIZIO 3 — Fusione di mappe
		// Hai due mappe con voti degli studenti:
		Map<String, Integer> classe1 = Map.of("Alice", 8, "Bob", 6, "Carlo", 7); // qualunque cosa tipo Map.of, List.Of,
																					// Shit.of
		Map<String, Integer> classe2 = Map.of("Alice", 9, "Diana", 10, "Bob", 5); // SONO IMMUTABILI!!!! SONO
																					// IMMUTABILI!!! SONO IMMUTABILI!!!
																					// SONO IMMUTABILI!!!

		Map<String, Double> classeMerged = new LinkedHashMap<String, Double>();

		classe1.entrySet().forEach(x -> classeMerged.put(x.getKey(), x.getValue().doubleValue()));

		// Uniscile in una sola mappa. Se uno studente appare in entrambe,
		// tieni la MEDIA dei due voti. Usa merge().
		classe2.forEach(
				(k, v) -> classeMerged.merge(k, v.doubleValue(), (esistente, nuovo) -> (esistente + nuovo) / 2));

		print(classeMerged);

		line();

		// ESERCIZIO 4 — Frequenza delle parole
		// Data una stringa:
		String testo = "il gatto sul tetto il tetto era vecchio il gatto dormiva";
		// Costruisci una Map<String, Integer> che conta quante volte appare ogni
		// parola.
		// Poi stampa solo le parole che appaiono più di una volta,
		// ordinate per frequenza decrescente. Usa stream e collectors.
		Map<String, Integer> frequenzaDiParoleAMano = Arrays.stream(testo.split(" ")).collect(
				() -> new LinkedHashMap<String, Integer>(), // supplier
				(mappa, parola) -> {

					mappa.put(parola, mappa.getOrDefault(parola, 0) + 1);

//					mappa.merge(parola, 1, (valoreEsistente, valoreCheSiStaPuttandoAkaUno) -> valoreEsistente
//							+ valoreCheSiStaPuttandoAkaUno);

				}, // accumulator
				(mappa1, mappa2) -> {

					mappa1.putAll(mappa2);

				} // combiner
		);

		print("frequenzaDiParoleAMano\n--------");
		print(frequenzaDiParoleAMano);

		Map<String, Long> frequenzaDiParoleUnPoMeglio = Arrays.stream(testo.split(" "))
				.collect(
						Collectors.groupingBy((String parola) -> parola,
								Collectors.counting()
								));
		
		print("frequenzaDiParoleUnPoMeglio\n--------");
		print(frequenzaDiParoleUnPoMeglio);
		

		// ESERCIZIO 5 — Mappa annidata
		// Hai questa struttura dati:
		// Map<String, Map<String, Integer>> scuola = new HashMap<>();
		// Rappresenta una scuola dove ogni chiave è una classe ("3A", "3B")
		// e il valore è una mappa studente->voto.
		// 1. Popolala con almeno 2 classi e 3 studenti ciascuna.
		// 2. Trova lo studente con il voto più alto in assoluto (in tutta la scuola).
		// 3. Calcola la media voti per ogni classe.
		// 4. Stampa le classi ordinate per media decrescente.

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

	private static void print(Map<?, ?> map) {
		map.forEach((k, v) -> {

			print(k, v);

		});

	}
}
