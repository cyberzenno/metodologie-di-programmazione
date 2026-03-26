package micromondo3d;

public class Segmento3D {

	private Punto3D puntoInizio;
	private Punto3D puntoFine;

	public Segmento3D(Punto3D inizio, Punto3D fine) {
		this.puntoInizio = inizio;
		this.puntoFine = fine;
	}

	
	public String toString() {
		return puntoInizio + " --- " + puntoFine;
	}
}
