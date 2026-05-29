import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EvvaiColMapping_1 {
	public static void main(String[] args) {

		// siccome vengo da 15 anni di C#, ho realizzato appena adesso che la differenza
		// tra Dictionary<K,V> e Map<K,V>
		// in termini di sintassi, e' abissale
		// e quindi tocca iniziare da ZERO
		// Evvai col Mapping!

		// 1. Create a HashMap<String, Integer> and add 3 entries manually.
		Map<String, String[]> map = new LinkedHashMap<String, String[]>();

		// String[] x = { "" }; // questo e' ok
		// String[] xx = new[] {""}; //questo NON e' ok
		//		String[] xxx = new String[] { "" }; // questo e' ok

		map.put("Nomi", new String[] { "Mario", "Luigi" }); // qui, questo e' L'UNICO CHE E' OK
		map.put("Cognomi", new String[] { "Rossi", "Verdi", "Bombardelli" });
		map.put("Professioni", new String[] { "Idraulico", "Fornaio", "Professore", "Disoccupato" });

		// 2. Print all the keys of the map.
		print("map", map);
		print("map.keySet()", map.keySet());
		print("map.values()", map.values());

		print("------------------");

		// 3. Print all the values of the map.
		// 4. Print both key and value together using forEach.
		print(map);

		print("------------------");

		// 5. Check if a specific key exists in the map.
		print("map.containsKey(\"Nomi\")", map.containsKey("Nomi"));
		print("map.containsKey(\"banane\")", map.containsKey("banane"));

		print("------------------");

		// 6. Get a value by key — and handle the case where the key doesn't exist.
		print("map.get(\"Professioni\")", map.get("Professioni"));
		print("map.get(\"cipolle\")", map.get("cipolle"));

		// 7. Remove an entry by key.
//		print("------------------");
//		map.remove("Professioni");

		print(map);

		// 8. Iterate with entrySet() and print "key -> value" for each entry.
		print("------------------");
		map.entrySet().forEach(x -> {

			print(x.getKey() + " -> " + String.join(",", x.getValue()));

		});

		// 9. Count how many entries have a value greater than a number you choose.
		print("------------------");

		// v0
		int counter = 0;
		for (Entry<String, String[]> x : map.entrySet()) {
			if (x.getValue().length > 2)
				counter++;
		}
		print("V0: x.getValue().length > 2", counter);

		// v1
		int[] arrayCounter = { 0 };
		map.entrySet().forEach(x -> {
			if (x.getValue().length > 2)
				arrayCounter[0] += 1;

		});

		print("V1: x.getValue().length > 2", arrayCounter[0]);

		// v2
		print("V2: map.entrySet().stream().filter(x -> x.getValue().length > 2).count();",
				map.entrySet().stream().filter(x -> x.getValue().length > 2).count());

		// 10. Build a new List<String> from the map, where each element is "key=value".
		// v0
		List<String> lista = new LinkedList<>();
		map.forEach((k, v) -> {

			print("lista", lista);

			lista.add("%s=%s".formatted(k, "\"" + String.join(",", v) + "\""));

		});

		print("lista", lista);

	}

	private static void print(Map<String, String[]> map) {
		map.forEach((k, v) -> {

			print(k, String.join(",", v));

		});

	}

	private static void print(String banner) {
		System.out.printf("%s\n", banner);
	}

	private static void print(String banner, Object value) {
		System.out.printf("%s: %s\n", banner, value);
	}
}
