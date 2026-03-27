package cartedagioco;

public class CollaudaMazzoDiCarte {

	public static void main(String[] args) {

		MazzoDiCarte mazzo = new MazzoDiCarte();

		mazzo.mischiaMazzo();

		System.out.println("Carte Iniziali: " + mazzo.carteRimaste());

		for (int i = 0; i < 52; i++) {

			Carta carta = mazzo.daiCarta();

			System.out.println("Data carta: " + carta);

			System.out.println("Carte: " + mazzo.carteRimaste());
		}

		System.out.println("Carte finite.");

	}
}
