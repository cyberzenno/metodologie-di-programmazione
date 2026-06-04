package factorymethod_parole;

public abstract class ParoleFactoryMethod {

	public Parole getParole() {
		Parole paroleRepository = newParole();
		paroleRepository.carica();
		return paroleRepository;
	}
	
	protected abstract Parole newParole();

}
