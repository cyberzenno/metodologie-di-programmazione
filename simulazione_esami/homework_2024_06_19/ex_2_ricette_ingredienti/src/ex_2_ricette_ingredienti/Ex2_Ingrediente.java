package ex_2_ricette_ingredienti;

public class Ex2_Ingrediente {
	private String nome;
	private int quantitaInGrammi;

	public Ex2_Ingrediente(String nome, int quantitaInGrammi) {
		this.nome = nome;
		this.quantitaInGrammi = quantitaInGrammi;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantitaInGrammi() {
		return quantitaInGrammi;
	}
}
