package testiterator;

import java.util.Iterator;

public class NumeriIterabili implements Iterable<Integer>{

	private Integer[] numeri;
	
	public NumeriIterabili(Integer... numeri) {
		this.numeri = numeri;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new IteratoreDiNumeri(numeri);
	}
}
