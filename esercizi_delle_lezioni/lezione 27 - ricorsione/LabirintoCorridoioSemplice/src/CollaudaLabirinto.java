
public class CollaudaLabirinto {
	public static void main(String[] args) {

		var l = generaLabirinto();

		l.percorri();

	}

	private static Labirinto generaLabirinto() {

		Corridoio c33 = new Corridoio(true);

		Corridoio c20 = new Corridoio();
		Corridoio c21 = new Corridoio();
		Corridoio c22 = new Corridoio();

		Corridoio c23 = new Corridoio();
		c23.addCorridoio(c33);

		Corridoio c24 = new Corridoio();
		Corridoio c25 = new Corridoio();
		Corridoio c26 = new Corridoio();

		Corridoio c12 = new Corridoio();
		c12.addCorridoio(c20);
		c12.addCorridoio(c21);
		c12.addCorridoio(c22);

		Corridoio c13 = new Corridoio();
		c13.addCorridoio(c23);

		Corridoio c14 = new Corridoio();
		c14.addCorridoio(c24);
		c14.addCorridoio(c25);
		c14.addCorridoio(c26);

		Corridoio c03 = new Corridoio();
		c03.addCorridoio(c12);
		c03.addCorridoio(c13);
		c03.addCorridoio(c14);

		Labirinto l = new Labirinto(c03);
		return l;
	}
}
