package factorymethod_pizzeria.contenitori;

import factorymethod_pizzeria.Pizza;

public class Scatola<P extends Pizza> {
	private P pizza;
	
	public Scatola(P pizza) {
		this.pizza = pizza;
	}

	public P getPizza() {
		return pizza;
	}
	
	@Override
	public String toString() {
		return "<scatola>\n%s\n</scatola>".formatted(pizza);
	}
}
