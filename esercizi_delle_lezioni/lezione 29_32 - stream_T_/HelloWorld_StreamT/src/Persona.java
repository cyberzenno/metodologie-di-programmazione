public class Persona {

	private String version;
	private String nome;
	private String cognome;
	private int eta;
	private String citta;

	public Persona(String nome, String cognome, int eta, String citta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.citta = citta;
		this.version = "";
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getEta() {
		return eta;
	}

	public String getCitta() {
		return citta;
	}

	@Override
	public String toString() {
		return "%s_%s: %s_%s_%s_%s".formatted(version, hashCode() % 100, nome, cognome, eta, citta);
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}