package disneyvsmarvel;

public abstract class Personaggio {

	public Personaggio() {

	}

	public boolean hasDoppiaVita() {
		return this instanceof DoppiaVita;
	}

	public DoppiaVita getDoppiaVita() {
		return (DoppiaVita) this;
	}

	public boolean isSupereroe() {
		return this instanceof Supereroe;
	}

	public Supereroe getSupereroe() {

		if (hasDoppiaVita()) {
			Supereroe s = getDoppiaVita().assumiIdentitaSegreta();

			System.out.printf("DIVENTA SUPER: %s --> %s\n", this, s);

			return s;
		}

		return (Supereroe) this;
	}

	public Personaggio getPersonaggio() {

		if (hasDoppiaVita()) {
			Personaggio p =  (Personaggio) getDoppiaVita().assumiIdentitaPubblica();

			System.out.printf("RITORNA NORMALE: %s <-- %s\n", p, this);
		}

		return this;

	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
