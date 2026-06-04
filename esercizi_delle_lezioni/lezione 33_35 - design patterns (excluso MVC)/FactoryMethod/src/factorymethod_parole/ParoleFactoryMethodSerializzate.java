package factorymethod_parole;

public class ParoleFactoryMethodSerializzate extends ParoleFactoryMethod {

	@Override
	protected Parole newParole() {	
		return new ParoleSuFileSerializzato("paroleSerializzate.qualcosa");
	}

}
