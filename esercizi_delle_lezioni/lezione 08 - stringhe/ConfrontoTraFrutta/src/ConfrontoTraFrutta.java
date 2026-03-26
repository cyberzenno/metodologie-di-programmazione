
public class ConfrontoTraFrutta {

	public static void main(String[] args) {
		FruttaDiUnTipo melaDiUnTipo = new FruttaDiUnTipo(1, "Mela verde", "mele melose");
		FruttaDiUnAltroTipo melaDiUnAltroTipo = new FruttaDiUnAltroTipo(1, "Mela verde", "mele melose");

		boolean melaEqualsAltraMela = melaDiUnTipo.equals(melaDiUnAltroTipo);

		//mi ricordo che il prof disse nel webinar
		//che equals confronta "campo per campo"
		//pero' sembra che questo non accada di default		
		System.out.println("melaEqualsAltraMela: " + melaEqualsAltraMela); // stampa false

		System.out.println("-----------------------------");
		
		
		FruttaDiUnTipo f1 = new FruttaDiUnTipo(1, "Mela", "Frutta");
		FruttaDiUnTipo f2 = new FruttaDiUnTipo(1, "Mela", "Frutta");

		System.out.println("f1.equals(f2): " + f1.equals(f2)); // stampa false
		
		// apparentemente, affinche' equals confronti campo per campo,
		// bisogna comunque fare l'override del metodo nella classe da confrontare FruttaDiUnTipo
		// altrimenti equals si comporta come ==
		System.out.println("-----------------------------");

		FruttaDiUnTipo f1bis = f1;
		System.out.println("f1.equals(f1bis): " + f1.equals(f1bis)); // stampa true
		System.out.println("f1 == f1bis: " + (f1 == f1bis)); // stampa true

		System.out.println("-----------------------------");
		// ---- fino a qui sono un po' confuso
		// vediamo le stringhe

		String s1 = new String("ciao mamma");
		String s2 = new String("ciao mamma");

		// per le stringhe invece e' diverso, in quanto equals e' stato gia ridefinito
		// in java.lang
		System.out.println("s1.equals(s2): " + s1.equals(s2)); // stampa true

		// ora non sono sicurissimo se quanto scritto sopra e' esattamente cosi,
		// ma i risultati fino a qui si comportano in tale modo

	}

}
