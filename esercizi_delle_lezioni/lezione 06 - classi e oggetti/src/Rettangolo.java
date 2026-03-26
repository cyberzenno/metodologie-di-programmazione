
public class Rettangolo {

	private int x;
	private int y;
	private int larghezza;
	private int altezza;

	private Colore colore;

	public Rettangolo(int x, int y, int larghezza, int altezza) {
		this.x = x;
		this.y = y;
		this.larghezza = larghezza;
		this.altezza = altezza;

		this.colore = Colore.NERO;
	}

	public Rettangolo(int x, int y, int larghezza, int altezza, Colore colore) {
		this.x = x;
		this.y = y;
		this.larghezza = larghezza;
		this.altezza = altezza;

		this.colore = colore;
	}

	public void trasla(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public String toString() {
		String topLeft = "(" + x + "," + y + ")";
		String bottomRight = "(" + (x + larghezza) + "," + (y + altezza) + ")";
		return topLeft + "->" + bottomRight;
	}
	
	public void impostaColore(int r, int g, int b) {
		this.colore = new Colore(r, g, b);
	}
	
	public void stampaColore() {
		System.out.print(colore);
	}
}
