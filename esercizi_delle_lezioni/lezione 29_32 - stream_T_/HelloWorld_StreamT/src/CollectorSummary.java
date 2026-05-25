import java.util.HashMap;
import java.util.Map;

public class CollectorSummary {
	public int Count;
	public int NumeroDiLettere;
	public Map<String, Integer> MappaOccorrenze;

	private class LocalCollector {
		public String value = "";
	}

	public String MappaOccorrenzeAsString() {

		LocalCollector _collector = new LocalCollector();

		MappaOccorrenze.forEach((k, v) -> {

			_collector.value += ", [%s, %s]".formatted(k, v);
		});

		return _collector.value;
	}

	public CollectorSummary() {
		MappaOccorrenze = new HashMap<String, Integer>();
	}

	@Override
	public String toString() {
		return "Count: %s\nNumeroDiLettere: %s\nMappaOccorrenze: %s\n".
				formatted(Count, NumeroDiLettere, MappaOccorrenzeAsString());
	}
}
