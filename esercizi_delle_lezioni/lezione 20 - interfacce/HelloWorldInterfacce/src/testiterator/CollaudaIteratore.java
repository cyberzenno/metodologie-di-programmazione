package testiterator;

import java.util.Iterator;

public class CollaudaIteratore {
	public static void main(String[] args) {

		Iterable<Integer> iterabile = new NumeriIterabili(1, 2, 3, 4, 5);
		
		for (Integer n : iterabile) {
			System.out.println(n);
		}

		
		System.out.println("-".repeat(10));

		
		Iterator<Integer> iteratore = iterabile.iterator();
		
		while (iteratore.hasNext()) {

			System.out.println(iteratore.next());

		}
	}
}
