package collezioni;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ComparableVsComparator {

	/*
	 * classe ANNIDATA in quanto STATICA
	 */
	static class Frutta implements Comparable<Frutta> {
		private String nome;

		Frutta(String nome) {
			this.nome = nome;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		@Override
		public String toString() {
			return this.nome + " (" + hashCode() + ")";
		}

		@Override
		public int compareTo(Frutta that) {

			return this.nome.compareTo(that.nome);
		}
	}

	public static void main(String[] args) {

		Function<Frutta, Frutta> x;
		
		
		
		BiFunction<Frutta, Frutta, Integer> comparatoreFattoInCasa = (a, b) -> a.nome.length() - b.nome.length();
		BiFunction<Frutta, Frutta, Integer> comparabileFattoInCasa = Frutta::compareTo;
		
		Frutta mela = new Frutta("Mela");
		Frutta pera = new Frutta("Pera");
		
		System.out.printf("comparatoreFattoInCasa.apply(mela, pera) == %s\n\n", comparatoreFattoInCasa.apply(mela, pera));
		System.out.printf("comparabileFattoInCasa.apply(mela, pera) == %s\n\n", comparabileFattoInCasa.apply(mela, pera));

		Comparator<Frutta> comparatore = (a, b) -> a.nome.length() - b.nome.length();
//		Comparable<Frutta> comparabile = (a) -> a.nome.length();
		
		System.out.printf("comparatore.compare(mela, pera) == %s\n\n", comparatore.compare(mela, pera));
		

	}
}
