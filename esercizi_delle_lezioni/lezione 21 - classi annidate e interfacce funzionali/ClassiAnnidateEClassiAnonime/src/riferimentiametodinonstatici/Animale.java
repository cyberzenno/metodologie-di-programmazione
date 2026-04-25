package riferimentiametodinonstatici;

public class Animale {

	private String animale;

	public Animale(String animale) {
		this.animale = animale;
	}

	public void emettiVersoConAccento(String accento) {
		System.out.println(animale + ": emette verso con accento " + accento);
	}
}
