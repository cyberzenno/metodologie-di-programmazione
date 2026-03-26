
public class RettangoloDiCaratteri {

	private int x, y, w, h;

	public RettangoloDiCaratteri(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public void draw() {

		for (int i = 0; i < y + h; i++) {
			for (int j = 0; j < x + w; j++) {

				if (i < y || j < x) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		RettangoloDiCaratteri r1 = new RettangoloDiCaratteri(2, 2, 5, 5);
		r1.draw();
	}
}
