package ex_2_ricette_ingredienti;

public class Ex2_Ingrediente {
	private String nome;
	private int grammi;

	public Ex2_Ingrediente(String nome, int quantitaInGrammi) {
		this.nome = nome;
		this.grammi = quantitaInGrammi;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantitaInGrammi() {
		return grammi;
	}
	
	@Override
	public String toString() {
		return "%s: %sg".formatted(nome, grammi);
	}
}
