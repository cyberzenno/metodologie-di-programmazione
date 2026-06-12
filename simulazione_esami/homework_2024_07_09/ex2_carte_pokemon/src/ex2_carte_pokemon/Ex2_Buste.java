package ex2_carte_pokemon;

import java.util.*;
import static java.util.stream.Collectors.*;

//Esiste poi una classe chiamata Ex2_Buste che:
//- può essere istanziata una sola volta;
//- fornisce un meccanismo per iterare sulla collezione delle buste;
public class Ex2_Buste implements Iterable<Ex2_Bustina> {
	private static Ex2_Buste instance;

	private Collection<Ex2_Bustina> bustine;

	private Ex2_Buste() {
		bustine = new HashSet<Ex2_Bustina>();
	}

	public void add(Ex2_Bustina b) {
		bustine.add(b);
	}

	public void remove(Ex2_Bustina b) {
		bustine.remove(b);
	}

	public static Ex2_Buste getInstance() {
		if (instance == null)
			instance = new Ex2_Buste();

		return instance;
	}

	// - ha un metodo getMappaAnnoDiCommercializzazioneNomi realizzato con gli
	// stream (in una unica istruzione e senza l’uso di strutture dati intermedie),
	// che
	// restituisce una mappa che ha per chiavi l’anno di commercializzazione di una
	// busta e
	// come valori l’insieme dei nomi dei pacchetti commercializzati in quell’anno;
	public Map<Integer, Set<String>> getMappaAnnoDiCommercializzazioneNomi() {
		Map<Integer, Set<String>> result = bustine.stream().collect(groupingBy(x -> x.getAnnoDiCommercializzazione(),
				mapping(x -> x.getNome(), toCollection(HashSet::new))));

		return result;
	}

	// - ha un metodo getHashMappaNomePokemonRare realizzato con gli stream (in una
	// unica istruzione e senza l’uso di strutture dati intermedie), che restituisce
	// una mappa
	// che ha per chiavi i nomi di pokemon e come valori una collezione di carte
	// rare
	// esistenti per quel nome di pokemon.
	public Map<String, Set<Ex2_CartaPokemon>> getHashMappaNomePokemonRare() {
		Map<String, Set<Ex2_CartaPokemon>> result = null;

		bustine.stream()
				// prendi tutte le carte
				.flatMap(x -> x.getCarte().stream())
				// seleziona solo quelle rare
				.filter(x -> x instanceof Ex2_CartaPokemonRara)
				.collect(
						//raggruppa per nome 
						groupingBy(x -> x.getNome(), 
								//e mettile in una collezione di tipo HashSet
								toCollection(HashSet::new)));

		return result;
	}

	@Override
	public Iterator<Ex2_Bustina> iterator() {
		return bustine.iterator();
	}
}
