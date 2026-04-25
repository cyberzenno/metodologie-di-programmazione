package classianonimeinterfaccefunzionalieviadicendo;

public class ClassiAnonime {

	static abstract class AnimaleDaEstendere {

		private String nome;

		public AnimaleDaEstendere(String nome) {
			this.nome = nome;
		}

		public void muoviti() {
			System.out.println("Nome Classe: " + this.getClass().getSimpleName());
			System.out.println("Nome Bestia: " + this.nome);
			System.out.println("Che sta a fa'?: SI MUOVE\n\n");
		}
		
		public abstract void emettiVerso();
	}

	public static void main(String[] args) {

		//facciamo cosi: assumiamo che sta roba non si usa spesso, anzi, quasi mai.
		//assumiamo quindi, che il vero utilizzo del meccanismo di "classe anonima"
		//serve per le interfacce funzionali con le lamba expression
		AnimaleDaEstendere orso = new AnimaleDaEstendere("Orso Bruno") {
			@Override
			public void emettiVerso() {
				System.out.println("Nome Classe: " + this.getClass().getSimpleName());
				System.out.println("Nome Bestia: " + super.nome);
				System.out.println("Che sta a fa'?: EMETTE VERSO: grum, grum, grum...\n\n");
				
			};
		};
		orso.muoviti();
		orso.emettiVerso();

		var leone = new AnimaleDaEstendere("Leone") {
			
			@Override
			public void emettiVerso() {
				System.out.println("Nome Classe: " + this.getClass().getSimpleName());
				System.out.println("Nome Bestia: " + super.nome);
				System.out.println("Che sta a fa'?: EMETTE VERSO: roar, roar, roar...\n\n");
				
			}
			
			public void ruggisci() {
				System.out.println("Nome Classe: " + this.getClass().getSimpleName());
				System.out.println("Nome Bestia: " + super.nome);
				System.out.println("Che sta a fa'?: RUGGISCEEEEEE...\n\n");
			}
		};

		leone.muoviti(); // <-- questo funziona
		leone.ruggisci(); // <-- se non usiamo VAR questo non compila - 
		//suppongo appunto perche' il riferimento al supertipo AnimaleDaEstendere
		//non sa dell'esistenza di "ruggisci", mentre VAR lo inferisce e lo accetta anonimamente
		
		leone.emettiVerso();

	}
}
