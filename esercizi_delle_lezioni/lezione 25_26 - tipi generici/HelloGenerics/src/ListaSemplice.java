
public class ListaSemplice<T extends Frutta> {

	private final int DIMENSIONE_INIZIALE = 100;

	private int dimensione;

	private T[] arrayInterno;

	@SuppressWarnings("unchecked")
	public ListaSemplice() {

		arrayInterno = (T[]) new Frutta[DIMENSIONE_INIZIALE];

		dimensione = 0;
	}

	public void add(T elemento) {
		arrayInterno[dimensione++] = elemento;
	}

	public void remove() {
		arrayInterno[dimensione-- - 1] = null;
	}

	public void stampa() {

		System.out.printf("Classe: %s\n-------\n", this.getClass().getName());

		if (dimensione == 0) {
			System.out.printf("Lista vuota.\n\n");
		}

		for (int i = 0; i < dimensione; i++) {
			System.out.println(arrayInterno[i]);
		}
		
		System.out.printf("\n\n");
	}

	public int getDimensione() {
		return dimensione;
	}
}
