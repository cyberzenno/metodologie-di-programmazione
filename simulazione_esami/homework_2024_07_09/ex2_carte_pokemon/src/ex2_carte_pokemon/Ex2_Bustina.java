package ex2_carte_pokemon;

import java.util.Collection;
import java.util.Iterator;

//Ogni bustina ha:
//- nome
//- una collezione di carte Pokemon
//- costo in euro
//- anno di commercializzazione
public class Ex2_Bustina implements Iterable<Ex2_CartaPokemon> {
	private String nome;
	private Collection<Ex2_CartaPokemon> carte;
	private double costoInEuro;
	private int annoDiCommercializzazione;

	/**
	 * @param nome
	 * @param carte
	 * @param costoInEuro
	 * @param annoDiCommercializzazione
	 */
	public Ex2_Bustina(String nome, Collection<Ex2_CartaPokemon> carte, double costoInEuro,
			int annoDiCommercializzazione) {
		this.nome = nome;
		this.carte = carte;
		this.costoInEuro = costoInEuro;
		this.annoDiCommercializzazione = annoDiCommercializzazione;
	}

	public String getNome() {
		return nome;
	}

	public Collection<Ex2_CartaPokemon> getCarte() {
		return carte;
	}

	public double getCostoInEuro() {
		return costoInEuro;
	}

	public int getAnnoDiCommercializzazione() {
		return annoDiCommercializzazione;
	}

	@Override
	public Iterator<Ex2_CartaPokemon> iterator() {
		return carte.iterator();
	}

}
