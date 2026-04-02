package esercizisugliarray;

/**
 * Siccome secondo me questi esercizi sono alla base di quasi tutti gli altri,
 * rifaccio Array Flessibile per avere le ideee piu chiare: 1. SplitAt(x) 2.
 * Merge(left, right) 3. InsertAt(x,v) 4. RemoveAt(x) 5. ShiftLeft() 6.
 * ShiftRight()
 */
public class ArrayFlessibile {

	private String[] originale;

	public ArrayFlessibile(String... originale) {
		this.originale = originale;
	}

	/**
	 * Divide l'array originale in due parti
	 * 
	 * @param x rappresenta l'indice di inizio della seconda parta, o anche la
	 *          lunghezza in numero di elementi della prima parte
	 * @return
	 */
	public String[][] splitAt(int x) {

		String[] left = new String[x];
		String[] right = new String[originale.length - x];

		for (int i = 0; i < x; i++) {
			left[i] = originale[i];
		}

		for (int i = x, j = 0; i < originale.length; i++, j++) {
			right[j] = originale[i];
		}

		return new String[][] { left, right };
	}

	public static String[] merge(String[] left, String[] right) {

		String[] merged = new String[left.length + right.length];

		for (int i = 0; i < left.length; i++) {
			merged[i] = left[i];
		}

		for (int i = left.length, j = 0; i < merged.length; i++, j++) {
			merged[i] = right[j];
		}

		return merged;
	}

	/**
	 * Basato sull'array originale, inserisce il valore nella posizione indicata.
	 * Sovrascrive l'array originale e ritorna il nuovo array originale come
	 * riferimento.
	 * 
	 * @param x
	 * @param v
	 * @return
	 */
	public String[] insertAt(int x, String v) {
		String[] nuovoArray = new String[originale.length + 1];

		for (int i = 0; i < x; i++) {
			nuovoArray[i] = originale[i];
		}

		nuovoArray[x] = v;

		for (int i = x; i < originale.length; i++) {
			nuovoArray[i + 1] = originale[i];
		}

		originale = nuovoArray;

		return originale;
	}

	public String[] removeAt(int x) {
		String[] nuovoArray = new String[originale.length - 1];

		for (int i = 0; i < x; i++) {
			nuovoArray[i] = originale[i];
		}

		for (int i = x; i < originale.length - 1; i++) {
			nuovoArray[i] = originale[i + 1];
		}

		originale = nuovoArray;

		return originale;
	}

	public void stampa() {
		ArrayFlessibile.stampa(originale);
	}

	/**
	 * Metodo breve di utilita, quindi statico
	 * 
	 * @param a
	 */
	public static void stampa(String[] a) {
		String stampaQuesto = String.join(", ", a);
		System.out.println(stampaQuesto);
	}

	public static void main(String... args) {
		ArrayFlessibile a = new ArrayFlessibile("A", "B", "X", "Y", "Z");

		// 1. split at
		var s = a.splitAt(2);

		stampa(s[0]);
		stampa(s[1]);

		// 2. merge
		var m = ArrayFlessibile.merge(s[0], s[1]);
		stampa(m);

		// 3. insert at
		a = new ArrayFlessibile("A", "B", "C", "D");
		a.insertAt(2, "X");
		a.stampa();

		// 4. remove at
		a.removeAt(2);
		a.stampa();

	}

}
