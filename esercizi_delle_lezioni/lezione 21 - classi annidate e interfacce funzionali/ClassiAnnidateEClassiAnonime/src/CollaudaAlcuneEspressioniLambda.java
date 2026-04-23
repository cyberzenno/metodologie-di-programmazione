
public class CollaudaAlcuneEspressioniLambda {
	public static void main(String[] args) {

		Runnable salutaConClasseAnonima = new Runnable() {
			@Override
			public void run() {
				System.out.println("ciao con classe anonima");

			}
		};

		Runnable salutaConEspressioneLambda = () -> System.out.println("ciao con espressione lambda");

		Runnable[] salutiVari = { salutaConClasseAnonima, salutaConEspressioneLambda };

		for (Runnable runnable : salutiVari) {
			runnable.run();
		}

		@FunctionalInterface
		interface SalutaConInterfacciaAnnidata {
			void saluta(String nome);
		}

		SalutaConInterfacciaAnnidata salutaCosi = (String nome) -> System.out.printf("Ciao ciao ciao %s!!!\n", nome);
		SalutaConInterfacciaAnnidata salutaCosa = (String nome) -> System.out.printf("Hola hola hola %s!!!\n", nome);

		SalutaConInterfacciaAnnidata[] altriSaluti = { salutaCosi, salutaCosa };

		for (SalutaConInterfacciaAnnidata s : altriSaluti) {
			s.saluta("Mario");
		}

	}
}
