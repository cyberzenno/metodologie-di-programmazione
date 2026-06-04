package factorymethod_pizzeria;

public abstract class Pizzeria {

	public enum TipoDiPizza {
		MARGHERITA, BOSCAIOLA
	}

	public Piatto<Pizza> ordinaPizzaAlTavolo(TipoDiPizza tipo) {
		Pizza p = istanziaPizza(tipo);

		p.cuoci();
		p.guarnisci();
		p.taglia();

		// impiatta e ritorna
		return new Piatto<Pizza>(p);
	}

	public Scatola<Pizza> ordinaPizzaAPortareVia(TipoDiPizza tipo) {
		Pizza p = istanziaPizza(tipo);
		p.cuoci();
		p.guarnisci();
		p.taglia();

		// inscatola e ritorna
		return new Scatola<Pizza>(p);
	}

	public Scatola<Pizza> ordinaPizzaSurgelataCruda(TipoDiPizza tipo) {
		Pizza p = istanziaPizza(tipo);

		p.cuoci();
		p.guarnisci();

		// surgela
		p.surgela();

		// inscatola e ritorna
		return new Scatola<Pizza>(p);
	}

	public Scatola<Pizza> ordinaPizzaSurgelataCotta(TipoDiPizza tipo) {
		Pizza p = istanziaPizza(tipo);
		
		// surgela
		p.surgela();

		// inscatola e ritorna
		return new Scatola<Pizza>(p);
	}

	private Pizza istanziaPizza(TipoDiPizza tipo) {
		return switch (tipo) {
		case MARGHERITA:
			yield istanziaPizzaMargherita();
		case BOSCAIOLA:
			yield istanziaPizzaBoscaiola();
		};
	}

	/**
	 * Brutal parse: Vegan if starts with 'v', Normal otherwise.
	 * @param tipoDiPizzeria
	 * @return Pizzeria
	 */
	public static Pizzeria parse(String tipoDiPizzeria) {
		return tipoDiPizzeria.startsWith("v") ? new PizzeriaVegana()
				: new PizzeriaNormale();
	}
	
	/**
	 * Factory Method
	 * 
	 * @return istanza di Pizza Margherita
	 */
	protected abstract Pizza istanziaPizzaMargherita();

	/**
	 * Factory Method
	 * 
	 * @return istanza di Pizza Boscaiola
	 */
	protected abstract Pizza istanziaPizzaBoscaiola();
}
