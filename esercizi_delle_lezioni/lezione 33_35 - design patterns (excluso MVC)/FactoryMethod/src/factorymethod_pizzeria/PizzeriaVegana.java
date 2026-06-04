package factorymethod_pizzeria;

public class PizzeriaVegana extends Pizzeria{

	@Override
	protected Pizza istanziaPizzaMargherita() {
		return new MargheritaVegana();
	}

	@Override
	protected Pizza istanziaPizzaBoscaiola() {
		return new BoscaiolaVegana();
	}

}
