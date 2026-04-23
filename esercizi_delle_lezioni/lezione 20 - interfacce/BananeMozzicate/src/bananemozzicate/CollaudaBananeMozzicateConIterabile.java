package bananemozzicate;

public class CollaudaBananeMozzicateConIterabile {
	public static void main(String[] args) {

		stampaNota("BananeIterabili con custom clone.");
		BananeIterabili bananeOriginali = new BananeIterabili(new Banana(), new Banana(), new Banana());

		stampaNota("Banane Originali");
		for (Banana b : bananeOriginali) {
			System.out.println(b);
		}

		stampaNota("Banane Clonate con deepClone ==> b.mozzica()");
		BananeIterabili bananeClonate = bananeOriginali.deepClone();
		for (Banana b : bananeClonate) {
			b.mozzica();
			System.out.println(b);
		}

		stampaNota("Banane Originali\n" + ""
				+ "che ora, grazie al \"custom deep copy\", risultano non mozzicate\n"
				+ "e quelle che abbiamo mozzicato, non erano le stess banane.");
		for (Banana b : bananeOriginali) {
			System.out.println(b);
		}
	}

	private static void stampaNota(Object o) {
		System.out.println();
		System.out.println(o);
		System.out.println("-".repeat(30));
	}
}
