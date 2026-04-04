package campominato;

import java.util.Random;

public class CampoMinato {

	private int w, h, m;
	private Cella[][] campo;
	private StatoDelGioco stato;

	public CampoMinato(int w, int h, int m) {

		this.w = w;
		this.h = h;
		this.m = m;
		this.stato = StatoDelGioco.IN_GIOCO;

		campo = new Cella[h][w];

		// inizializza campo
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				campo[y][x] = new Cella(x, y, 0);
			}
		}

		spargiMine(m);

		popolaCelle();

	}

	private void spargiMine(int m) {
		Random r = new Random();

		while (m > 0) {
			int y = r.nextInt(h);
			int x = r.nextInt(w);

			Cella c = campo[y][x];

			if (c.getValore() != -1) {
				c.setValore(-1);
				m--;
			}
		}
	}
	
	private void popolaCelle() {

		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {

				Cella c = campo[y][x];

				if (!c.hasMina())
					c.setValore(numeroDiMineAdiacenti(x, y));
			}
		}
	}


	private int numeroDiMineAdiacenti(int x, int y) {
		Cella[] adiacenti = getCelleAdiacenti(x, y);

		int mine = 0;
		for (int i = 0; i < adiacenti.length; i++) {
			mine += adiacenti[i].hasMina() ? 1 : 0;
		}

		return mine;
	}

	private Cella[] getCelleAdiacenti(int x, int y) {

		int[][] coordinateAdiacenti = getCoordinateAdiacenti(x, y);

		Cella[] celle = new Cella[coordinateAdiacenti.length];

		for (int i = 0; i < coordinateAdiacenti.length; i++) {
			int ty = coordinateAdiacenti[i][0];
			int tx = coordinateAdiacenti[i][1];

			celle[i] = campo[ty][tx];
		}

		return celle;
	}

	private int[][] getCoordinateAdiacenti(int x, int y) {
		int[][] tutte = { { y - 1, x - 1 }, { y - 1, x }, { y - 1, x + 1 },

				{ y, x - 1 }, { y, x + 1 },

				{ y + 1, x - 1 }, { y + 1, x }, { y + 1, x + 1 } };

		// nonostante trovo orribilmente noioso fare il filtro a mano
		// visto che e' un esercizio, nonostate sia orribilmente noioso farlo
		// lo faccio a mano (anche se orribilmente noioso!!)

		// 1. occorrenze
		int occorrenze = 0;
		for (int i = 0; i < tutte.length; i++) {
			int ty = tutte[i][0];
			int tx = tutte[i][1];

			if (0 <= ty && ty < h && 0 <= tx && tx < w)
				occorrenze++;
		}

		int[][] tutteFiltrate = new int[occorrenze][2];

		// 2. filtro
		for (int i = 0, j = 0; i < tutte.length; i++) {
			int ty = tutte[i][0];
			int tx = tutte[i][1];

			if (0 <= ty && ty < h && 0 <= tx && tx < w) {
				tutteFiltrate[j++] = tutte[i];
			}
		}

		return tutteFiltrate;

	}
	
	public int scopri(int x, int y) {
		return scopri(x, y, false);
	}

	private int scopri(int x, int y, boolean autoScopri) {
		Cella c = campo[y][x];

		if (c.isScoperta())
			return c.getValore();

		int valore = c.scopri();

		if (valore == 0) {

			Cella[] adiacenti = getCelleAdiacenti(x, y);
			for (int i = 0; i < adiacenti.length; i++) {
				int ty = adiacenti[i].getY();
				int tx = adiacenti[i].getX();

				scopri(tx, ty, true);
			}
		}

		if (!autoScopri && valore == -1) {
			stato = StatoDelGioco.PERSO;
		}

		return valore;
	}

	
	public StatoDelGioco getStato() {
		return stato;
	}

	public String toString() {
		String campoAsString = "";

		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {

				Cella c = campo[y][x];

				String cellaAsString = c.toString();

				if (stato == StatoDelGioco.PERSO && c.hasMina())
					cellaAsString = c.toStringScoperto();

				campoAsString += String.format("%2s ", cellaAsString);
			}

			campoAsString += "\n";
		}

		campoAsString += stato;

		return campoAsString;
	}

	public String toStringScoperto() {
		String campoAsString = "";

		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				campoAsString += String.format("%2s ", campo[y][x].toStringScoperto());
			}

			campoAsString += "\n";
		}

		return campoAsString;
	}

}
