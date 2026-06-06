package ex_2_ricette_ingredienti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Ex2_Ricetta {

	public enum LivelloDiDifficolta {
		FACILE, MEDIO, DIFFICILE
	}

	public enum Tipologia {
		VEGANA, NON_VEGANA
	}

	private String nome;
	private String descrizione;

	private LivelloDiDifficolta livelloDiDifficolta;
	private Tipologia tipologia;

	private Set<Ex2_Ingrediente> ingredienti;

	private Ex2_Ricetta(String nome, String descrizione, LivelloDiDifficolta livelloDiDifficolta, Tipologia tipologia,
			Set<Ex2_Ingrediente> ingredienti) {

		this.nome = nome;
		this.descrizione = descrizione;
		this.livelloDiDifficolta = livelloDiDifficolta;
		this.tipologia = tipologia;
		this.ingredienti = ingredienti;
	}

	public static class Ex2_RicettaBuilder {
		private String nome;
		private String descrizione;
		private LivelloDiDifficolta livelloDiDifficolta;
		private Tipologia tipologia;
		private Set<Ex2_Ingrediente> ingredienti;

		public Ex2_RicettaBuilder() {
			this.ingredienti = new HashSet<Ex2_Ingrediente>();
		}

		 public Ex2_RicettaBuilder setNome(String nome) {
		        this.nome = nome;
		        return this;
		    }

		    public Ex2_RicettaBuilder setDescrizione(String descrizione) {
		        this.descrizione = descrizione;
		        return this;
		    }

		    public Ex2_RicettaBuilder setLivelloDiDifficolta(LivelloDiDifficolta livelloDiDifficolta) {
		        this.livelloDiDifficolta = livelloDiDifficolta;
		        return this;
		    }

		    public Ex2_RicettaBuilder setTipologia(Tipologia tipologia) {
		        this.tipologia = tipologia;
		        return this;
		    }

		public Ex2_RicettaBuilder addIngrediente(String nome, int grammi) {
			this.ingredienti.add(new Ex2_Ingrediente(nome, grammi));
			return this;
		}

		public Ex2_Ricetta build() {
			return new Ex2_Ricetta(nome, descrizione, livelloDiDifficolta, tipologia, ingredienti);
		}
	}
}
