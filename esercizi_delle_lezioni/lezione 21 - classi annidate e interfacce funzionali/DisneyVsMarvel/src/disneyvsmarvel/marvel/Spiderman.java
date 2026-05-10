package disneyvsmarvel.marvel;
import disneyvsmarvel.*;
public class Spiderman extends PeterParker implements Supereroe {

	private DoppiaVita identitaPubblica;


	public Spiderman(PeterParker peterParker) {
		identitaPubblica = peterParker;
	}

	@Override
	public void attacca(Supereroe avversario) {

		String questoSupereroe = this.getClass().getSimpleName();
		String ilSuoAvversario = avversario.getClass().getSimpleName();

		System.out.printf("%s spara le rgnatele come se non ci fosse un domani a %s. Sweeeesshhhh!!!\n", questoSupereroe, ilSuoAvversario);
	}
	

	@Override
	public DoppiaVita assumiIdentitaPubblica() {
		return identitaPubblica;
	}
}
