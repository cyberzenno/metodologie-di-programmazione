package bananemozzicate;

public class Banana implements Cloneable{
	private boolean mozzicata;

	public boolean isMozzicata() {
		return mozzicata;
	}

	public void mozzica() {
		this.mozzicata = true;
	}

	@Override
	public String toString() {
		return "%s - Banana %s".formatted(this.hashCode(), mozzicata ? "mozzicata, bleah!!" : "intera!");
	}
	
	/**
	 * Da notare che per fare questo famoso clone, bisogna esplicitarlo in ogni singola class
	 */
	@Override
	public Banana clone() {
		try {
			return (Banana) super.clone();
		} catch (Exception e) {
			// do nothing
		}

		return null;
	}
}
