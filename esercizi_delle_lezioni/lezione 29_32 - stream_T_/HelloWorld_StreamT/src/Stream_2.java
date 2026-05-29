import java.util.Arrays;
import java.util.stream.Collectors;

//import sun.font.FontRunIterator;

import java.util.*;

@SuppressWarnings("unused")
public class Stream_2 {
	public static void main(String[] args) {
		// dai, andiamo avanti

		String testo = "il gatto sul tetto il tetto era vecchio il gatto dormiva";

		// 1. conta le parole
		List<String> listaDiParole = Arrays.asList(testo.split(" "));
		List<Frutta> listaDiFrutta = Arrays.asList(new Frutta("Mela"), new Frutta("Pera"), new Frutta("Banana"),
				new Frutta("Banana"), new Frutta("Lampone"), new Frutta("Esageratissimissimo_Frutto_Esoticissimo"), new Frutta("O"));

		listaDiFrutta.stream().forEach(x -> print(x));
		line();
		listaDiFrutta.stream().forEach(x -> {
			if (x.hashCode() % 2 == 0)
				x.mozzica();

		});
		listaDiFrutta.stream().forEach(x -> print(x));
		line();
		var ris = listaDiFrutta
				.stream()
				.filter(x -> {
					print("filter",x);
					
					return x.getNome().contains("mozz");
				})
				.limit(3)
				.count();

		print("mozzicate",ris);
		line();
		
		print("distinct", listaDiFrutta.stream().collect(MyCustomCollectors.Distinct()));
		line();
		print("maxBy", listaDiFrutta.stream().collect(Collectors.maxBy((a,b)->{
			
			return a.getNome().length() - b.getNome().length();
			
		})));
		
		print("minBy", listaDiFrutta.stream().collect(Collectors.minBy((a,b)->{
			
			return a.getNome().length() - b.getNome().length();
			
		})));
	}

	private static void line() {
		print("\n-------------------------\n");
	}

	private static void print(Object banner) {
		System.out.println(banner);
	}

	private static void print(Object banner, Object value) {
		System.out.printf("%s: %s\n", banner, value);
	}
}
