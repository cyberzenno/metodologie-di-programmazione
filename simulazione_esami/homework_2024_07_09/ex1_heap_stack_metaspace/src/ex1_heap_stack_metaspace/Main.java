package ex1_heap_stack_metaspace;

//ESERCIZIO 1 (max 5 punti)
//Heap-Stack-Metaspace: fotografare lo stato della memoria nel punto indicato nel metodo
//main della classe Main.
public class Main {
	public static void main(String[] args) {
		String s;
		int k;
		Integer i = 8;
		Byte b = null;
		A a1 = new B();
		A a2 = new C();
		k = a1.getInstaces() + ((B) a2).getInstaces();
		// fotografare lo stato della memoria in questo punto
	}
}

//Consegnare:
//- il file Ex1.pdf con il disegno dello stato della memoria, NON COMPRESSO.
//
