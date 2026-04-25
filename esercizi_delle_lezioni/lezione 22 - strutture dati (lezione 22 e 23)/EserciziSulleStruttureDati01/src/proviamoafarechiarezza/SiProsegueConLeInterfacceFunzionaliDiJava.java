package proviamoafarechiarezza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.*;

public class SiProsegueConLeInterfacceFunzionaliDiJava {

	interface Funzione<TipoDiInput, TipoDiOutput> {
		TipoDiOutput esegui(TipoDiInput riferimentoAlTipoDiInput);
	}

	interface FunzioneSuStringhe extends Funzione<String, String> {

	}

	static class SupplyThis {

		private String coso;

		public SupplyThis(String coso) {
			this.coso = coso;
		}

		@Override
		public String toString() {
			return "%s (%s)".formatted(coso, hashCode());
		}

		public void stampa() {
			System.out.println(this);
		}
	}

	public static void main(String[] args) {

		/*
		 * 1. FUNZIONI si inizia SEMPRE dal concetto di funzione, perche la nostra rete
		 * neurale ha gia' un trainig estensivo al riguardo, fino dai primi anni delle
		 * superiori. Usiamolo.
		 * 
		 * Anche Java, mette a disposizione delle interfacce funzionali basate sul
		 * concetto di cui sopra solo che hanno dei nomi che NON fanno parte del nostro
		 * training (almeno non di una percentuale rilevante di noi studenti)
		 * 
		 * Per facilitarci il compito, rivendiamo il concetto di funzione.
		 */
		FunzioneSuStringhe aggiungiCiao = x -> "Ciao " + x;

		print(aggiungiCiao.esegui("Pippo"));
		print(aggiungiCiao.esegui("Pluto"));

		/*
		 * 2. FUNZIONI IN JAVA ora possiamo cominciare con la roba JAVA:
		 */

		/*
		 * FUNCTION <T, R> come la nostra, solo che Java chiama metodo --> .apply
		 */
		Function<String, String> aggiungiCiaoJava = x -> "Ciao " + x + " (ssshhh! e' fatto usando JAVA!)";
		print(aggiungiCiaoJava.apply("Pippo"));

		/*
		 * FUNCTION <T, BOOLEAN> se la funzione prende un oggetto e ritorna un boolean
		 * in Java lo chiamano Predicate
		 */
		Function<String, Boolean> saraMicaFattoConJava = x -> x.toLowerCase().indexOf("java") >= 0;
		print(saraMicaFattoConJava.apply("Pippo Java"));

		Predicate<String> predicoCheSaraMicaFattoConJava = x -> x.toLowerCase().indexOf("java") >= 0;
		print(predicoCheSaraMicaFattoConJava.test("Pippo Java"));

		/*
		 * FUNCTION <T, *> Se prende un tipo ma non restituice niente (void) allora e'
		 * un:
		 * 
		 * CONSUMER<T>
		 */
		Consumer<String> stampaPerFavore = x -> System.out.println("Ok, ok, stampo: " + x);
		stampaPerFavore.accept("Topolino");

		/*
		 * FUNCTION <*, T> Se non prende nessun tipo, ma ne restituisce uno allora e'
		 * un:
		 * 
		 * SUPPLIER<T>
		 */
		Supplier<SupplyThis> creaScatole = () -> new SupplyThis("SCATOLA");
		Supplier<SupplyThis> creaBanane = () -> new SupplyThis("BANANA");

		var s1 = creaScatole.get();
		s1.stampa();

		var b1 = creaBanane.get();
		b1.stampa();

		
		//-----------------
		//preparo lista
		ArrayList<String> lista = new ArrayList<String>(
				Arrays.asList("corto", "to", "luuuuuungoooo", "lunghetto", "a","z"));
		
		/*
		 * FUNCTION <T, T, Integer> E SE POTESSE prendere due tipi e ritornare un (in realta c'e' il BiFunction)
		 * intero, allora sarebbe un
		 * 
		 * COMPARATOR<T>
		 */
		Comparator<String> comparaLunghezza = (x, y) -> x.length() - y.length();

		Collections.sort(lista, comparaLunghezza);
		lista.forEach(x -> System.out.println(x));
		
		
		Comparator<String> comparaAlfabetico = (x, y) -> x.compareTo(y);
		
		Collections.sort(lista, comparaAlfabetico);
		lista.forEach(x -> System.out.println(x));

	}

	private static void print(Object o) {
		System.out.println(o);
	}
}
