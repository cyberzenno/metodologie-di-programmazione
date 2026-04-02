package esercizisullematrici;

public class ScacchieraTris {
	String[][] scacchiera;

	public ScacchieraTris() {
		this.scacchiera = new String[3][3];

		inizializzaScacchiera();
	}

	public void occupaCasellaX(int x, int y) {
		scacchiera[y][x] = "X";
	}

	public void occupaCasellaO(int x, int y) {
		scacchiera[y][x] = "O";
	}

	public void stampa() {
		for (int i = 0; i < scacchiera.length; i++) {
			for (int j = 0; j < scacchiera[0].length; j++) {
				System.out.printf(" %s ", scacchiera[i][j]);
			}
			
			System.out.println();
		}
	}

	private void inizializzaScacchiera() {
		for (int i = 0; i < scacchiera.length; i++) {
			for (int j = 0; j < scacchiera[0].length; j++) {
				scacchiera[i][j] = " ";
			}
		}
	}

}
