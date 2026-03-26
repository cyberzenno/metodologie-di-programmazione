
public class ContaVocali {
	public static void main(String[] args) {

		String testo = "le aiuole sono pulite";

		int a, e, i, o, u;
		a = 0;
		e = 0;
		i = 0;
		o = 0;
		u = 0;

		for (int x = 0; x < testo.length(); x++) {
			// facciamo finta che switch non esiste
			char lettera = testo.charAt(x);
			if (lettera == 'a')
				a++;
			if (lettera == 'e')
				e++;
			if (lettera == 'i')
				i++;
			if (lettera == 'o')
				o++;
			if (lettera == 'u')
				u++;
		}

		System.out.print("a: " + a + " ");
		System.out.print("e: " + e + " ");
		System.out.print("i: " + i + " ");
		System.out.print("o: " + o + " ");
		System.out.print("u: " + u + " ");

	}
}
