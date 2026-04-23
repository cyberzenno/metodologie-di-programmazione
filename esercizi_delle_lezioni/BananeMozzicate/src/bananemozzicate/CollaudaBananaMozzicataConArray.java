package bananemozzicate;

public class CollaudaBananaMozzicataConArray {
	public static void main(String[] args) {

		Banana[] bananeOriginali = {
				 new Banana(),
				 new Banana(),
				 new Banana(),
				 new Banana(),
				 new Banana()
		};
		
		stampaNota("Banane Originali");
		for (int i = 0; i < bananeOriginali.length; i++) {
			System.out.println(bananeOriginali[i]);
		}
				
		stampaNota("Banane Clonate ==> b.mozzica()");
		Banana[] bananeClonate = bananeOriginali.clone();
		for (int i = 0; i < bananeClonate.length; i++) {
			var b = bananeClonate[i];
			b.mozzica();
			System.out.println(b);
		}
		
		stampaNota("Banane Originali\n"
				+ "che ora pero', per via dello \"shallow copy\", risultano mozzicate\n"
				+ "o meglio, risultano essere le stesse banana.");
		for (int i = 0; i < bananeOriginali.length; i++) {
			System.out.println(bananeOriginali[i]);
		}
	}
	
	private static void stampaNota(Object o) {
		System.out.println();
		System.out.println(o);
		System.out.println("-".repeat(30));		
	}
}
