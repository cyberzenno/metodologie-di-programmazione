package classianonimeinterfaccefunzionalieviadicendo;

public class ClassiAnonimePerInterfacceFunzionali {

	//qui la comodita' delle classi o interfacce annidate
	interface AnimaleCheEmetteSoloIlVerso {
		
		default String getClassSimpleName() {
			return this.getClass().getSimpleName();
		}
		
		void emettiVerso();
	}

	public static void main(String[] args) {

		AnimaleCheEmetteSoloIlVerso orsoVerboso = new AnimaleCheEmetteSoloIlVerso() {
			@Override
			public void emettiVerso() {
				System.out.println("Nome Classe: " + getClassSimpleName());//finche estendiamo, abbiamo accesso al default dell'interfaccia
				System.out.println("Nome Bestia: orsoVerboso");
				System.out.println("Che sta a fa'?: EMETTE VERSO: grum, grum, grum...\n\n");
			};
		};
		orsoVerboso.emettiVerso();

		//insomma, gia' cosi ha piu senso rispetto ad estendere un metodo astratto di una classe anonima
		AnimaleCheEmetteSoloIlVerso leoneLambda = () -> {
			
			// a quanto pare this non si puo usare in un "static context"
			// System.out.println("Nome Classe: " + getClassSimpleName);
			//e neanche in altra roba tipo:
			//System.out.println("Nome Classe: " + AnimaleCheEmetteSoloIlVerso.super.getClassSimpleName());
			
			System.out.println("Nome Bestia: leoneLambda");
			System.out.println("Che sta a fa'?: EMETTE VERSO: roar, roar, roar...\n\n");
		};

		// stampa tipo:
		// ClassiAnonimePerInterfacceFunzionali$$Lambda/0x0000017e9a001000
		System.out.println(leoneLambda.getClass().getSimpleName());

		leoneLambda.emettiVerso();

		AnimaleCheEmetteSoloIlVerso cavalloLambda = () -> {

			System.out.println("Nome Bestia: cavalloLambda");
			System.out.println("Che sta a fa'?: EMETTE VERSO: ihhh, ihhh, ihhh...\n\n");
		};
		
		cavalloLambda.emettiVerso();
	}
	
	/*
	 	output:
	  
		Nome Classe: 
		Nome Bestia: orsoVerboso
		Che sta a fa'?: EMETTE VERSO: grum, grum, grum...
		
		
		ClassiAnonimePerInterfacceFunzionali$$Lambda/0x000002892d001000
		Nome Bestia: leoneLambda
		Che sta a fa'?: EMETTE VERSO: roar, roar, roar...
		
		
		Nome Bestia: cavalloLambda
		Che sta a fa'?: EMETTE VERSO: ihhh, ihhh, ihhh...
	 
	 */
}
