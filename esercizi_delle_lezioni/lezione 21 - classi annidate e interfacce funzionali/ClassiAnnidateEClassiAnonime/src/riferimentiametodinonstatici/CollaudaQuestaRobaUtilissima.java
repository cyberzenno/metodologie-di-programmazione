package riferimentiametodinonstatici;

public class CollaudaQuestaRobaUtilissima {
	public static void main(String[] args) {

		// tanto per rendere le cose piu facili
		// vediamo questi utilissimi meccanismi, con tantissimi auguri
		InterfacciaFunzionalePerMetodiNonStaticiCheDiventanoStatici emettiVersoConAccento = Animale::emettiVersoConAccento;

		Animale orso = new Animale("Orso");
		orso.emettiVersoConAccento("orsese");

		Animale maiale = new Animale("Maiale");
		maiale.emettiVersoConAccento("maialese");

		System.out.println();
		
		emettiVersoConAccento.esegui(orso, "orsese statico (che e' piu' cosi')");
		emettiVersoConAccento.esegui(maiale, "maialese statico (che e' piu' cosa')");

		System.out.println();
		
		InterfacciaFunzionalePerMetodiNonStaticiCheDiventanoStatici emettiVersoConAccentoLambda = (Animale a,
				String accento) -> a.emettiVersoConAccento(accento + " (LAMBDA)");

		emettiVersoConAccentoLambda.esegui(orso, "orsese statico modificato");		
		emettiVersoConAccentoLambda.esegui(maiale, "maialese statico modificato");		
	}

	/*
	 * Orso: emette verso con accento orsese Maiale: emette verso con accento
	 * maialese Orso: emette verso con accento orsese statico (che e' piu' cosi')
	 * Maiale: emette verso con accento maialese statico (che e' piu' cosa')
	 */
}
