package distributoreautomatico;

public abstract class Prodotto {
	private int id;
	private double prezzo;

	public Prodotto(int id, double prezzo) {
		this.id = id;
		this.prezzo = prezzo;
	}

	public int getId() {
		return id;
	}

	public double getPrezzo() {
		return prezzo;
	}

	@Override
	public String toString() {
		return String.format("%s: %-17s €%.2f", id, getClass().getSimpleName(), prezzo);
	}
}
