package formebase;

public abstract class Forma {
	private String nome;

	public Forma() {
		this("Forma astratta");
	}
	
	public Forma(String nome) {
		this.nome = nome;
	}
	
	public void stampaNome() {
		System.err.println(nome);
	}
	
	public abstract void stampa();
}
