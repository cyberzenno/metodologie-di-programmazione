package bananemozzicate;

public class BananeIterabili implements IterableBananas, Cloneable {

	private Banana[] banane;

	public BananeIterabili(Banana... banane) {
		this.banane = banane;
	}

	@Override
	public IteratoreDiBanane iterator() {
		return new IteratoreDiBanane(banane);
	}

	/**
	 * Da notare che per fare questo famoso clone, bisogna esplicitarlo in ogni singola class
	 */
	@Override
	public BananeIterabili clone() {
		try {
			return (BananeIterabili) super.clone();
		} catch (Exception e) {
			// do nothing
		}

		return null;
	}
	
	/**
	 * Altrimenti uno si fa un customClone e copia quello che gli pare
	 * @return
	 */
	public BananeIterabili deepClone() {
		Banana[] bananeClonate = new Banana[banane.length];
		
		for (int i = 0; i < banane.length; i++) {
			bananeClonate[i] = banane[i].clone();
		}
		
		return new BananeIterabili(bananeClonate);
	}
}
