import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_3 {
	public static void main(String[] args) {

		// 1. iniziamo con una lista
		List<Persona> persone = new ArrayList<>();

		persone.add(new Persona("Mario", "Rossi", 25, "Roma"));
		persone.add(new Persona("Luca", "Bianchi", 41, "Milano"));
		persone.add(new Persona("Anna", "Verdi", 19, "Firenze"));
		persone.add(new Persona("Giulia", "Neri", 33, "Roma"));
		persone.add(new Persona("Marco", "Gialli", 58, "Milano"));
		persone.add(new Persona("Sara", "Costa", 27, "Firenze"));
		persone.add(new Persona("Davide", "Ferrari", 46, "Roma"));
		persone.add(new Persona("Elena", "Romano", 22, "Milano"));

		// 2. convertiamo in una mappa "a mano"
		Map<String, List<Persona>> groupByCity = new LinkedHashMap<String, List<Persona>>();

		// --> versione 1: molto verbosa
		for (Persona p : persone) {
			if (groupByCity.containsKey(p.getCitta())) {
				groupByCity.get(p.getCitta()).add(p);
			} else {
				groupByCity.put(p.getCitta(), new LinkedList<Persona>(List.of(p)));
			}
		}

		// --> versione 2: usiamo il merge perche visto al webinar
		groupByCity = new LinkedHashMap<String, List<Persona>>();
		for (Persona p : persone) {
			var valueIfNull = new LinkedList<Persona>(List.of(p));

			groupByCity.merge(p.getCitta(), valueIfNull, (esistente, nuova) -> {
				esistente.addAll(nuova);
				return esistente;
			});
		}

		// --> versione 3: usiamo il compute in quanto il piu sintetico
		groupByCity = new LinkedHashMap<String, List<Persona>>();
		for (Persona p : persone) {
			groupByCity.computeIfAbsent(p.getCitta(), chiave -> new LinkedList<>()).add(p);
		}
		print(groupByCity);

		line();

		// 3. ora invece proviamo con gli stream:
		Set<String> tuttiINomi = persone.stream().collect(
				/* supplier of BOX */
				() -> new LinkedHashSet<String>(),
				/* accumulator of BOX, ELEMENT */
				(b, x) -> b.add(x.getCognome()),
				/* combiner or BOX1 and BOX2 */
				(b1, b2) -> b1.addAll(b2));

		print(tuttiINomi);

	}

	private static void print(Map<?, ?> map) {
		map.forEach((k, v) -> print("%s: %s\n".formatted(k, v)));
	}

	private static void print(Object banner) {
		System.out.println(banner);
	}

	private static void line() {
		print("\n-------------------------\n");
	}

	private static void print(Object banner, Object value) {
		System.out.printf("%s: %s\n", banner, value);
	}
}
