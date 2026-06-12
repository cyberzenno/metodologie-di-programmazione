package ex2_carte_pokemon;

import java.util.*;

import ex2_carte_pokemon.Ex2_CartaPokemon.TipoPokemon;
import ex2_carte_pokemon.Ex2_CartaPokemon.TipologiaCarta;

public class Ex2_CollaudaCartePokemon {
	public static void main(String[] args) {

		Ex2_Buste buste = Ex2_Buste.getInstance();

		buste.add(new Ex2_Bustina("bronze_2011", creaCarte(1), 10, 2011));
		buste.add(new Ex2_Bustina("silver_2015", creaCarte(5), 50, 2015));
		buste.add(new Ex2_Bustina("bronze_2017", creaCarte(7), 70, 2017));

		for (Ex2_Bustina bustina : buste) {
			System.out.println(bustina.getNome());
			for (Ex2_CartaPokemon carta : bustina.getCarte()) {
				carta.stampa();
			}
			System.out.println();
		}

	}

	private static List<Ex2_CartaPokemon> creaCarte(int n) {

		List<Ex2_CartaPokemon> lista = new ArrayList<>();
		var r = new Random();
		for (int i = 0; i < n; i++) {
			var costo = 10 + r.nextInt(5) * 10;
			var carta = new Ex2_CartaPokemon("pokemon_" + i, TipoPokemon.ACCIAIO, TipologiaCarta.NORMALE, costo);

			if (i % 3 == 0)
				carta = new Ex2_CartaPokemonRara(carta);

			lista.add(carta);
		}

		return lista;
	}
}
