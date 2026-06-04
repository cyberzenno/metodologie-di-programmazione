package factorymethod_pizzeria;

import com.sun.source.tree.YieldTree;

import factorymethod_pizzeria.contenitori.Piatto;
import factorymethod_pizzeria.contenitori.Scatola;

public abstract class Pizzeria {

	public enum TipoDiPizza {
		MARGHERITA, BOSCAIOLA, CAPRICCIOSA
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
		case CAPRICCIOSA:
			yield istanziaCapricciosa();
		};
	}

	/**
	 * Brutal parse: Vegan if starts with 'v', Normal otherwise.
	 * 
	 * @param tipoDiPizzeria
	 * @return Pizzeria
	 */
	public static Pizzeria parse(String tipoDiPizzeria) {

		return switch (tipoDiPizzeria.charAt(0)) {

		default:
		case 'n':
			yield new PizzeriaNormale();
		case 'v':
			yield new PizzeriaVegana();
		case 'g':
			yield new PizzeriaGourmet();

		};
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
	
	/**
	 * Factory Method
	 * 
	 * @return istanza di Pizza Capricciosa
	 */
	protected abstract Pizza istanziaCapricciosa();
}
