package disneyvsmarvel.disney;

import disneyvsmarvel.*;

public class Pippo extends Personaggio  implements Disney, DoppiaVita {

	@Override
	public Supereroe assumiIdentitaSegreta() {
		return new Superpippo();
	}

	@Override
	public DoppiaVita assumiIdentitaPubblica() {
		// TODO Auto-generated method stub
		return this;
	}

}