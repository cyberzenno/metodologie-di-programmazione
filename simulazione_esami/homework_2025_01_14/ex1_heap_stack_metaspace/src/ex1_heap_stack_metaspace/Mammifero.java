package ex1_heap_stack_metaspace;

public class Mammifero extends Animale {
	private int numero;

	public Mammifero(int numero) {
		super(numero);
		this.numero = +numero;
	}

	public String toString() {
		return super.toString() + "_" + numero;
	}
}