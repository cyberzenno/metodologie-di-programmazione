package esercizidiriscaldamento;

public class HelloHashCode_02 {

	// visto che ci siamo, usiamole queste classi interne
	static class Mela {

	}

	static class Pera {

	}

	public static void main(String[] args) {

		Mela m0 = new Mela();
		Mela m2 = new Mela();
		Mela m3 = new Mela();
		Mela m4 = new Mela();

		for (Mela m : new Mela[] { m0, m2, m3, m4 }) {
			System.out.println(m.hashCode());
		}
	}
}
