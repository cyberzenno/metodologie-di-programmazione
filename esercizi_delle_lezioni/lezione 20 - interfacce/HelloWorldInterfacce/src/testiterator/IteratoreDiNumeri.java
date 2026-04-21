package testiterator;

import java.util.Iterator;

public class IteratoreDiNumeri implements Iterator<Integer> {

	private int indice;
	private Integer[] numeri;

	public IteratoreDiNumeri(Integer... numeri) {
		this.numeri = numeri;
		this.indice = 0;
	}

	@Override
	public boolean hasNext() {
		return indice < numeri.length;
	}

	@Override
	public Integer next() {
		return numeri[indice++];
	}
}
