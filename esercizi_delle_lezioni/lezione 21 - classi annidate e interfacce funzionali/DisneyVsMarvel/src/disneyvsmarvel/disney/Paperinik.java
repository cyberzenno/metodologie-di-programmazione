package disneyvsmarvel.disney;
import disneyvsmarvel.*;
public class Paperinik extends Paperino implements Supereroe {

	private DoppiaVita identitaPubblica;
	
	public Paperinik(Paperino identitaPubblica) {
		this.identitaPubblica = identitaPubblica;
	}
	
	@Override
	public void attacca(Supereroe avversario) {

		String questoSupereroe = this.getClass().getSimpleName();
		String ilSuoAvversario = avversario.getClass().getSimpleName();

		System.out.printf("%s spara con la pistola evroniana a %s. Pzzeeewwsh!!\n", questoSupereroe, ilSuoAvversario);
	}
	
	@Override
	public DoppiaVita assumiIdentitaPubblica() {
		return identitaPubblica;
	}
}
