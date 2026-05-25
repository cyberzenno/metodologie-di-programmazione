import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class CollaudaCollectors {
	public static void main(String[] args) {
		List<Frutta> listaDi = List.of(new Frutta("Mela"), new Frutta("Pera"), new Frutta("Banana"),
				new Frutta("Fragola"));

		Supplier<CollectorSummary> statoIniziale = () -> new CollectorSummary();
		BiConsumer<CollectorSummary, Frutta> accumulatore = (statoPrecedente, elemento) -> {
			// questo e' il cuore del foreach
			String nomeFrutto = elemento.getNome();

			statoPrecedente.Count += 1;
			statoPrecedente.NumeroDiLettere += nomeFrutto.length();

			for (int i = 0; i < nomeFrutto.length(); i++) {

				String c = ((Character) nomeFrutto.charAt(i)).toString();

				statoPrecedente.MappaOccorrenze.put(c, statoPrecedente.MappaOccorrenze.getOrDefault(c,0)+1);

			}
		};
		BiConsumer<CollectorSummary, CollectorSummary> combinatoreUsatoSoloInParallelo = (statoDiUnThread,
				statoDiUnAltroThread) -> {
			// facci quello che ti pare, tanto non e' in uso
		};

		CollectorSummary sommario = listaDi.stream().collect(statoIniziale, accumulatore,
				combinatoreUsatoSoloInParallelo);

		print("sommario\n------");
		print(sommario.toString());
	}

	private static void print(String banner) {
		System.out.printf("%s\n", banner);
	}

	private static void print(String banner, Object value) {
		System.out.printf("%s: %s\n", banner, value);
	}
}
