package ex1_heap_stack_metaspace;

//ESERCIZIO 1 (max 4 punti)
//Heap-Stack-Metaspace: fotografare lo stato della memoria nel punto indicato nel metodo
//main della classe Main.
public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s;
		String t;
		int k;
		Integer intero;
		Animale a = new Mammifero(0);
		Mammifero b = new Mammifero(1);
		t = ((Mammifero) a).toString();
		s = b.toString();
		boolean e = s.equals(t);
		// FOTOGRAFARE LO STATO DELLA MEMORIA IN QUESTO PUNTO
	}
}

//Consegnare:
//- il file Ex1.pdf con il disegno dello stato della memoria, NON COMPRESSO.
