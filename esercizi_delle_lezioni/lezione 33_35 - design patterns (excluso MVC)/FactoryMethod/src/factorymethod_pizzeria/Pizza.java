package factorymethod_pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import factorymethod_pizzeria.Pizzeria.TipoDiPizza;

public abstract class Pizza {
	public enum Cottura {
		CRUDA, COTTA
	}

	public enum Taglio {
		INTERA, TAGLIATA
	}

	public enum Guarnizione {
		NESSUNA, GUARNITA
	}

	public enum Temperatura {
		SURGELATA, FREDDA, CALDA
	}

	private Cottura cottura;
	private Taglio taglio;
	private Guarnizione guarnizione;
	private Temperatura temperatura;

	protected ArrayList<String> ingredienti;

	public Pizza() {
		this.cottura = Cottura.CRUDA;
		this.taglio = Taglio.INTERA;
		this.guarnizione = Guarnizione.NESSUNA;
		this.temperatura = Temperatura.FREDDA;

		ingredienti = new ArrayList<String>();
	}

	protected void cuoci() {
		this.cottura = Cottura.COTTA;
		this.temperatura = Temperatura.CALDA;
	}

	protected void guarnisci() {
		this.guarnizione = Guarnizione.GUARNITA;
	}

	protected void taglia() {
		this.taglio = Taglio.TAGLIATA;
	}

	protected void surgela() {
		this.temperatura = Temperatura.SURGELATA;
	}

	protected void addIngredienti(String... ingredienti) {
		for (String ingrediente : ingredienti) {
			this.ingredienti.add(ingrediente);
		}
	}

	public ArrayList<String> getIngredienti() {
		return ingredienti;
	}

	
	@Override
	public String toString() {
		
		String classeConcreta = getClass().getSimpleName();
		String ingredienti = String.join(", ", this.ingredienti);
		String altriStati = String.join(", ", cottura.toString(), taglio.toString(), guarnizione.toString());
		
		return "   -- %s --\n   %s \n   %s -- %s".formatted(
				classeConcreta,
				ingredienti,
				temperatura,
				altriStati);
	}
	
	
	/**
	 * Brutal parse: Boscaiola if starts with 'b', Margherita otherwise.
	 * @param tipoDiPizza
	 * @return TipoDiPizza
	 */
	public static TipoDiPizza parse(String tipoDiPizza) {
		return tipoDiPizza.startsWith("b") ? TipoDiPizza.BOSCAIOLA:
			 TipoDiPizza.MARGHERITA;
	}
}
