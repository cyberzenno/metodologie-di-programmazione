package bananemozzicate;

public class IteratoreDiBanane implements BananasIterator {

	private int i;
	private Banana[] banane;

	public IteratoreDiBanane(Banana... banane) {
		this.banane = banane;
	}

	@Override
	public boolean hasNext() {
		return i < banane.length;
	}

	@Override
	public Banana next() {
		return banane[i++];
	}

}
