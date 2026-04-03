package esercizisullematrici;

public class TavolaPitagorica {

	int[][] tavola;

	public TavolaPitagorica(int n) {
		tavola = new int[n][n];

		popolaTavola();
	}

	public int getProdotto(int a, int b) {
		return tavola[a][b];
	}

	public void stampaConIntestazioni() {

		// aggiungiamo la prima riga come intestazione
		for (int j = 0; j < tavola[0].length; j++) {

			if (j == 0)
				System.out.printf("%3s |", "x");

			System.out.printf("%3d ", tavola[1][j]);
		}

		System.out.println();
		stampaRigaDiLiniette();
		System.out.println();

		for (int i = 0; i < tavola.length; i++) {
			for (int j = 0; j < tavola[0].length; j++) {

				// aggiungiamo il primo numero come intestazione riga
				if (j == 0)
					System.out.printf("%3s |", i);

				System.out.printf("%3d ", tavola[i][j]);
			}

			System.out.println();
		}
	}

	private void popolaTavola() {
		for (int i = 0; i < tavola.length; i++) {
			for (int j = 0; j < tavola[0].length; j++) {
				tavola[i][j] = i * j;
			}
		}
	}

	private void stampaRigaDiLiniette() {
		for (int i = 0; i < tavola.length + 1; i++) {
			System.out.printf("%3s ", "-");
		}
	}

	public static void main(String[] args) {
		TavolaPitagorica t = new TavolaPitagorica(11);

		t.stampaConIntestazioni();

		//funziona anche get prodotto, ma andiamo avanti
		//var prodotto = t.getProdotto(8, 9);
		//System.out.println(prodotto);
	}
}
