package micromondo3d;

public class Punto3D {
	private int x, y, z;

	public Punto3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
}
