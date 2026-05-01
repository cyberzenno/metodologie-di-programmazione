package evoluzionedellestrutturedati;

public class CodaConListaCollegata implements CodaConPriorita {

	private NodoCollegato primoNodo;

	public CodaConListaCollegata(NodoCollegato primoNodo) {
		this.primoNodo = primoNodo;

		stampa("constructor");
	}

	@Override
	public void addNext(String next) {

		if (primoNodo == null) {
			primoNodo = new NodoCollegato(next);
			stampa("addNext");

			return;
		}

		primoNodo.last().setNext(new NodoCollegato(next));

		stampa("addNext");
	}

	@Override
	public void addFirst(String first) {

		NodoCollegato newPrimo = new NodoCollegato(first);

		newPrimo.setNext(primoNodo);

		primoNodo = newPrimo;

		stampa("addFirst");
	}

	@Override
	public void remove(String remove) {
		
		//vabbe', to be continued...
		
	}

	@Override
	public void stampa(String bannerIfAny) {
		System.out.println(bannerIfAny);
		System.out.println("---------------------");

		stampa();
	}

	@Override
	public void stampa() {

		var s = primoNodo;
		while (s != null) {
			System.out.println(s);

			s = s.next();
		}

		System.out.println("\n");
	}

	public static void main(String[] args) {

		var c = new CodaConListaCollegata(null);

		c.addNext("Mario");
		c.addNext("Pina");
		c.addNext("Luigi");

		c.addFirst("Vice-Presidente");
		c.addFirst("Presidente");

//		a.remove("Pina");
//		a.remove("Vice-Presidente");
	}

}
