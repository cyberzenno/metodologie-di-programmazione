package factorymethod_pizzeria;

import factorymethod_pizzeria.pizze.BoscaiolaVegana;
import factorymethod_pizzeria.pizze.CapricciosaGourmet;
import factorymethod_pizzeria.pizze.CapricciosaVegana;
import factorymethod_pizzeria.pizze.MargheritaVegana;

public class PizzeriaVegana extends Pizzeria{

	@Override
	protected Pizza istanziaPizzaMargherita() {
		return new MargheritaVegana();
	}

	@Override
	protected Pizza istanziaPizzaBoscaiola() {
		return new BoscaiolaVegana();
	}
	
	@Override
	protected Pizza istanziaCapricciosa() {
		return new CapricciosaVegana();
	}

}
