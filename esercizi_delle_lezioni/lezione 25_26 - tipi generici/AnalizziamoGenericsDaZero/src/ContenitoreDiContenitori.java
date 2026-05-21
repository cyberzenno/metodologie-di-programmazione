import java.util.ArrayList;

public class ContenitoreDiContenitori {

	private ArrayList<Contenitore<?>> cc;

	public ContenitoreDiContenitori() {
		cc = new ArrayList<>();
	}

	public void aggiungiContenitoreDiFrutta(Contenitore<Frutta> c) {
		cc.add(c);
	}

	public void aggiungiContenitoreDiPera(Contenitore<Pera> c) {
		cc.add(c);
	}

	public void aggiungiContenitoreDiFruttaODerivati(Contenitore<? extends Frutta> c) {
		cc.add(c);
	}

//	public void aggiungiContenitoreDiMotorino(Contenitore<Motorino> c) {
//		cc.add(c);
//	}

	public <T extends Frutta> void aggiungiContenitoreDiT(Contenitore<T> c) {

		T t1 = (T) c.getContenuto();
		T t2;// = c.getContenuto();
		T t3;// = c.getContenuto();

		cc.add(c);
	}

	public void aggiungiContenitoreDiPuntoInterrogativo(Contenitore<?> c) {
		cc.add(c);
	}

	public void print() {
		for (Contenitore<?> c : cc) {
			System.out.println(c);
		}
	}
}
