package disneyvsmarvel.disney;
import disneyvsmarvel.*;
public class Superpippo extends Ciccio implements Supereroe {

	private DoppiaVita identitaPubblica;

	@Override
	public void attacca(Supereroe avversario) {

		String questoSupereroe = this.getClass().getSimpleName();
		String ilSuoAvversario = avversario.getClass().getSimpleName();

		System.out.printf("%s sferra una stivalata a molla a %s. Sboboiiinggg!!!\n", questoSupereroe, ilSuoAvversario);
	}
	
	@Override
	public DoppiaVita assumiIdentitaPubblica() {
		return identitaPubblica;
	}
}

