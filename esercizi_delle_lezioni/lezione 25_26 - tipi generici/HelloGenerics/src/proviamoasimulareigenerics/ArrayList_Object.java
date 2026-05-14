package proviamoasimulareigenerics;

import java.util.Arrays;

public class ArrayList_Object implements MetodiPerArrayList<Object> {

	public final static int DIMENSIONE_INIZIALE = 100;

	private Object[] arrayInterno;
	private int k;

	public ArrayList_Object() {
		this.arrayInterno = new Object[DIMENSIONE_INIZIALE];
	}

	@Override
	public void add(Object t) {
		arrayInterno[k++] = t;
	}

	@Override
	public Object removeAt(int x) {
		Object returnThis = arrayInterno[x];

		while (x < k)
			arrayInterno[x] = arrayInterno[++x];

		k--;

		return returnThis;
	}

	@Override
	public Object getAt(int i) {
		return arrayInterno[i];
	}

	@Override
	public Object[] getAll() {
		return Arrays.copyOf(arrayInterno, k);
	}

	@Override
	public void stampa() {
		System.out.printf("%s\n-----------------\n",getClass().getSimpleName());
		for (int i = 0; i < k; i++) {
			System.out.println(arrayInterno[i]);
		}
		System.out.printf("\n");
	}

	@Override
	public int size() {
		return k;
	}
}
