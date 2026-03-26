
public class StringheVerticali {

	public static void main(String[] args) {

		String x, y, z;

		x = "ciao";
		y = "miaomiao";
		z = "bau";

		String max = x;

		if (y.length() > max.length())
			max = y;

		if (z.length() > max.length())
			max = z;

		for (int i = 0; i < max.length(); i++) {
			char a = ' ';
			char b = ' ';
			char c = ' ';

			if (i < x.length())
				a = x.charAt(i);

			if (i < y.length())
				b = y.charAt(i);

			if (i < z.length())
				c = z.charAt(i);

			System.out.println("" + a + b + c);
		}

	}

}
