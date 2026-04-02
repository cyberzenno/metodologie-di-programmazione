package esercizisullematrici;

/**
 * Cosi come per gli array, anche per le matrici secondo me ci sono degli
 * strumenti obbligatori da acquisire per primi: <br>
 * 1. genera matrice X * Y <br>
 * 2. genera matrice X * Y con coordinate (e/o qualche altra condizione) <br>
 * 3. stampa matrice <br>
 * 4. aggiungi riga <br>
 * 5. aggiungi colonna <br>
 * 6. ruota anti-orario <br>
 * 7. ruota orario
 */
public class MatriceFlessibile {

	String[][] originale;

	public MatriceFlessibile(int w, int h) {
		originale = new String[h][w];
	}

	public void popolaMatrice(String valoreDiDefault) {
		for (int y = 0; y < originale.length; y++) {
			for (int x = 0; x < originale[0].length; x++) {
				originale[y][x] = valoreDiDefault;
			}
		}
	}

	public void popolaMatrice(int valoreDiPartenza) {
		for (int y = 0; y < originale.length; y++) {
			for (int x = 0; x < originale[0].length; x++) {
				originale[y][x] = "%02d".formatted(valoreDiPartenza++);
			}
		}
	}

	public void popolaMatrice(char valoreDiPartenza) {
		for (int y = 0; y < originale.length; y++) {
			for (int x = 0; x < originale[0].length; x++) {
				originale[y][x] = "%s".formatted(valoreDiPartenza++);
			}
		}
	}

	public void aggiungiRigaIn(int y, String valoreDiDefault) {
		String[][] nuovaMatrice = new String[originale.length + 1][originale[0].length];

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < originale[0].length; j++) {
				nuovaMatrice[i][j] = originale[i][j];
			}
		}

		for (int j = 0; j < originale[0].length; j++) {
			nuovaMatrice[y][j] = valoreDiDefault;
		}

		for (int i = y; i < originale.length; i++) {
			for (int j = 0; j < originale[0].length; j++) {
				nuovaMatrice[i + 1][j] = originale[i][j];
			}
		}

		originale = nuovaMatrice;
	}

	public void aggiungiColonnaIn(int x, String valoreDiDefault) {
		String[][] nuovaMatrice = new String[originale.length][originale[0].length + 1];

		for (int i = 0; i < originale.length; i++) {
			for (int j = 0; j < x; j++) {
				nuovaMatrice[i][j] = originale[i][j];
			}

			nuovaMatrice[i][x] = valoreDiDefault;

			for (int j = x; j < originale[0].length; j++) {
				nuovaMatrice[i][j + 1] = originale[i][j];
			}
		}
		
		originale = nuovaMatrice;

	}

	public void stampa() {
		for (int y = 0; y < originale.length; y++) {
			for (int x = 0; x < originale[0].length; x++) {
				System.out.printf(" %s ", originale[y][x]);
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		MatriceFlessibile m = new MatriceFlessibile(3, 2);

		m.popolaMatrice('A');

		m.stampa();
		
		line();

		m.aggiungiRigaIn(1, "-");
		m.aggiungiRigaIn(2, "-");
		m.stampa();
		
		line();
		
		m.aggiungiColonnaIn(2, "|");
		m.stampa();
		
		line();
		
		m.popolaMatrice('A');
		m.stampa();
	}
	
	private static void line() {
		System.out.println("-----------------------");
	}
}
