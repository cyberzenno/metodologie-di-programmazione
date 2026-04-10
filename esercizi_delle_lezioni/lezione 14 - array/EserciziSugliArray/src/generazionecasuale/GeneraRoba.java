package generazionecasuale;

import java.util.Arrays;
import java.util.Random;

import generazionecasuale.valorifattiincasa.Colore;

/**
 * avendo visto come il prof ha eseguito il Gioco Del Quindici,<br>
 * ho capito che la generazione casuale di "cose" non e' proprio banale<br>
 * se non si hanno gli strumenti necessario alla base<br>
 * un po' come gli array e le matrici, provo a stipulare delle basi
 * elementari<br>
 * da apprendere come strumento.<br>
 * <br>
 * 1. numero singolo da intervallo (intuitivo)<br>
 * 2. lista di numeri da intervallo (duplicati accettati: intuitivo)<br>
 * 3. lista di numeri da intervallo: <br>
 * (duplicati NON accettati: richiede "while" e "contains")<br>
 * 4. singolo da lista di valori<br>
 * 5. lista di valori da lista di valori (duplicati accettati)<br>
 * 6. lista di valori da lista di valori (duplicati NON accettati)<br>
 * 7. mischia lista di valori (anche se non fa parte della "generazione", e'
 * molto importante come concetto)<br>
 * Matrici: magari le vediamo un'altra volta<br>
 * 8. matrice di valori da lista etc (duplicati accettati)<br>
 * 9. matrice di valori da lista etc (duplicati NON accettati)<br>
 * 10. matrice di valori, da matrice di valori (con duplicati)<br>
 * 11. matrice di valori, da matrice di valori (senza duplicati)<br>
 * <br>
 * Queste sono solo alcune idee di combinazioni elementari che mi vengono in
 * mente. Vediamo
 */
public class GeneraRoba {

	private Random r;

	public GeneraRoba() {
		r = new Random();
	}

	/**
	 * 1. numero singolo da intervallo (intuitivo)
	 */
	public int intero(int min, int maxCompreso) {

		// da notare che nextInt il "max" lo intende escluso,
		// come moltissimi metodi in Java
		// questo e' comodissimo quando si lavora con array, indici, liste, etc
		return r.nextInt(min, maxCompreso + 1);
	}

	/**
	 * 2. lista di numeri da intervallo (duplicati accettati: intuitivo)
	 */
	public int[] listaDiInteriConDuplicati(int min, int max, int n) {

		int[] lista = new int[n];

		for (int i = 0; i < n; i++) {
			lista[i] = r.nextInt(min, max);
		}

		return lista;
	}

	/**
	 * 3. lista di numeri da intervallo: <br>
	 * (duplicati NON accettati: richiede "while" e "contains")<br>
	 */
	public int[] listaDiInteriUnici(int min, int max, int n) {

		max += 1;

		throwIfOutOfRange(min, max, n);

		int[] lista = new int[n];

		Arrays.fill(lista, -1);

		// lo strumento da apprendere e':
		// --> CICLO con INCREMENTO CONDIZIONALE
		// il WHILE viene piu intuitivo:
		// "aoh, fino a che non hai finito co' sta roba, non esci!!"

		int estratti = 0;
		while (estratti < n) {

			// ma anche l'intestazione del FOR puo accettare solo
			// (variabile di controllo; condizione)
			// for(int estratti = 0; estratti < n;) {

			int numero = r.nextInt(min, max);

			// lento, ma almeno esce fuori qualcosa
			if (contiene(lista, numero))
				continue;

			lista[estratti++] = numero;
		}

		return lista;
	}

	/*
	 * 4. singolo da lista di valori
	 */
	public Colore colore() {
		Colore[] colori = Colore.values();

		int c = r.nextInt(0, colori.length);

		return colori[c];
	}

	/*
	 * 5. lista di valori da lista di valori (duplicati accettati)
	 */
	public Colore[] colori(int n) {
		Colore[] colori = Colore.values();

		Colore[] coloriGenerati = new Colore[n];
		for (int i = 0; i < n; i++) {

			int c = r.nextInt(0, colori.length);

			coloriGenerati[i] = colori[c];
		}

		return coloriGenerati;
	}

	/*
	 * 6. lista di valori da lista di valori (duplicati NON accettati)
	 */
	public Colore[] coloriUnici(int n) {
		Colore[] colori = Colore.values();

		throwIfOutOfRange(0, colori.length, n);

		Colore[] coloriGenerati = new Colore[n];

		for (int i = 0; i < n;) {

			int c = r.nextInt(0, colori.length);

			Colore colore = colori[c];
			if (contiene(coloriGenerati, colore))
				continue;

			coloriGenerati[i++] = colori[c];
		}

		return coloriGenerati;
	}

	/**
	 * 7. mischia lista di valori<br>
	 * qui il concetto base e' lo SWAP<br>
	 * (anche se non fa parte della "generazione", e' molto importante)
	 */
	public int[] mischiaLista(int[] listaOriginale) {

		int[] lista = listaOriginale.clone();

		for (int i = 0; i < lista.length; i++) {
			int indiceCasuale = r.nextInt(0, lista.length);

			// qui la parte importante e' lo swap
			// (versione simile all'algoritmo Fisher-Yates)
			swap(lista, i, indiceCasuale);
		}

		return lista;
	}

	private void swap(int[] lista, int i, int j) {
		int t = lista[i];
		lista[i] = lista[j];
		lista[j] = t;
	}

	private boolean contiene(int[] array, int valore) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valore)
				return true;
		}

		return false;
	}

	/**
	 * qui i generici <T> farebbero comodissimo
	 */
	private boolean contiene(Colore[] array, Colore valore) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valore)
				return true;
		}

		return false;
	}

	private void throwIfOutOfRange(int min, int max, int n) {
		if (Math.abs(max - min) < n)
			throw new IllegalArgumentException("Non ci sono abbastanza valori per generare valori unici");
	}

	// ---------------------------------------------
	// main
	// ---------------------------------------------
	public static void main(String[] args) {

		var genera = new GeneraRoba();

		var interiUnici = genera.listaDiInteriUnici(1, 90, 5);
		stampa(interiUnici);

		linea();

		var colori = genera.colori(25);
		stampa(colori);

		linea();

		var coloriUnici = genera.coloriUnici(7);
		stampa(coloriUnici);

		linea();

		int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		stampa(lista);
		linea();
		stampa(genera.mischiaLista(lista));

	}

	private static void stampa(int[] lista) {
		Object[] listaDiOggetti = new Object[lista.length];

		for (int i = 0; i < lista.length; i++) {
			listaDiOggetti[i] = lista[i];
		}

		stampa(listaDiOggetti);
	}

	private static void stampa(Object[] lista) {

		final int riga = 5;

		for (int i = 0; i < lista.length; i++) {
			System.out.printf("%3s ", lista[i]);

			if (i % riga == riga - 1)
				System.out.println();
		}
		
		System.out.println();
	}

	private static void linea() {
		System.out.println("-".repeat(50));
	}
}
