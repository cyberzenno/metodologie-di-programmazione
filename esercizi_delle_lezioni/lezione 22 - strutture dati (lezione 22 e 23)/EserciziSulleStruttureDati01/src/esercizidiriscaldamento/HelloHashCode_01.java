package esercizidiriscaldamento;

/**
 * Prima di entrare nel vivo delle Collezione, cerco di capire con degli esempi
 * basilari, come funziona il Hash Code. Dopo aver speso alcune ore tra le slide
 * e litigare con ChatGPT, provo a fare degli esempi partendo da zero. Vediamo.
 */
public class HelloHashCode_01 {

	public static void main(String[] args) {

		// vediamo un po' di hash
		System.out.println("-".repeat(20));
		System.out.println("Integer --> HashCode VS String --> HashCode");
		System.out.println(" ---> Il HashCode di un intero, sembra essere l'intero stesso");
		System.out.println("-".repeat(20));

		for (int i = 0; i < 20; i++) {
			Integer x = i; // auto-boxing, anche perche i lcostruttore sembra deprecato da un po'
			System.out.printf("Numero: %5s --> %5s     VS     Stringa: %5s --> %5s\n", x, x.hashCode(), x.toString(),
					x.toString().hashCode());
		}

		System.out.println("-".repeat(20));
		System.out.println("Character --> HashCode VS String --> HashCode");
		System.out.println(" ---> Il HashCode di un carattere, sembra essere il valore intero del carattere stesso");
		System.out.println("-".repeat(20));

		for (int i = 48; i < 91; i++) {
			Character x = (char) i;
			System.out.printf("Carattere: %5s --> %5s     VS     Stringa: %5s --> %5s\n", x, x.hashCode(), x.toString(),
					x.toString().hashCode());
		}
		
		System.out.println("-".repeat(20));
		System.out.println("String 0 --> HashCode VS String 00 --> HashCode VS String 000 --> HashCode");
		System.out.println("-".repeat(20));
		
		for (int i = 0; i < 21; i++) {
			String x = "%d".formatted(i);
			String xx = "%02d".formatted(i);
			String xxx = "%03d".formatted(i);
			
			System.out.printf(""
					+ "Stringa: %5s --> %5s   VS   "
					+ "Stringa: %5s --> %5s   VS   "
					+ "Stringa: %5s --> %5s   VS   "
					+ "\n", 
					x, x.hashCode(),
					xx, xx.hashCode(),
					xxx, xxx.hashCode()
					);
		}
		
		System.out.println("-".repeat(20));
		System.out.println("E qui cominciano i casi particolari che vediamo nel prossimo file.");
		System.out.println("-".repeat(20));
		System.out.printf("1 --> %5s   VS   1.0 --> %5s", Integer.valueOf(1).hashCode(), Double.valueOf(1).hashCode());
	}
}
