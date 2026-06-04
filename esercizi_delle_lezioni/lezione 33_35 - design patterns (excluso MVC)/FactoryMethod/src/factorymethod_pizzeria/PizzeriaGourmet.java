package factorymethod_pizzeria;

import factorymethod_pizzeria.pizze.BoscaiolaGourmet;
import factorymethod_pizzeria.pizze.CapricciosaGourmet;
import factorymethod_pizzeria.pizze.MargheritaGourmet;

public class PizzeriaGourmet extends Pizzeria{

	@Override
	protected Pizza istanziaPizzaMargherita() {
		return new MargheritaGourmet();
	}

	@Override
	protected Pizza istanziaPizzaBoscaiola() {
		return new BoscaiolaGourmet();
	}

	@Override
	protected Pizza istanziaCapricciosa() {
		return new CapricciosaGourmet();
	}
	

}
