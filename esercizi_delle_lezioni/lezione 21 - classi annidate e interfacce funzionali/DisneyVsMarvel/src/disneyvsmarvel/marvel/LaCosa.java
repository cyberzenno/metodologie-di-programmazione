package disneyvsmarvel.marvel;

import disneyvsmarvel.*;

public class LaCosa extends Personaggio implements Supereroe, Marvel {

	@Override
	public void attacca(Supereroe avversario) {

		String questoSupereroe = this.getClass().getSimpleName();
		String ilSuoAvversario = avversario.getClass().getSimpleName();

		System.out.printf("%s spacca tutto e lancia i sassi a %s. Sbam, sbem, sbim!!!\n", questoSupereroe,
				ilSuoAvversario);
	}
}
