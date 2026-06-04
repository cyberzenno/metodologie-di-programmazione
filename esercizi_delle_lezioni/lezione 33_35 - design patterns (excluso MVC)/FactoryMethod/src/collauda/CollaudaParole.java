package collauda;

import java.util.Random;

import factorymethod_parole.*;

public class CollaudaParole {
	public static void main(String[] args) {

		ParoleFactoryMethod factory = new ParoleFactoryMethodSerializzate(); // vs ParoleFactoryMethodSerializzate

		Parole parole = factory.getParole();

		parole.aggiungi(parolaCasuale());

		parole.stampa();
	}

	private static Random random = new Random();

	private static String parolaCasuale() {

		String[] parole = { "mela", "pera", "banana", "coccodrillo", "motorino", "poesia", "rosa", "fiore", "arancia",
				"montagna", "vento", "tastiera", "luna", "specchio" };

		return parole[random.nextInt(parole.length - 1)];
	}
}
