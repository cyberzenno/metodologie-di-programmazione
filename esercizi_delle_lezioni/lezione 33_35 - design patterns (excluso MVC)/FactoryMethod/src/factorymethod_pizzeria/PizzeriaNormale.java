package factorymethod_pizzeria;

import factorymethod_pizzeria.pizze.BoscaiolaNormale;
import factorymethod_pizzeria.pizze.CapricciosaGourmet;
import factorymethod_pizzeria.pizze.CapricciosaNormale;
import factorymethod_pizzeria.pizze.MargheritaNormale;

public class PizzeriaNormale extends Pizzeria {
	@Override
	protected Pizza istanziaPizzaMargherita() {
		return new MargheritaNormale();
	}

	@Override
	protected Pizza istanziaPizzaBoscaiola() {
		return new BoscaiolaNormale();
	}
	
	@Override
	protected Pizza istanziaCapricciosa() {
		return new CapricciosaNormale();
	}
}
