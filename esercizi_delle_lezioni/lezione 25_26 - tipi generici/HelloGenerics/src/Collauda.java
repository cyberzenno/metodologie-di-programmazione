import java.util.ArrayList;
import java.util.List;

public class Collauda {

	public static <T> void copia(List<? extends T> questaLeDa, List<T> questaLePrende) {
		for (T d : questaLeDa) {
			questaLePrende.add(d);
		}
	}
	
	static class DerivatoDaPianta {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.getClass().getSimpleName();
		}
	}

	static class Frutta extends DerivatoDaPianta {
		
	}

	static class Mela extends Frutta {

	}

	static class Pera extends Frutta {

	}

	static class Banana extends Frutta {

	}

	public static void main(String[] args) {
		daiLaMelaPrendiDerivatoPianta();

	
	}

	static void daiLaMelaPrendiDerivatoPianta() {
		stampa("-- daiLaMelaPrendiDerivatoPianta --");

		List<Mela> daiLaMela = List.of(new Mela(), new Mela(), new Mela());
		stampa(daiLaMela);

		List<Frutta> derivatoPianta = new ArrayList<Frutta>();

		copia(daiLaMela, derivatoPianta);
		stampa(derivatoPianta);

		stampa("\n");
	}
	
	static void daiLaMelaPrendiLaFrutta() {
		stampa("-- daiLaMelaPrendiLaFrutta --");

		List<Mela> daiLaMela = List.of(new Mela(), new Mela(), new Mela());
		stampa(daiLaMela);

		List<Frutta> prendiLaFrutta = new ArrayList<>();

		copia(daiLaMela, prendiLaFrutta);
		stampa(prendiLaFrutta);

		stampa("\n");
	}

	static void daiLaFruttaPrendiLaFrutta() {
		stampa("-- daiLaFruttaPrendiLaFrutta --");

		List<Frutta> daiLaFrutta = List.of(new Mela(), new Pera(), new Banana());
		stampa(daiLaFrutta);

		List<Frutta> prendiLaFrutta = new ArrayList<>();

		copia(daiLaFrutta, prendiLaFrutta);
		stampa(prendiLaFrutta);
		stampa("\n");

	}

	static void stampa(String o) {
		System.out.println(o);
	}

	static void stampa(Object o) {
		System.out.printf("%-10s: %s\n", o.getClass().getSimpleName(), o);
	}
}
