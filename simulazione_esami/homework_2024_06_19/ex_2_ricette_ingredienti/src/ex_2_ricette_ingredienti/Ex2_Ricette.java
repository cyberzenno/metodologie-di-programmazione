package ex_2_ricette_ingredienti;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ex_2_ricette_ingredienti.Ex2_Ricetta.Tipologia;

public class Ex2_Ricette implements Iterable<Ex2_Ricetta>{

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
		Map<Ex2_Ricetta.Tipologia, Set<Ex2_Ricetta>> dummy = null;
		
		return dummy;
	}
	
	public Map<String, List<Integer>> getHashMappaIngredientiQuantitaPerTipologiaRicette() {
		Map<String, List<Integer>> dummy = null;
		
		return dummy;
	}
	
	
	
}
