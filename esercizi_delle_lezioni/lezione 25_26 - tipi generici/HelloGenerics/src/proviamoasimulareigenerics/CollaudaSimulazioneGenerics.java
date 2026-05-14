package proviamoasimulareigenerics;

public class CollaudaSimulazioneGenerics {
	public static void main(String[] args) {

		ArrayList_Object alo = new ArrayList_Object();

		alo.add(new Pera());
		alo.add(new Mela());
		alo.add(new Banana());
		alo.add(new Pera());
		alo.add(new Banana());

		alo.removeAt(0);
		alo.removeAt(5);
		alo.stampa();

		
		ArrayList_Frutta alf = new ArrayList_Frutta();

		alf.add(new Mela());
		alf.add(new Pera());
		alf.add(new Pera());
		alf.add(new Banana());
		
		alf.removeAt(2);

		alf.stampa();

	}
}
