package cartedagioco;

import java.util.Random;

public class MazzoDiCarte {
	private Carta[] carte;

	public MazzoDiCarte() {
		carte = generaMazzo();
	}

	public void mischiaMazzo() {

		Random rnd = new Random();

		for (int i = 0; i < carte.length; i++) {
			int r = rnd.nextInt(52);

			Carta t = carte[i];
			carte[i] = carte[r];
			carte[r] = t;
		}
	}

	public void stampaMazzo() {
		for (int i = 0; i < carte.length; i++) {
			System.out.println(carte[i]);
		}
	}

	public Carta daiCarta() {

		if(carte.length == 0)
			return null;
		
		Carta primaCarta = carte[0];

		Carta[] nuoveCarte = new Carta[carte.length - 1];

		for (int i = 1; i < carte.length; i++)
			nuoveCarte[i - 1] = carte[i];

		carte = nuoveCarte;

		return primaCarta;
	}

	public int carteRimaste() {
		return carte.length;
	}
	
	private Carta[] generaMazzo() {
		Carta[] nuovoMazzo = new Carta[52];

		int indiceCarta = 0;
		for (int i = 0; i < 13; i++) {
			nuovoMazzo[indiceCarta++] = new Carta("Cuori", i + 1);
		}

		for (int i = 0; i < 13; i++) {
			nuovoMazzo[indiceCarta++] = new Carta("Quadri", i + 1);
		}

		for (int i = 0; i < 13; i++) {
			nuovoMazzo[indiceCarta++] = new Carta("Fiori", i + 1);
		}

		for (int i = 0; i < 13; i++) {
			nuovoMazzo[indiceCarta++] = new Carta("Picche", i + 1);
		}

		return nuovoMazzo;
	}
}
