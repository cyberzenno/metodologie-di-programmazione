import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollaudaStream {
	public static void main(String[] args) {

		// 1. Creazione ed utilizzo immediato
		Stream<?> streamDiCose = Stream.of(1, 2, 3, 4, 5);
		streamDiCose.forEach(x -> print("streamDiCose: ", x));

		print("-------");

		streamDiCose = Stream.of("Mela", "Pera", "Banana", "Fragola");
		streamDiCose.forEach(x -> print("streamDiCose: ", x));

		print("-------");

		// 2. Conversione a stream da collezione esistente
		ArrayList<Number> listaDiRobe = new ArrayList<Number>();
		listaDiRobe.add(5);
		listaDiRobe.add(6.0);
		listaDiRobe.add(7.1);

		// listaDiRobe.forEach(null);
		// nota, ovviamente questo non e' il foreach di Stream
		listaDiRobe.stream().forEach(x -> print("listaDiRobe: ", x));

		print("-------");

		// 3. Stream di roba custom
		streamDiCose = Stream.of(new Frutta("Mela"), new Frutta("Pera"), new Frutta("Banana"), new Frutta("Fragola"));
		streamDiCose.forEach(x -> print("streamDiCose: ", x));

	}

	private static void print(String banner) {
		System.out.printf("%s\n", banner);
	}

	private static void print(String banner, Object value) {
		System.out.printf("%s: %s\n", banner, value);
	}
}
