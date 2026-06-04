package factorymethod_parole;

import java.util.ArrayList;

public abstract class Parole {

	protected ArrayList<String> parole;

	protected Parole() {
		parole = new ArrayList<String>();
	}
	
	public void aggiungi(String parola) {
		parole.add(parola);
		salva();
	}
	
	public void reset() {
		parole = new ArrayList<String>();
		salva();
	}

	public void stampa() {
		System.out.printf("%s\n-----\n", this.getClass().getSimpleName());
		parole.forEach(x -> System.out.println(x));
		System.out.printf("\n");
	}


	public abstract void carica();
	public abstract void salva();
}
