package formebase;

public class CollaudaForme {

	/*
	 * A quanto pare il main accetta String... args
	 */
	public static void main(String... args) {

		Forma cerchio = new Cerchio();
		Forma quadrato = new Quadrato();
		Forma triangolo = new Triangolo();
		Forma etere = new Etere();

		Forma[] forme = { cerchio, quadrato, triangolo, etere };

		for (int i = 0; i < forme.length; i++) {
			forme[i].stampaNome();
			forme[i].stampa();
		}

	}
}
