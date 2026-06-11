package ex2cartepokemon;

/**
 * Classe che rappresenta una carta pokemon.
 */
public class Ex2_CartaPokemon {
	/** Tutti i tipi possibili di pokemon */
	public enum TipoPokemon {
		NORMALE, FUOCO, ACQUA, ERBA, ELETTRO, GHIACCIO, LOTTA, VELENO, TERRA, VOLANTE, PSICO, COLEOTTERO, ROCCIA,
		SPETTRO, DRAGO, BUIO, ACCIAIO, FOLLETTO
	}

	/** Tutti i tipi possibili di carte pokemon */
	public enum TipoCarta {
		NORMALE, SHINING, REVERSE, V, V_MAX, G, G_MAX
	}

	/** Nome del pokemon */
	private String nome;

	/** Tipo del pokemon */
	private TipoPokemon tipoPokemon;
	/** Tipo della carta pokemon */
	private TipoCarta tipoCarta;
	/** I punti Health Points del pokemon */
	private int puntiHP;
	
	/**
	 * Restituisce il nome del pokemon.
	 *
	 * @return il nome del pokemon
	 */
	public String getNome() {
	    return nome;
	}

	/**
	 * Restituisce il tipo del pokemon.
	 *
	 * @return il tipo del pokemon
	 */
	public TipoPokemon getTipoPokemon() {
	    return tipoPokemon;
	}

	/**
	 * Restituisce il tipo della carta.
	 *
	 * @return il tipo della carta
	 */
	public TipoCarta getTipoCarta() {
	    return tipoCarta;
	}

	/**
	 * Restituisce i punti Health Points del pokemon
	 *
	 * @return i punti HP del pokemon
	 */
	public int getPuntiHP() {
	    return puntiHP;
	}

	
	/**
	 * Override del metodo toString, che ritorna la stringa costruita concatenando:
	 * nome, tipo pokemon, tipologia carta, punti HP.
	 *
	 * @return la stringa costruita concatenando: nome, tipo pokemon, tipologia carta, punti HP.
	 */
	@Override
	public String toString() {
		return "%s, %s, %s, %s".formatted(nome, tipoPokemon, tipoCarta, puntiHP);
	}
	
	/**
	 * Stampa a console la stringa costruita concatenando: nome, tipo pokemon, tipologia carta, punti HP.
	 */
	public void stampa() {
		System.out.println(this);
	}
}
