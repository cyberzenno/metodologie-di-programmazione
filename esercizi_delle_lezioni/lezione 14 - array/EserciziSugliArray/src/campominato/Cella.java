package campominato;

public class Cella {
	private int x, y, valore;
	private boolean scoperta;

	public Cella(int x, int y, int valore) {
		this.x = x;
		this.y = y;
		this.valore = valore;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getValore() {
		return valore;
	}
	
	public void setValore(int valore) {
		this.valore = valore;
	}
	
	public boolean hasMina() {
		return valore == -1;
	}
	
	public int scopri() {
		scoperta = true;
		return valore;
	}
	
	public boolean isScoperta() {
		return scoperta;
	}
	
	public String toString() {
		if (!scoperta)
			return "-";

		return toStringScoperto();
	}

	public String toStringScoperto() {
		return switch (valore) {
		case -1 -> "M";
		case 0 -> " ";
		default -> valore + "";
		};
	}
}
