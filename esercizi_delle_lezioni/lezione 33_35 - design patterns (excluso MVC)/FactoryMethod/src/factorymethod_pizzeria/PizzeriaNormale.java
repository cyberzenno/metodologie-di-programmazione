package factorymethod_pizzeria;

public class PizzeriaNormale extends Pizzeria {
	@Override
	protected Pizza istanziaPizzaMargherita() {
		return new MargheritaNormale();
	}

	@Override
	protected Pizza istanziaPizzaBoscaiola() {
		return new BoscaiolaNormale();
	}
}
