import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Classe di esercizio che rappresenta un "array flessibile" di numeri
 * interi.<br>
 * Gia' che ci siamo, iniziamo ad utilizzare anche i commenti per Java Doc.<br>
 */
public class ListaDiInteri {

	private int[] numeri;

	public ListaDiInteri(int... numeri) {
		this.numeri = numeri;
	}

	public int dimensione() {
		return numeri.length;
	}

	/**
	 * Override sul metodo Object.toString()<br>
	 * per ridefinire come trasformiamo questo oggetto in una stringa.
	 */
	public String toString() {
		var numeriComeStringa = "";

		for (int i = 0; i < numeri.length; i++) {
			numeriComeStringa += numeriComeStringa == "" ? numeri[i] : ", " + numeri[i];
		}

		return "[" + numeriComeStringa + "]";
	}

	/**
	 * ritorna l'elemento ennesimo, in base 1. l'esercizio non definisce
	 * esattamente, ma considerando la parola stessa "dammi il primo elemento"
	 * significa dammi l'elemento di indice 0.
	 * 
	 * @param posizioneBase1
	 * @return l'elemento ennesimo della lista
	 */
	public int dammiElementoEnnesimo(int posizioneBase1) {
		return numeri[posizioneBase1 - 1];
	}

	/**
	 * Dato un numero, ritorna la posizione Base 1 dell'elemento, visto che sopra
	 * utilizziamo lo stesso concetto In caso non esista, ritorna -1
	 * 
	 * @param n
	 * @return posizioneBase1
	 */
	public int dammiPosizioneElemento(int n) {
		for (int i = 0; i < numeri.length; i++) {
			if (numeri[i] == n)
				return i + 1;
		}
		return -1;
	}

	/**
	 * Controlla se la lista contiene un valore, utilizzando il metodo gia
	 * implementato "dammiPosizioneElemento".
	 * 
	 * @param n
	 * @return
	 */
	public boolean contieneIntero(int n) {
		return dammiPosizioneElemento(n) >= 1;
	}

	/**
	 * Secondo Clean Code di Robert Martin, il codice dovrebbe essere scritto in
	 * modo tale affinche' non ci sia bisogno di commenti. Talmente chiaro, che
	 * parla da se'.
	 * 
	 * @param n
	 */
	public void aggiungiInCoda(int n) {
		numeri = Arrays.copyOf(numeri, dimensione() + 1);

		numeri[dimensione() - 1] = n;
	}

	/**
	 * Aggiunge un elemento nella posizione specificata in base 1 (primo == 1,
	 * secondo ==2, et cetera) Nota: a posteriori, e' stata una faticaccia
	 * 
	 * @param posizioneBase1
	 * @param numero
	 */
	public void aggiungiInPosizione(int posizioneBase1, int numero) {
		var nuovoArray = new int[dimensione() + 1];

		var posizioneBase0 = posizioneBase1 - 1;

		// copia prima del numero
		for (int i = 0; i < posizioneBase0; i++) {
			nuovoArray[i] = numeri[i];
		}

		// aggiungi numero
		nuovoArray[posizioneBase0] = numero;

		// copia dopo il numero
		for (int i = posizioneBase0; i < dimensione(); i++) {
			nuovoArray[i + 1] = numeri[i];
		}

		numeri = nuovoArray;
	}

	public void eliminaPrimaOccorrenza(int numero) {

		if(!contieneIntero(numero))
			return;
		
		var nuovoArray = new int[dimensione() - 1];		
		
		//non ho idea di come si fa sta roba
		//quindi, gli esercizi di base per capire, sono:
		
		//1. AGGIUNGI ELEMENTO A UN ARRAY:
		// - in testa, in coda, in un indice preciso
		
		//2. RIMUOVI ELEMENTO DA UN ARRAY:
		// - dalla testa, dalla coda, da un indice preciso
		
		//3. che in realta', tutta la roba sopra implica di capire bene:
		// - AGGIUNGI UN ELEMENTO IN UN INDICE PRECISO
		// - RIMUOVI ELEMENTO DA UN INDICE PRECISO
		// - tutto il reso viene dopo
		
		//Da notare che sono circa 180 righe di codice per 1 esercizio su 15 degli array
		//Sono passate 4 ore di studio, e mi chiedo cosa abbia imparato?
		
		
		for (int i = 0; i < numeri.length; i++) {
			
		}
		

	}

	/**
	 * Per comodita' di esecuzione e collaudo, mettiamo l'ormai ben noto metodo
	 * <i>main</i><br>
	 * direttamente nella classe stessa, visto anche che ne dobbiamo fare a
	 * centinaia di esercizi.
	 * 
	 * @param args Il solito array di parametri, qui definito come esempio nella
	 *             modalita' "parametri variabili"
	 */
	public static void main(String... args) {

		var lista = new ListaDiInteri(new int[] { 1, 2, 3, 4 });

		assertAndPrint(3, lista.dammiElementoEnnesimo(3));
		assertAndPrint(4, lista.dammiElementoEnnesimo(4));

		assertAndPrint(1, lista.dammiPosizioneElemento(1));
		assertAndPrint(2, lista.dammiPosizioneElemento(2));

		assertAndPrint("contiene 4?", true, lista.contieneIntero(4));
		assertAndPrint("contiene 5?", false, lista.contieneIntero(5));

		lista.aggiungiInCoda(5);

		assertAndPrint("contiene 5?", true, lista.contieneIntero(5));

		lista.aggiungiInPosizione(6, -6);

		System.out.println(lista);

	}

	private static void assertAndPrint(Object expected, Object actual) {

		System.out.println(expected + " == " + actual + " --> " + (expected == actual));

	}

	private static void assertAndPrint(String message, Object expected, Object actual) {

		System.out.println(message + " " + expected + " == " + actual + " --> " + (expected == actual));

	}
}
