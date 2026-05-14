package proviamoasimulareigenerics;

/*
 * facciamo finta che i generic non esistono, ma facciamo solo questa interfaccia per scrivere prima 
 * tutti i metodi necessari per le varie prove
 */
public interface MetodiPerArrayList<T> {
	void add(T t);

	T removeAt(int i);

	T getAt(int i);

	T[] getAll();
	
	void stampa();
	
	int size();
}
