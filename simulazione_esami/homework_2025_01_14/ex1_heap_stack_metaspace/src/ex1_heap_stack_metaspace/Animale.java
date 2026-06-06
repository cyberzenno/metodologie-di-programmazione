package ex1_heap_stack_metaspace;

public abstract class Animale {
	public static int numeroAnimali = 10;
	private int numero;

	public Animale(int numero) {
		numeroAnimali = numero;
		numeroAnimali++;
		this.numero = numero;
	}

	public String toString() {
		return numeroAnimali + "_" + numero;
	}
}
