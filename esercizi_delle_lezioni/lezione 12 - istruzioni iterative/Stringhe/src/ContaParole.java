
public class ContaParole {

	public static void main(String[] args) {

		String testo = "AA BB CC BB BB CC DD";

		String[] tokens = testo.split(" ");

		String parola = "BB";

		int occorrenze = 0;

		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals(parola)) {
				occorrenze++;
			}
		}

		System.out.println(testo);
		System.out.println(parola + ": " + occorrenze);

	}
}
