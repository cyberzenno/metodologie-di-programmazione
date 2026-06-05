package ex1_heap_stack_metaspace;

//
//ESERCIZIO 1 (max 5 punti)
//Heap-Stack-Metaspace: fotografare lo stato della memoria nel punto indicato nel metodo
//main della classe Main.
public class Main {
	Object o;

	public static void main(String[] args) {
		int k;
		String s;
		LongPlay lp = new LongPlay("Albedo 0,39", "Vangelis");
		LongPlay rlp = new RemasteredLongPlay("Albedo 0,39", "Vangelis", 2024);
		String result = ((LongPlay) rlp).toString();
		
		//FOTOGRAFARE LA MEMORIA IN QUESTO PUNTO
	}
}
//Consegnare:
//- il file Ex1.pdf con il disegno dello stato della memoria, NON COMPRESSO.
//
