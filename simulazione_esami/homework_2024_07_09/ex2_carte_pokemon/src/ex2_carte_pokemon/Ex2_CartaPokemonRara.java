package ex2_carte_pokemon;

public class Ex2_CartaPokemonRara extends Ex2_CartaPokemon {
	private Ex2_CartaPokemon cartaDaDecorare;

	private static final String RARA_DECORATION = "**** RARA ****";

	/**
	 * @param cartaDaDecorare
	 */
	public Ex2_CartaPokemonRara(Ex2_CartaPokemon cartaDaDecorare) {
		this.cartaDaDecorare = cartaDaDecorare;
	}

	@Override
	public String getNome() {
		return cartaDaDecorare.getNome();
	}

	@Override
	public TipoPokemon getTipoPokemon() {
		return cartaDaDecorare.getTipoPokemon();
	}

	@Override
	public TipologiaCarta getTipologiaCarta() {
		return cartaDaDecorare.getTipologiaCarta();
	}

	@Override
	public int getPuntiHP() {
		return cartaDaDecorare.getPuntiHP();
	}

	@Override
	public void stampa() {
		System.out.println(RARA_DECORATION);
		cartaDaDecorare.stampa();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
