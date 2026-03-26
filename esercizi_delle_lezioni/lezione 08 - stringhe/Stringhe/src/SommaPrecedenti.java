
public class SommaPrecedenti {

	public static void main(String[] args) {

		int a, b, n;

		a = 2;
		b = 3;
		n = 6;

		String output = a + ", " + b;

		for (int i = 0; i < n; i++) {
			int somma = a + b;

			a = b;
			b = somma;

			output += ", " + somma;
		}

		System.out.println(output);
	}

}
