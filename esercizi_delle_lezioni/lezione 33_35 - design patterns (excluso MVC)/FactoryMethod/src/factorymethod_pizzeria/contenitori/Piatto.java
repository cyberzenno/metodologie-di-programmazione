package factorymethod_pizzeria.contenitori;

import factorymethod_pizzeria.Pizza;

public class Piatto<P extends Pizza> {
	private P pizza;

	public Piatto(P pizza) {
		this.pizza = pizza;
	}

	public P getPizza() {
		return pizza;
	}

	@Override
	public String toString() {
		return "<piatto>\n%s\n</piatto>".formatted(pizza);
	}
}