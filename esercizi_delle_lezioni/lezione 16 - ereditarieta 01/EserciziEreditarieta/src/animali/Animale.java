package animali;

public abstract class Animale {

	private int numeroDiZampe;
	private Taglia taglia;

	public Animale() {
	}

	public Animale(int numeroDiZampe, Taglia taglia) {
		this.numeroDiZampe = numeroDiZampe;
		this.taglia = taglia;
	}

	public int getNumeroDiZampe() {
		return numeroDiZampe;
	}

	public Taglia getTaglia() {
		return taglia;
	}

	public String toString() {
		return this.getClass().getSimpleName() + ", " + numeroDiZampe + " zampe, " + "taglia " + taglia;
	}

	public void stampaBestia() {
		System.out.println(this);
	}

	public abstract void emettiVerso();
}
