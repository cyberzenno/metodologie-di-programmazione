package proviamoasimulareigenerics;

public class ArrayList_Frutta implements MetodiPerArrayList<Frutta> {

	private ArrayList_Object alo;

	public ArrayList_Frutta() {
		alo = new ArrayList_Object();
	}

	@Override
	public void add(Frutta t) {
		alo.add(t);
	}

	@Override
	public Frutta removeAt(int i) {
		return (Frutta) alo.removeAt(i);
	}

	@Override
	public Frutta getAt(int i) {
		return (Frutta) alo.getAt(i);
	}

	@Override
	public Frutta[] getAll() {
		return (Frutta[]) alo.getAll();
	}

	@Override
	public void stampa() {
		System.out.printf("%s\n-----------------\n", getClass().getSimpleName());
		for (int i = 0; i < alo.size(); i++) {
			System.out.println(alo.getAt(i));
		}
		System.out.printf("\n");
	}

	@Override
	public int size() {
		return alo.size();
	}
}
