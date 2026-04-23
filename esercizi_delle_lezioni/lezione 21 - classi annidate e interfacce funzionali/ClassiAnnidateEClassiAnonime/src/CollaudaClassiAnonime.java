
public class CollaudaClassiAnonime {
	public static void main(String[] args) {

		InterfacciaVolante implementazioneVolante = new InterfacciaVolante() {

			@Override
			public void faiQuesto() {
				System.out.println("faccio questo");

			}

			@Override
			public void faiQuello() {
				System.out.println("faccio quello");
			}
		};
		System.out.println("Nome 01: " + implementazioneVolante.getClass().getSimpleName());
		System.out.println("Is InterfacciaVolante? " + (implementazioneVolante instanceof InterfacciaVolante));
		System.out.println();

		
		//certo che cosi non e' che e' proprio chiarissimo
		//o meglio, mi chiedo che senso possa avere...
		var estensioneVolante = new ClasseVolante() {
			public void faccioQuestoQuelloEddiPiu() {
				System.out.println("faccioQuestoQuelloEddiPiu");
			}
		};

		estensioneVolante.faccioQuestoQuelloEddiPiu();
		System.out.println();

		
		System.out.println("Nome 02: " + estensioneVolante.getClass().getSimpleName());
		System.out.println("Is ClasseVolante? " + (estensioneVolante instanceof ClasseVolante));
		
		
		
		System.out.println();

		ClasseVolante istanzaNormale = new ClasseVolante();
		System.out.println("Nome 03: " + istanzaNormale.getClass().getSimpleName());

	}
}
