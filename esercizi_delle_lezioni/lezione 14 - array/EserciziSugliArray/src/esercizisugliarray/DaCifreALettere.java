package esercizisugliarray;

public class DaCifreALettere {

	public static String daCifreALettere(String cifre) {
		String[] lettere = new String[] { "zero", "uno", "due", "tre", "quattro", "cinque", "sei", "sette", "otto",
				"nove" };

		String cifreComeLettere = "";

		for (int i = 0; i < cifre.length(); i++) {
			int cifra = Integer.parseInt(cifre.charAt(i) + "");

			cifreComeLettere += (cifreComeLettere.isEmpty() ? "" : " ") + lettere[cifra];
		}

		return cifreComeLettere;
	}

	public static void main(String[] args) {
		var lettere = DaCifreALettere.daCifreALettere("8495648");

		System.out.println(lettere);
	}
}
