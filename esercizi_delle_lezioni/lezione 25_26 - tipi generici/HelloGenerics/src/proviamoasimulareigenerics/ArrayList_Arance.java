package proviamoasimulareigenerics;

public class ArrayList_Arance implements MetodiPerArrayList<Frutta> {

	private ArrayList_Object alo;

	public ArrayList_Arance() {
		alo = new ArrayList_Object();
	}

	@Override
	public void add(Frutta t) {
		alo.add(t);
	}

	@Override
	public Arancia removeAt(int i) {
		return (Arancia) alo.removeAt(i);
	}

	@Override
	public Arancia getAt(int i) {
		return (Arancia) alo.getAt(i);
	}

	@Override
	public Arancia[] getAll() {
		return (Arancia[]) alo.getAll();
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
