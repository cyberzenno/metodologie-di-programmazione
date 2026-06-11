package ex_2_ricette_ingredienti;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.*;

import ex_2_ricette_ingredienti.Ex2_Ricetta.Tipologia;

/**
 * Classe singleton per la gestione di un insieme di ricette, intesa come:
 * aggiunta, rimozione, metodi di filtraggio
 */
public class Ex2_Ricette implements Iterable<Ex2_Ricetta> {

	/** L'istanza della classe singleton */
	private static Ex2_Ricette instance;

	/** L'insieme delle ricette da gestire */
	private HashSet<Ex2_Ricetta> ricette;

	/**
	 * Costruttore privato utilizzato per la costruzione del singleton con
	 * {@link getInstance}
	 */
	private Ex2_Ricette() {
		ricette = new HashSet<Ex2_Ricetta>();
	}

	/**
	 * Ritorna l'unica istanza di Ex2_Ricette. Se non esite ancora, la costruisce
	 * utilizzando il costruttore privato e la imposta per successivi utilizzi.
	 *
	 * @return l'istanza singleton della classe
	 */
	public static Ex2_Ricette getInstance() {

		if (instance == null)
			instance = new Ex2_Ricette();

		return instance;
	}

	/**
	 * 
	 *
	 * @param ricetta
	 */
	public void addRicetta(Ex2_Ricetta ricetta) {
		this.ricette.add(ricetta);
	}

	/**
	 * 
	 *
	 * @param ricetta
	 */
	public void removeRicetta(Ex2_Ricetta ricetta) {
		this.ricette.remove(ricetta);
	}

	/**
	 * 
	 *
	 * @return
	 */
	@Override
	public Iterator<Ex2_Ricetta> iterator() {
		return ricette.iterator();
	}

	/**
	 * 
	 *
	 * @return
	 */
	public Map<Tipologia, Set<Ex2_Ricetta>> getMappaTipologiaRicette() {
		return ricette.stream().collect(groupingBy(x -> x.getTipologia(), toCollection(HashSet::new)));
	}

	/**
	 * 
	 *
	 * @param tipologia
	 * @return
	 */
	public Map<String, List<Integer>> getHashMappaIngredientiQuantitaPerTipologiaRicette(Tipologia tipologia) {
		var result = ricette.stream().filter(x -> x.getTipologia() == tipologia)
				.flatMap(x -> x.getIngredienti().stream())
				.collect(groupingBy(x -> x.getNome(), mapping(x -> x.getQuantitaInGrammi(), toList())));

		return result;

	}

}
