package factorymethod_parole;

public class ParoleFactoryMethodFileDiTesto extends ParoleFactoryMethod {

	@Override
	protected Parole newParole(){
		return  new ParoleSuFileDiTesto("paroleSuFileDiTesto.txt");
	}

}
