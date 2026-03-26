
public class Programmatore {

	// campi: DEVONO ESSERE PRIVATI!!!
	private String nome;
	private String cognome;
	private String azienda;
	private String linguaggi;

	// costruttore
	public Programmatore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	// metodi
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getAzienda() {
		return azienda;
	}

	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}

	public void addLinguaggio(String linguaggio) {

		if (this.linguaggi == null) {
			this.linguaggi = linguaggio;
		} else {
			this.linguaggi += " " + linguaggio;
		}
	}

	public String getLinguaggi() {
		return linguaggi;
	}

	public String toString() {
		return nome + " " + cognome + ", " + azienda + ", " + getLinguaggi();
	}

	// main
	public static void main(String[] args) {
		Programmatore p1 = new Programmatore("Bjarne", "Stroustrup");

		p1.setAzienda("Morgan Stanley");
		p1.addLinguaggio("C");
		p1.addLinguaggio("C++");

		System.out.println(p1);

		Programmatore p2 = new Programmatore("Brian", "Kernighan");

		p2.setAzienda("AWK");
		p2.addLinguaggio("C");

		System.out.println(p2);

		Programmatore p3 = new Programmatore("James", "Gsling");

		p3.setAzienda("Oracle");
		p3.addLinguaggio("Java");

		System.out.println(p3);

	}
}
