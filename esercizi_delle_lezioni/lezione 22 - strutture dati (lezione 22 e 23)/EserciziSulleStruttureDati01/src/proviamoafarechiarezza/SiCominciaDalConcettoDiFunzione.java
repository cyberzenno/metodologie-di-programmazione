package proviamoafarechiarezza;

/**
 * 01. FUNZIONE<br>
 * Si comincia dal concetto di FUNZIONE, in quanto e' quello che tutti gli
 * studenti conoscono sia dentro che fuori dalla programmazione.
 */
public class SiCominciaDalConcettoDiFunzione {

	// 1. essere al corrente delle classi annidate
	// ci permette di fare degli esempi locali senza dover creare altri file

	// 2. Il concetto di Interfacci Funzionale e' abbastanza intuitivo
	// e non lo ripetiamo
	@FunctionalInterface
	interface FunzioneGenerica<T, R> {
		R esegui(T t);
	}

	// con o senza annotazione, e' sempre considerata una FunctionalInterface
	interface FunzioneSuInteri extends FunzioneGenerica<Integer, Integer> {

	}

	@FunctionalInterface
	interface FunzioneSuInsiemeDiInteri extends FunzioneGenerica<Integer[], Integer> {

	}

	public static void main(String[] args) {

		// 2. il concetto di Classi Anonime
		// ci permette di implementare localmente il corpo di un'interfaccia
		// (che per brevita consideriamo solo le interfacce funzionali)
		//
		// cosi e' indubbiamente noiso,
		// ma serve solo per introdurre il concetto
		FunzioneSuInteri raddoppiaLungo = new FunzioneSuInteri() {
			@Override
			public Integer esegui(Integer t) {
				return t * 2;
			}
		};
		print(raddoppiaLungo.esegui(1));

		// 3. conoscere le lambda, ci permette implementare al volo piccole funzioni
		// introducendo il concetto di "quasi-riferimento" a metodo
		// (che forse, in realta, e' una classe anonima tanto quanto quella di sopra, ma
		// andiamo avanti)
		// il punto e' che le lambda sono indubbiamente piu comode per implementare
		// piccoli metodi aka piccole funzioni
		FunzioneSuInteri raddoppia = n -> n * 2;
		FunzioneSuInteri quadrato = n -> n * n;
		FunzioneSuInteri cubo = n -> n * n * n;

		print(raddoppia.esegui(3));
		print(quadrato.esegui(3));
		print(cubo.esegui(3));

		FunzioneSuInsiemeDiInteri somma = lista -> {

			int risultato = 0;

			for (int i = 0; i < lista.length; i++)
				risultato += lista[i];

			return risultato;
		};

		print(somma.esegui(new Integer[] { 1, 2, 3, 4, 5 }));
	}

	private static void print(Object o) {
		System.out.println(o);
	}
}
