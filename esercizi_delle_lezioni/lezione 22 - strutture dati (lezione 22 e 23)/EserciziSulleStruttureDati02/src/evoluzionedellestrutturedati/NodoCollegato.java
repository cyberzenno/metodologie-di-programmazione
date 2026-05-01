package evoluzionedellestrutturedati;

public class NodoCollegato {

	private String valore;
	private NodoCollegato next;

	public NodoCollegato(String valore) {
		this.valore = valore;
	}

	public String getValore() {
		return valore;
	}

	public NodoCollegato next() {
		return next;
	}

	public NodoCollegato last() {
		return hasNext() ? next.last() : this;
	}

	public void setNext(NodoCollegato next) {
		this.next = next;
	}

	public boolean hasNext() {
		return next != null;
	}

	@Override
	public String toString() {
		return " - %s".formatted(valore);
	}
}
