package disneyvsmarvel.disney;

import disneyvsmarvel.*;

public class Ciccionik extends Ciccio implements Supereroe {
	private DoppiaVita identitaPubblica;

	public Ciccionik(Ciccio ciccio) {
		identitaPubblica = ciccio;
	}

	@Override
	public void attacca(Supereroe avversario) {

		String questoSupereroe = this.getClass().getSimpleName();
		String ilSuoAvversario = avversario.getClass().getSimpleName();

		System.out.printf("%s lancia le palle di lardo a neutroni a %s. Sblaaarrdddabommm!!!\n", questoSupereroe,
				ilSuoAvversario);
	}
	
	@Override
	public DoppiaVita assumiIdentitaPubblica() {
		return identitaPubblica;
	}
}
