package generazionecasuale.valorifattiincasa;

public enum Colore {

	RED("Rosso", 460), //
	ORANGE("Arancione", 495), //
	YELLOW("Giallo", 525), //
	GREEN("Verde", 570), //
	BLUE("Blu", 635), //
	INDIGO("Indaco", 685), //
	VIOLET("Viola", 760);

	private String nome;
	private int teraHertz;

	Colore(String nome, int teraHertz) {
		this.nome = nome;
		this.teraHertz = teraHertz;
	}

	public String getNome() {
		return nome;
	}

	public int getTeraHertz() {
		return teraHertz;
	}

	public String toString() {
		return String.format("[%s: %sTHz]", this.name(), teraHertz);
	}
}
