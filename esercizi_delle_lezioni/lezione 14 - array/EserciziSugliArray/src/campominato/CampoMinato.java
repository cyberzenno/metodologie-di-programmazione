package campominato;

import java.util.Random;

public class CampoMinato {

	private int w, h, m;
	private Cella[][] campo;

	public CampoMinato(int w, int h, int m) {

		this.w = w;
		this.h = h;
		this.m = m;

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

	public String toString() {
		String campoAsString = "";

		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				campoAsString += String.format("%2s ", campo[y][x]);
			}

			campoAsString += "\n";
		}
		
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
		// TODO Auto-generated method stub

	}

}
