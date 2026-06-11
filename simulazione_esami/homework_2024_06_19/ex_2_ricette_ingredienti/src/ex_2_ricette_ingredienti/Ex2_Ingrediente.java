package ex_2_ricette_ingredienti;

/**
 * Classe che rappresenta uno degli ingredienti di una ricetta di cucina
 */
public class Ex2_Ingrediente {

	/** Il nome. */
	private String nome;

	/** I grammi da utilizzare. */
	private int grammi;

	/**
	 * Costruttore dell'ingrediente
	 *
	 * @param il dell'ingrediente
	 * @param la quantita' in grammi da utilizzare
	 */
	public Ex2_Ingrediente(String nome, int quantitaInGrammi) {
		this.nome = nome;
		this.grammi = quantitaInGrammi;
	}

	/**
	 * Ritorna il nome dell'ingrediente
	 *
	 * @return il nome dell'ingrediente
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Ritorna la quantita in grammi.
	 *
	 * @return la quantita in grammi
	 */
	public int getQuantitaInGrammi() {
		return grammi;
	}

	/**
	 * Override del metodo toString basato su nome e grammi dell'ingrediente, da
	 * utilizzare principalmente durante la fase di collaudo.
	 *
	 * @return la rappresentazione in stringa dell'ingrediente con formato "nome: grammi"
	 */
	@Override
	public String toString() {
		return "%s: %sg".formatted(nome, grammi);
	}
}
