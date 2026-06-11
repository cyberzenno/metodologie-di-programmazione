package ex_2_ricette_ingredienti;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Rappresenta una ricetta di cucina, con i relativi ingredienti, i passaggi da
 * seguire, il nome, il livello di difficoltà e la tipologia
 */
public class Ex2_Ricetta {

	/** I possibili valori del livello di difficoltà */
	public enum LivelloDiDifficolta {

		FACILE, MEDIO, DIFFICILE
	}

	/** I possibili valori per la tipologia di ricetta */
	public enum Tipologia {

		VEGANA, NON_VEGANA
	}

	/** Il nome della ricetta */
	private String nome;

	/** La descrizione dei passi da seguire */
	private String descrizione;

	/** Il livello di difficolta. */
	private LivelloDiDifficolta livelloDiDifficolta;

	/** La tipologia. */
	private Tipologia tipologia;

	/** L'insieme degli ingredienti */
	private Set<Ex2_Ingrediente> ingredienti;

	/**
	 * Costruttore privato della ricetta, la cui costruzione effettiva è delegata al
	 * {@link Ex2_RicettaBuilder}.
	 *
	 * @param nome                il nome
	 * @param descrizione         la descrizione
	 * @param livelloDiDifficolta il livello di difficolta
	 * @param tipologia           la tipologia
	 * @param ingredienti         gli ingredienti
	 */
	private Ex2_Ricetta(String nome, String descrizione, LivelloDiDifficolta livelloDiDifficolta, Tipologia tipologia,
			Set<Ex2_Ingrediente> ingredienti) {

		this.nome = nome;
		this.descrizione = descrizione;
		this.livelloDiDifficolta = livelloDiDifficolta;
		this.tipologia = tipologia;
		this.ingredienti = ingredienti;
	}

	/**
	 * Ritorna il nome della ricetta
	 *
	 * @return il nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Ritorna la descrizione dei passi da seguire della ricetta.
	 *
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * Ritorna il livello di difficolta.
	 *
	 * @return il livello di difficolta
	 */
	public LivelloDiDifficolta getLivelloDiDifficolta() {
		return livelloDiDifficolta;
	}

	/**
	 * Ritorna la tipologia della ricetta.
	 *
	 * @return la tipologia
	 */
	public Tipologia getTipologia() {
		return tipologia;
	}

	/**
	 * Ritorna gli ingredienti della ricetta.
	 *
	 * @return gli ingredienti
	 */
	public Set<Ex2_Ingrediente> getIngredienti() {
		return ingredienti;
	}

	/**
	 * Override del metodo equals basato su: nome, descrizione, tipologia. Assumiamo
	 * che se due ricette hanno questi valori uguali, allora sono uguali.
	 *
	 * @param l'oggetto con cui confrontare
	 * @return risultato del confronto di uguaglianza
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Ex2_Ricetta that = (Ex2_Ricetta) obj;

		boolean stessoNome = Objects.equals(this.getNome(), that.getNome());
		boolean stessaDescrizione = Objects.equals(this.getDescrizione(), that.getDescrizione());
		boolean stessaTipologia = Objects.equals(this.getTipologia(), that.getTipologia());

		return stessoNome && stessaDescrizione && stessaTipologia;
	}

	/**
	 * Override del metodo hashCode basato su: nome, descrizione, tipologia. Implementazione custom con base 31.
	 *
	 * @return il numero che rappresenta il hashCode della ricetta
	 */
	@Override
	public int hashCode() {
		int hashCode = 1;

		hashCode = 31 * hashCode + getHashCodeOrZero(nome);
		hashCode = 31 * hashCode + getHashCodeOrZero(descrizione);
		hashCode = 31 * hashCode + getHashCodeOrZero(tipologia);

		return hashCode;
	}

	/**
	 * Metodo di utilita' che ritorna hash code oppure zero se l'oggetto e' null.
	 *
	 * @param l'oggetto da cui estrarre il hashCode
	 * @return hash code or zero se l'oggetto e' null
	 */
	private static int getHashCodeOrZero(Object valore) {
		return valore == null ? 0 : valore.hashCode();
	}

	/**
	 * La classe static interna che implementa il builder pattern per la ricetta. Una ricetta si puo' costruire solo tramite questa classe.
	 */
	public static class Ex2_RicettaBuilder {

		/** Il nome della ricetta */
		private String nome;

		/** La descrizione dei passi da seguire */
		private String descrizione;

		/** Il livello di difficolta. */
		private LivelloDiDifficolta livelloDiDifficolta;

		/** La tipologia. */
		private Tipologia tipologia;

		/** L'insieme degli ingredienti */
		private Set<Ex2_Ingrediente> ingredienti;

		/**
		 * Costruttore della classe builder per la ricetta
		 */
		public Ex2_RicettaBuilder() {
			this.ingredienti = new HashSet<Ex2_Ingrediente>();
		}

		/**
		 * Imposta il nome da utilizzare durante la costruzione finale della ricetta
		 *
		 * @param il nome della ricetta
		 * @return l'istanza della classe builder per il successivo passaggio da impostare
		 */
		public Ex2_RicettaBuilder setNome(String nome) {
			this.nome = nome;
			return this;
		}

		/**
		 * Imposta la descrizione dei passaggi della ricetta da utilizzare durante la costruzione finale della ricetta
		 *
		 * @param la descrizione dei passaggi della ricetta
		 * @return l'istanza della classe builder per il successivo passaggio da impostare
		 */
		public Ex2_RicettaBuilder setDescrizione(String descrizione) {
			this.descrizione = descrizione;
			return this;
		}

		/**
		 * Imposta il livello di difficolta' della ricetta da utilizzare durante la costruzione finale della ricetta
		 *
		 * @param il livello di difficolta' della ricetta
		 * @return l'istanza della classe builder per il successivo passaggio da impostare
		 */
		public Ex2_RicettaBuilder setLivelloDiDifficolta(LivelloDiDifficolta livelloDiDifficolta) {
			this.livelloDiDifficolta = livelloDiDifficolta;
			return this;
		}

		/**
		 * Imposta la tipologia della ricetta da utilizzare durante la costruzione finale della ricetta
		 *
		 * @param la tipologia della ricetta
		 * @return l'istanza della classe builder per il successivo passaggio da impostare
		 */
		public Ex2_RicettaBuilder setTipologia(Tipologia tipologia) {
			this.tipologia = tipologia;
			return this;
		}

		/**
		 * Aggiunge un ingrediente alla lista degli ingredienti da utilizzare durante la costruzione finale della ricetta
		 *
		 * @param il nome dell'ingrediente
		 * @param i grammi da utilizzare per l'ingrediente 
		 * @return l'istanza della classe builder per il successivo passaggio da impostare
		 */
		public Ex2_RicettaBuilder addIngrediente(String nome, int grammi) {
			this.ingredienti.add(new Ex2_Ingrediente(nome, grammi));
			return this;
		}

		/**
		 * Finalmente, construice l'istanza della ricetta utilizzando i valori impostati con la classe builder
		 *
		 * @return l'istanza della ricetta
		 */
		public Ex2_Ricetta build() {
			return new Ex2_Ricetta(nome, descrizione, livelloDiDifficolta, tipologia, ingredienti);
		}
	}
}
