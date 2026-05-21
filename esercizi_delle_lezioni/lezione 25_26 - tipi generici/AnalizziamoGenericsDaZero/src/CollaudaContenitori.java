
public class CollaudaContenitori {

	public static void main(String[] args) {

		Contenitore<Frutta> cf = new Contenitore<Frutta>(new Frutta());
		Contenitore<Pera> cp = new Contenitore<Pera>(new Pera());
		//cf = cp;

		Contenitore<?> cx = new Contenitore<>(new Frutta());
		cx = new Contenitore<Mela>(new Mela());
		cx = new Contenitore<Pera>(new Pera());
//		cx = new Contenitore<Motorino>(new Motorino());

		cx.print();
		
		Contenitore<Frutta> contenitoreDiFrutta = new Contenitore<Frutta>(new Frutta());

		Contenitore<Pera> contenitoreDiPere = new Contenitore<Pera>(new Pera());
//		Contenitore<Motorino> contenitoreDiMotorini = new Contenitore<>(new Motorino());

		ContenitoreDiContenitori contenitoreDiContenitori = new ContenitoreDiContenitori();

		// ora, possiamo fare questo, dovendo essere molto specifici
		contenitoreDiContenitori.aggiungiContenitoreDiFrutta(contenitoreDiFrutta);
		contenitoreDiContenitori.aggiungiContenitoreDiPera(contenitoreDiPere);
		// questo non funzionerebbe
		// cc.aggiungiContenitoreDiFrutta(cp);
		// ma questo si
		contenitoreDiContenitori.aggiungiContenitoreDiFruttaODerivati(contenitoreDiPere);
//		contenitoreDiContenitori.aggiungiContenitoreDiMotorino(contenitoreDiMotorini);

		// aggiungi qualunque tipo di contenitore, usando <T>
		contenitoreDiContenitori.aggiungiContenitoreDiT(contenitoreDiFrutta);
		contenitoreDiContenitori.aggiungiContenitoreDiT(contenitoreDiPere);
//		contenitoreDiContenitori.aggiungiContenitoreDiT(contenitoreDiMotorini);

		// aggiungi qualunque tipo di contenitore, usando <?>
		contenitoreDiContenitori.aggiungiContenitoreDiPuntoInterrogativo(contenitoreDiFrutta);
		contenitoreDiContenitori.aggiungiContenitoreDiPuntoInterrogativo(contenitoreDiPere);
//		contenitoreDiContenitori.aggiungiContenitoreDiPuntoInterrogativo(contenitoreDiMotorini);

		contenitoreDiContenitori.print();

	}

}
