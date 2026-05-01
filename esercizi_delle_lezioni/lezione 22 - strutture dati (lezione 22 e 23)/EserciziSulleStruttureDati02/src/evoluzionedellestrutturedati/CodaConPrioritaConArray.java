package evoluzionedellestrutturedati;

/**
 * Questo esercizio serve a dimostrare come possa nascere "spontanea" 
 * la necessita' del concetto di Linked List
 * 
 * Questa e' la versione con Arraym la quale richiede di spostare tutti gli elementi
 * per aggiungerne uno
 * 
 */
public class CodaConPrioritaConArray implements CodaConPriorita {

	private int currentIndex;
	private int dimensione;

	private String[] o;

	public CodaConPrioritaConArray(int dimensione) {
		o = new String[dimensione];

		this.dimensione = dimensione;
		this.currentIndex = 0;
		
		stampa();
	}

	@Override
	public void addNext(String next) {
		if (!hasSpace()) {
			System.out.println("Warning: coda piena");
			return;
		}

		o[currentIndex++] = next;
		
		stampa();
	}

	@Override
	public void addFirst(String first) {
		if (!hasSpace()) {
			System.out.println("Warning: coda piena");
			return;
		}

		// shift tutti gli altri
		for (int e = dimensione - 1; e > 0; e--) {
			o[e] = o[e - 1];
		}

		o[0] = first;
		currentIndex++;
		
		stampa();
	}

	@Override
	public void remove(String remove) {
		for (int i = 0, j = 0; i < o.length; i++, j++) {

			if (remove.equals(o[i]))
				j++;

			var hasNext = j < o.length;
			o[i] = hasNext ? o[j] : null;
		}
		
		stampa();
	}

	@Override
	public void stampa() {
		for (int i = 0; i < o.length; i++) {
			System.out.printf("%s: %s\n", i, o[i] == null ? "_" : o[i]);
		}
		System.out.printf("\n\n");
	}
	
	@Override
	public void stampa(String bannerIfAny) {
		System.out.println(bannerIfAny);
		
		stampa();		
	}
	

	public boolean hasSpace() {
		return currentIndex < dimensione;
	}

	public static void main(String[] args) {
		var a = new CodaConPrioritaConArray(5);
		
		a.addNext("Mario");
		a.addNext("Pina");
		a.addNext("Luigi");

		a.addFirst("Vice-Presidente");
		a.addFirst("Presidente");

		a.remove("Pina");
		a.remove("Vice-Presidente");
	}

}
