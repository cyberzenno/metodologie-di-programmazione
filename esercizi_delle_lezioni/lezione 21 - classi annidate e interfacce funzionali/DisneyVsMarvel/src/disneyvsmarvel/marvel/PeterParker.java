package disneyvsmarvel.marvel;

import disneyvsmarvel.*;

public class PeterParker extends Personaggio  implements Marvel, DoppiaVita {

	@Override
	public Supereroe assumiIdentitaSegreta() {
		return new Spiderman(this);
	}

	@Override
	public DoppiaVita assumiIdentitaPubblica() {
		return this;
	}

}