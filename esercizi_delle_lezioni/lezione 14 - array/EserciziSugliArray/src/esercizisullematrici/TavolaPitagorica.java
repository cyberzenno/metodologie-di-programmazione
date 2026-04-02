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

		for (int i = 0; i < tavola.length; i++) {
			for (int j = 0; j < tavola[0].length; j++) {

				// qua e' un po' un casotto
				// to be continued...

				System.out.printf("%3d ", tavola[i][j]);
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		TavolaPitagorica t = new TavolaPitagorica(11);

		t.stampaConIntestazioni();
	}

	private void popolaTavola() {
		for (int i = 0; i < tavola.length; i++) {
			for (int j = 0; j < tavola[0].length; j++) {
				tavola[i][j] = i * j;
			}
		}
	}
}
