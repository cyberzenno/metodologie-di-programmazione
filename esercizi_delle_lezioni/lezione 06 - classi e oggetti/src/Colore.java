
public class Colore {
	private int r;
	private int g;
	private int b;

	public static Colore BIANCO = new Colore(255, 255, 255);
	public static Colore NERO = new Colore(0, 0, 0);

	public Colore(int r, int g, int b) {

		if (!isInRange(r) || !isInRange(g) || !isInRange(b)) {
			throw new IllegalArgumentException();
		}

		this.r = r;
		this.g = g;
		this.b = b;
	}

	public String toString() {
		return "(" + r + "," + g + "," + b + ")";
	}

	private boolean isInRange(int value) {
		return 0 <= value && value <= 255;
	}
}
