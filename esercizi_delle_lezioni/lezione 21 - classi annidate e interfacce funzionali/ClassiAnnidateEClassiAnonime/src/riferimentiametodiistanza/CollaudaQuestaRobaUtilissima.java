package riferimentiametodiistanza;

public class CollaudaQuestaRobaUtilissima {
	public static void main(String[] args) {
		//prepariamo dati --> arrange
		Animale orso = new Animale("Orso");
		orso.emettiVersoConAccento("orsese");

		Animale maiale = new Animale("Maiale");
		maiale.emettiVersoConAccento("maialese");

		System.out.println();
				
		// tanto per rendere le cose piu facili
		// vediamo questi utilissimi meccanismi, con tantissimi auguri:
		//	e' un po' come se:
		//	- PRENDESSIMO IN PRESTITO un metodo d'istanza da una classe, per utilizzarlo su qualunque istanza di quel tipo
		//	  detta cosi, tutto sommato non e' malaccio
		//	- significa che qualunque metodo non statico puo diventarlo,
		//	  a patto che la @FI abbia come primo argomento il TIPO_DI_ISTANZA		 
		InterfacciaFunzionalePerMetodiNonStaticiCheDiventanoStatici emettiVersoConAccento = Animale::emettiVersoConAccento;
		
		//esegui cio' che vogliamo collaudare --> act
		emettiVersoConAccento.esegui(orso, "orsese statico (che e' piu' cosi')");
		emettiVersoConAccento.esegui(maiale, "maialese statico (che e' piu' cosa')");

		System.out.println();
		
		//infine, ridefiniamo il metodo sopra, con un'altra implementazione veloce
		//
		InterfacciaFunzionalePerMetodiNonStaticiCheDiventanoStatici emettiVersoConAccentoLambda = (Animale a,
				String accento) -> a.emettiVersoConAccento(accento + " (LAMBDA)");

		emettiVersoConAccentoLambda.esegui(orso, "orsese statico modificato");		
		emettiVersoConAccentoLambda.esegui(maiale, "maialese statico modificato");		
		
	}

	/*
		Orso: emette verso con accento orsese
		Maiale: emette verso con accento maialese
		
		Orso: emette verso con accento orsese statico (che e' piu' cosi')
		Maiale: emette verso con accento maialese statico (che e' piu' cosa')
		
		Orso: emette verso con accento orsese statico modificato (LAMBDA)
		Maiale: emette verso con accento maialese statico modificato (LAMBDA)
	*/
}
