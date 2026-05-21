package proviamoasimulareigenerics;

public class CollaudaUpcastDownCast {
	public static void main(String[] args) {

//		//per certi versi, questo ALF e' un "upcaster":
//		//ci metti dentro Arance e ritorna frutta
//		//fin qui tutto bene
//		ArrayList_Frutta alf = new ArrayList_Frutta();
//
//		alf.add(new Arancia());
//		alf.add(new Arancia());
//		alf.add(new Arancia());
//
//		for (int i = 0; i < alf.size(); i++) {
//
//			Frutta a = alf.getAt(i);
//
//			System.out.println("Frutta a = " + a);
//		}
		
		//proviamo altro
		ArrayList_Arance ala= new ArrayList_Arance();

		ala.add(new Arancia());
		ala.add(new Arancia());
		ala.add(new Arancia());

		for (int i = 0; i < ala.size(); i++) {

			Arancia a = ala.getAt(i);

			System.out.println("Arancia a = " + a);
		}
		
		

	}
}
