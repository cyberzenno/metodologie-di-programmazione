package ex_2_ricette_ingredienti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.*;

import ex_2_ricette_ingredienti.Ex2_Ricetta.Tipologia;

public class Ex2_Ricette implements Iterable<Ex2_Ricetta> {

	private static Ex2_Ricette instance;

	private ArrayList<Ex2_Ricetta> ricette;

	private Ex2_Ricette() {
		ricette = new ArrayList<Ex2_Ricetta>();
	}

	public static Ex2_Ricette getInstance() {

		if (instance == null)
			instance = new Ex2_Ricette();

		return instance;
	}

	public void addRicetta(Ex2_Ricetta ricetta) {
		this.ricette.add(ricetta);
	}

	public void removeRicetta(Ex2_Ricetta ricetta) {
		this.ricette.remove(ricetta);
	}

	@Override
	public Iterator<Ex2_Ricetta> iterator() {
		return ricette.iterator();
	}

	public Map<Tipologia, Set<Ex2_Ricetta>> getMappaTipologiaRicette() {
		return ricette.stream().collect(groupingBy(x -> x.getTipologia(), toCollection(HashSet::new)));
	}

	public Map<String, List<Integer>> getHashMappaIngredientiQuantitaPerTipologiaRicette(Tipologia tipologia) {
		var result = ricette
				.stream()
				.filter(x -> x.getTipologia() == tipologia)
				.flatMap(x->x.getIngredienti().stream())
				.collect(
						groupingBy(x-> x.getNome(), 
								mapping(x-> x.getQuantitaInGrammi(), 
										toList()
										)
								)
						);

		return result;

	}

}
