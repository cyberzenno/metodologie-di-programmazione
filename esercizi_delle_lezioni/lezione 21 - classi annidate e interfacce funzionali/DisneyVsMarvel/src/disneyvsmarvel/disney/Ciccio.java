package disneyvsmarvel.disney;

import disneyvsmarvel.*;

public class Ciccio extends Personaggio implements Disney, DoppiaVita {

	@Override
	public Supereroe assumiIdentitaSegreta() {
		
		return new Ciccionik(this);
	}

	@Override
	public DoppiaVita assumiIdentitaPubblica() {
		return this;
	}

}