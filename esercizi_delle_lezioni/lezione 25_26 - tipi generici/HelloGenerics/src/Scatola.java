
public class Scatola<T> {

	private T contenuto;

	public Scatola(T contenuto) {
		this.contenuto = contenuto;
	}

	public T getContenuto() {
		return contenuto;
	}

	public void stampa() {
		System.out.printf("Contenuto == %s", contenuto.getClass().getSimpleName());
	}

}
