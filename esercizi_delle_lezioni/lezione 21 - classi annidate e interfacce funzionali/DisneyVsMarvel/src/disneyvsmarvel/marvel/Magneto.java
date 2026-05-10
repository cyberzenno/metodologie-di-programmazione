package disneyvsmarvel.marvel;
import disneyvsmarvel.*;
public class Magneto extends Personaggio  implements Supereroe, Marvel {

	@Override
	public void attacca(Supereroe avversario) {

		String questoSupereroe = this.getClass().getSimpleName();
		String ilSuoAvversario = avversario.getClass().getSimpleName();

		System.out.printf("%s spara onde magnetiche a %s. Sbzooww...sbzoowwwww!!!\n", questoSupereroe, ilSuoAvversario);
	}
}
