package factorymethod_pizzeria;

public class PizzeriaGourmet extends Pizzeria{

	@Override
	protected Pizza istanziaPizzaMargherita() {
		return new MargheritaGourmet();
	}

	@Override
	protected Pizza istanziaPizzaBoscaiola() {
		return new BoscaiolaGourmet();
	}

}
