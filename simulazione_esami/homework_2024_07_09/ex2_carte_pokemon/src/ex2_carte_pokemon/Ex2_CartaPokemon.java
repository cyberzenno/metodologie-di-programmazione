package ex2_carte_pokemon;

import java.util.Objects;

public class Ex2_CartaPokemon {
	public enum TipoPokemon {
		NORMALE, FUOCO, ACQUA, ERBA, ELETTRO, GHIACCIO, LOTTA, VELENO, TERRA, VOLANTE, PSICO, COLEOTTERO, ROCCIA,
		SPETTRO, DRAGO, BUIO, ACCIAIO, FOLLETTO
	}

	public enum TipologiaCarta {
		NORMALE, SHINING, REVERSE, V, V_MAX, G, G_MAX
	}

	private String nome;
	private TipoPokemon tipoPokemon;
	private TipologiaCarta tipologiaCarta;
	private int puntiHP;

	public Ex2_CartaPokemon() {
	}

	/**
	 * @param nome
	 * @param tipoPokemon
	 * @param tipologiaCarta
	 * @param puntiHP
	 */
	public Ex2_CartaPokemon(String nome, TipoPokemon tipoPokemon, TipologiaCarta tipologiaCarta, int puntiHP) {
		this.nome = nome;
		this.tipoPokemon = tipoPokemon;
		this.tipologiaCarta = tipologiaCarta;
		this.puntiHP = puntiHP;
	}

	public String getNome() {
		return nome;
	}

	public TipoPokemon getTipoPokemon() {
		return tipoPokemon;
	}

	public TipologiaCarta getTipologiaCarta() {
		return tipologiaCarta;
	}

	public int getPuntiHP() {
		return puntiHP;
	}

	/**
	 * stringa costruita concatenando: nome, tipo pokemon, tipologia carta, puntiHP.
	 */
	@Override
	public String toString() {
		return "%s, %s, %s, %s".formatted(nome, tipoPokemon, tipologiaCarta, puntiHP);
	}

	/**
	 * stampa la rappresentazione stringa costruita concatenando: nome, tipo pokemon, tipologia
	 * carta, puntiHP.
	 */
	public void stampa() {
		System.out.println(this);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, puntiHP, tipoPokemon, tipologiaCarta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex2_CartaPokemon other = (Ex2_CartaPokemon) obj;
		return Objects.equals(nome, other.nome) && puntiHP == other.puntiHP && tipoPokemon == other.tipoPokemon
				&& tipologiaCarta == other.tipologiaCarta;
	}
	
	
}
