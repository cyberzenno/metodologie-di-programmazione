public class Frutta {

	private String nome;

	public Frutta(String nome) {
		this.nome = nome;
	}

	public void mozzica() {
		this.nome += "_mozzicata";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {

		return "%s_%s".formatted(nome, hashCode() % 100);
	}
}