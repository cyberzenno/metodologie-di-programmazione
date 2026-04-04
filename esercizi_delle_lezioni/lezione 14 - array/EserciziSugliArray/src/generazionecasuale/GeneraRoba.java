package generazionecasuale;

import java.util.Random;

/**
 * avendo visto come il prof ha eseguito il Gioco Del Quindici,<br>
 * ho capito che la * generazione casuale di "cose" non e' proprio banale<br>
 * se non si hanno gli strumenti necessario alla base<br>
 * un po' come gli array e le matrici, provo a stipulare delle basi elementari
 * <br>
 * da apprendere come strumento.<br>
 * <br>
 * 1. numero singolo da intervallo<br>
 * 2. lista di numeri da intervallo (duplicati accettati)<br>
 * 3. lista di numeri da intervallo (duplicati NON accettati)<br>
 * 4. singolo da lista di valori<br>
 * 5. lista di valori da lista di valori (duplicati accettati)<br>
 * 6. lista di valori da lista di valori (duplicati NON accettati)<br>
 * 7. matrice di valori da lista etc (duplicati accettati)<br>
 * 8. matrice di valori da lista etc (duplicati NON accettati)<br>
 * 9. matrice di valori, da matrice di valori (con duplicati)<br>
 * 10. matrice di valori, da matrice di valori (senza duplicati)<br>
 * <br>
 * Queste sono solo alcune idee di combinazioni elementari che mi vengono in
 * mente. Vediamo
 */
public class GeneraRoba {

	private Random r;

	public GeneraRoba() {
		r = new Random();
	}

	public int intero(int daCompreso, int aCompreso) {

		// da notare che nextInt il "max" lo intende escluso,
		// come moltissimi metodi in Java
		// questo e' comodissimo quando si lavora con array, indici, liste, etc
		return r.nextInt(daCompreso, aCompreso + 1);
	}

	public int[] listaDiInteriConDuplicati(int min, int max, int n) {

		int[] lista = new int[n];

		for (int i = 0; i < n; i++) {
			lista[i] = r.nextInt(min, max);
		}

		return lista;
	}

	public int[] listaDiInteriUnici(int min, int max, int n) {

		if (Math.abs(max - min) < n)
			throw new IllegalArgumentException("Range troppo piccolo per n valori unici");

		int[] lista = new int[n];

		int estratti = 0;

		estrazione: while (estratti < n) {

			int numero = r.nextInt(min, max);

			// lento, ma almeno esce fuori qualcosa
			for (int i = 0; i < lista.length; i++) {
				if (lista[i] == numero)
					continue estrazione;
			}

			lista[estratti++] = numero;
		}

		return lista;
	}

	public static void main(String[] args) {

		var g = new GeneraRoba();

//		var interiConDuplicati = g.listaDiInteriConDuplicati(1, 11, 10);
//		stampa(interiConDuplicati);

		var interiUnici = g.listaDiInteriUnici(0, 100,10);
		stampa(interiUnici);

	}

	private static void stampa(int[] lista) {

		final int riga = 5;

		for (int i = 0; i < lista.length; i++) {
			System.out.printf("%3s ", lista[i]);

			if (i % riga == riga - 1)
				System.out.println();

		}
	}
}
