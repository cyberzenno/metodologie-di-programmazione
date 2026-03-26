
/**
 * esercizio eseguito non esattamente come richiesto, ma qua tocca anche andare avanti
 */
public class ConvertiNumero {

	/**
	 * max base 16
	 * 
	 * @param b
	 * @param n
	 * @return
	 */
	public static String convertiInBase(int b, int n) {

		String risultato = "";

		int q = n;
		int r = 0;

		do {

			r = q % b;
			q = q / b;
			risultato = toHexIfNeeded(r) + risultato;

		} while (q > 0);

		return risultato;

	}

	public static String toHexIfNeeded(int r) {
		if (r == 10)
			return "A";
		if (r == 11)
			return "B";
		if (r == 12)
			return "C";
		if (r == 13)
			return "D";
		if (r == 14)
			return "E";
		if (r == 15)
			return "F";

		return "" + r;
	}

	public static void main(String[] args) {

		printAndCompare("1", convertiInBase(2, 1));
		printAndCompare("10", convertiInBase(2, 2));
		printAndCompare("11", convertiInBase(2, 3));
		printAndCompare("100", convertiInBase(2, 4));
		printAndCompare("101", convertiInBase(2, 5));

		printAndCompare("111100", convertiInBase(2, 60));
		printAndCompare("1000110", convertiInBase(2, 70));
		printAndCompare("1010000", convertiInBase(2, 80));
		printAndCompare("1011010", convertiInBase(2, 90));
		printAndCompare("1100100", convertiInBase(2, 100));
		
		
		printAndCompare("1", convertiInBase(16, 1));
		printAndCompare("2", convertiInBase(16, 2));
		printAndCompare("3", convertiInBase(16, 3));
		printAndCompare("4", convertiInBase(16, 4));
		printAndCompare("5", convertiInBase(16, 5));

		printAndCompare("A", convertiInBase(16, 10));
		printAndCompare("B", convertiInBase(16, 11));
		printAndCompare("C", convertiInBase(16, 12));
		printAndCompare("D", convertiInBase(16, 13));
		printAndCompare("E", convertiInBase(16, 14));
		printAndCompare("F", convertiInBase(16, 15));
		printAndCompare("10", convertiInBase(16, 16));
		printAndCompare("11", convertiInBase(16, 17));
		printAndCompare("12", convertiInBase(16, 18));
		printAndCompare("13", convertiInBase(16, 19));
		printAndCompare("14", convertiInBase(16, 20));

		printAndCompare("3C", convertiInBase(16, 60));
		printAndCompare("46", convertiInBase(16, 70));
		printAndCompare("50", convertiInBase(16, 80));
		printAndCompare("5A", convertiInBase(16, 90));
		printAndCompare("64", convertiInBase(16, 100));

		
		
		
		

	}

	private static void printAndCompare(String expected, String actual) {
		System.out.println(expected + " == " + actual + ": " + expected.equals(actual));
	}

}
