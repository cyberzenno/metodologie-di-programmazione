package classianonimeinterfaccefunzionalieviadicendo;

public class RiferimentiAMetodi {

	interface interfacciaFunzionaleFaiQualcosaConUnaStringa{
		void esegui(String qualcosa);
	}
	
	class ClasseCheHaQualcheMetodoStatico {
		public static void saluta(String nome) {
			System.out.println("Ciao " + nome);
		}
		
		public static void accarezza(String nome) {
			System.out.println("Pat pat sul " + nome);
		}		
	}
	
	class ClasseNormale{
		public void vola(String nome) {
			System.out.println("Vola " + nome);
		}				
	}
	
	static class ClasseStatica{		
		public void ritorna(String nome) {
			System.out.println("Ritorna " + nome);
		}
	}

	public static void main(String[] args) {
		
		interfacciaFunzionaleFaiQualcosaConUnaStringa saluta = ClasseCheHaQualcheMetodoStatico::saluta;
		saluta.esegui("pippo");
		saluta.esegui("pluto");
		saluta.esegui("topolino\n");
		
		interfacciaFunzionaleFaiQualcosaConUnaStringa accarezza = ClasseCheHaQualcheMetodoStatico::accarezza;
		accarezza.esegui("cane");
		accarezza.esegui("gatto");
		accarezza.esegui("topo\n");
		
		//da notare il fastidiosissimo meccanismo delle classi annidate NON statiche
		ClasseNormale classeNormale = new RiferimentiAMetodi().new ClasseNormale();
		
		interfacciaFunzionaleFaiQualcosaConUnaStringa vola = classeNormale::vola;
		vola.esegui("Giggino");
		vola.esegui("Giggetto\n");
		
		//e il poco meno fastidioso meccanismo delle classi annidate STATICHE
		//che, visto che stiamo solo alla prima annidazione, non dobbiamo mettere altri prefissi
		ClasseStatica classeStatica = new ClasseStatica();
		
		interfacciaFunzionaleFaiQualcosaConUnaStringa ritorna = classeStatica::ritorna;
		ritorna.esegui("Giggino");
		ritorna.esegui("Giggetto\n");
		
	}
	
	/*
	 * 	Ciao pippo
		Ciao pluto
		Ciao topolino
		
		Pat pat sul cane
		Pat pat sul gatto
		Pat pat sul topo
		
		Vola Giggino
		Vola Giggetto
		
		Ritorna Giggino
		Ritorna Giggetto
	 */
}
