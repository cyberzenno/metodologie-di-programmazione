package disneyvsmarvel.disney;

import disneyvsmarvel.*;

public class Paperino extends Personaggio implements Disney, DoppiaVita {

	@Override
	public Supereroe assumiIdentitaSegreta() {
		return  new Paperinik(this);
	}

	@Override
	public DoppiaVita assumiIdentitaPubblica() {
		return this;
	}

}
