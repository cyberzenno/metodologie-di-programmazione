package esercizisugliarray;

/**
 * Con questo esercizio cerco di fare ordine negli strumenti logici necessari
 * per manipolare gli array. <br>
 * Secondo me, partendo da questi, viene poi piu intuitivo fare altri eserci,
 * considerando questi come rudimenti di base. <br>
 * In ordine: - splitAt<br>
 * - merge(left, right)<br>
 * - insertAt(x, v)<br>
 * - removeAt(x)<br>
 * - shiftLeft()<br>
 * - shiftRight()<br>
 */
public class ArrayFlessibileV0 {

	private String[] originale;

	/**
	 * costruttore di default che accetta: una, tante o nessuna stringa, divise o in
	 * forma di array veramente comodo
	 * 
	 * @param originale
	 */
	public ArrayFlessibileV0(String... originale) {
		this.originale = originale;
	}

	/**
	 * ritorna l'array originale su cui e' basato questo array flessibile
	 * 
	 * @return
	 */
	public String[] getArray() {
		return originale;
	}

	/**
	 * ritorna la lunghezza dell'array originale chiamarla dimensione, mi aiuta a
	 * "sentire" meglio il concetto (non so bene perche', ma va bene cosi)
	 * 
	 * @return
	 */
	public int dimensione() {
		return originale.length;
	}

	/**
	 * 1) SPLIT AT:<br>
	 * Qui veniamo al primo esercizio per me fondamentale: spezzare un array credo
	 * sia la prima parte necessaria ma non immediatamente intuitiva
	 * 
	 * @param x
	 * @return
	 */
	public ArrayFlessibileV0[] splitAt(int x) {

		String[] left = new String[x];
		String[] right = new String[dimensione() - x];

		for (int i = 0; i < x; i++) {
			left[i] = originale[i];
		}

		for (int i = 0; i < dimensione() - x; i++) {
			right[i] = originale[i + x];
		}

		return new ArrayFlessibileV0[] { new ArrayFlessibileV0(left), new ArrayFlessibileV0(right) };
	}

	/**
	 * 2) MERGE::<br>
	 * il secondo punto quasi automatico, e' unire due array queste sono le mosse
	 * fondamentali per manipolare meglio tutte le altre operazioni
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static ArrayFlessibileV0 merge(String[] left, String[] right) {
		String[] merged = new String[left.length + right.length];

		for (int i = 0; i < left.length; i++) {
			merged[i] = left[i];
		}

		for (int i = 0; i < right.length; i++) {
			merged[left.length + i] = right[i];
		}

		return new ArrayFlessibileV0(merged);
	}

	/**
	 * questo invece, e' solo un esempio che una volta fatto il merge, possiamo fare
	 * altre operazioni simili, solo usando il merge cmq, non le reputo fondamentali
	 * come il merge
	 * 
	 * @param lista
	 */
	public void append(String... lista) {
		originale = merge(originale, lista).getArray();
	}

	/**
	 * questo invece, e' solo un esempio che una volta fatto il merge, possiamo fare
	 * altre operazioni simili, solo usando il merge cmq, non le reputo fondamentali
	 * come il merge
	 * 
	 * @param lista
	 */
	public void prepend(String... lista) {
		originale = merge(lista, originale).getArray();
	}

	/**
	 * 3) INSERT AT:<br>
	 * questo e' un altro fondamentale: inserire un elemento all'inizio o alla fine
	 * e' intuitivo inserirlo nel mezzo invece, richiede di avere dimestichezza con
	 * il primo fondamento SPLIT AT
	 * 
	 * @param x
	 * @param v
	 */
	public void insertAt(int x, String v) {
		String[] newArray = new String[dimensione() + 1];

		for (int i = 0; i < x; i++) {

			newArray[i] = originale[i];
		}

		newArray[x] = v;

		for (int i = x; i < dimensione(); i++) {
			newArray[i + 1] = originale[i];
		}

		originale = newArray;
	}

	/**
	 * 4) REMOVE AT:<br>
	 * quasi l'inverso di INSERT AT, aiuta a chiudere il cerchio dei quello che di
	 * base manca all'array fondamentale: modificarne la dimensione, aggiungendo o
	 * rimuovendo elementi anche questo si basa sullo SPLIT iniziale
	 * 
	 * @param x a differenza della "i", preferisco usare "x". mi da l'idea di una
	 *          cosa piu marcata e piu facile da individuare in mezzo ad altre
	 *          variabili. inoltre, rappresenta sia l'indice finale, che il numero
	 *          di elementi prima dell'elemento da rimuovere
	 * @param v
	 */
	public void removeAt(int x) {
		String[] newArray = new String[dimensione() - 1];

		for (int i = 0; i < x; i++) {
			newArray[i] = originale[i];
		}

		for (int i = x; i < dimensione() - 1; i++) {
			newArray[i] = originale[i + 1];
		}

		originale = newArray;
	}

	/**
	 * 5. SHIFT LEFT:
	 * 
	 * D A B C --> A B C D un altro metodo che trovo interessante e' lo shift "- 1"
	 * aiuta a capire come traslare da una parte o da un altra quando ce n'e'
	 * bisogno
	 */
	public void shiftLeft() {
		String first = originale[0];

		for (int i = 0; i < dimensione() - 1; i++) {
			originale[i] = originale[i + 1];
		}

		originale[dimensione() - 1] = first;
	}

	/**
	 * 6. SHIFT RIGHT:
	 * 
	 * B C D A --> A B C D
	 * mentre lo shift +1 introduce anche lo scorrimento dalla fine a 0
	 */
	public void shiftRight() {
		String last = originale[dimensione() - 1];

		for (int i = dimensione() - 1; i > 0; i--) {
			originale[i] = originale[i - 1];
		}

		originale[0] = last;
	}

	/**
	 * metodo di comfort
	 */
	public String toString() {
		return String.join(", ", originale);
	}

	/**
	 * metodo di comfort
	 */
	public void stampa() {
		System.out.println(this.toString());
	}

	/**
	 * metodo di collaudo
	 * 
	 * @param args
	 */
	public static void main(String... args) {
		ArrayFlessibileV0 a = new ArrayFlessibileV0("A", "B", "C", "D");

		// 1. split at
		var x = a.splitAt(2);

		x[0].stampa();
		x[1].stampa();

		// 2. merge
		a = ArrayFlessibileV0.merge(x[0].getArray(), x[1].getArray());
		a.stampa();

		// 3. insert at
		a.insertAt(2, "X");
		a.stampa();

		// 4. remove at
		a.removeAt(2);
		a.stampa();

		// 5. shift left
		a = new ArrayFlessibileV0("D", "A", "B", "C");

		a.stampa();

		a.shiftLeft();

		a.stampa();

		// 6. shift right
		a = new ArrayFlessibileV0("B", "C", "D", "A");

		a.stampa();

		a.shiftRight();

		a.stampa();

	}
}
