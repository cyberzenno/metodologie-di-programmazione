package ex_2_ricette_ingredienti;

import ex_2_ricette_ingredienti.Ex2_Ricetta.LivelloDiDifficolta;
import ex_2_ricette_ingredienti.Ex2_Ricetta.Tipologia;

/**
 * Classe di collaudo per l'esercizio delle ricette
 */
public class Ex2_CollaudaRicette {
	public static void main(String[] args) {

		Ex2_Ricette ricette = Ex2_Ricette.getInstance();

		for (Ex2_Ricetta r : creaRicetteDiCollaudo()) {
			ricette.addRicetta(r);
		}

		var mappaTipoRicetta = ricette.getMappaTipologiaRicette();

		mappaTipoRicetta.forEach((k, v) -> {

			System.out.print(k + ": ");
			System.out.println(v.stream().map(x -> x.getNome()).toList());

		});

		var mappaIngredientiQuantita = ricette.getHashMappaIngredientiQuantitaPerTipologiaRicette(Tipologia.VEGANA);

		mappaIngredientiQuantita.forEach((k, v) -> {

			System.out.print(k + ": ");
			System.out.println(v);

		});

	}

	private static Ex2_Ricetta[] creaRicetteDiCollaudo() {

		Ex2_Ricetta r1 = new Ex2_Ricetta.Ex2_RicettaBuilder().setNome("Rossa con carne")
				.setDescrizione("Ricetta rossa: fai questo, fai quello")
				.setTipologia(Tipologia.NON_VEGANA)
				.setLivelloDiDifficolta(LivelloDiDifficolta.FACILE)
				.addIngrediente("Olio", 50)
				.addIngrediente("Pomodoro", 500)
				.addIngrediente("Carne", 200)
				.build();
		
		Ex2_Ricetta r2 = new Ex2_Ricetta.Ex2_RicettaBuilder().setNome("Verde con carne")
				.setDescrizione("Ricetta verde: fai quello, fai questo")
				.setTipologia(Tipologia.NON_VEGANA)
				.setLivelloDiDifficolta(LivelloDiDifficolta.MEDIO)
				.addIngrediente("Olio", 51)
				.addIngrediente("Spinaci", 501)
				.addIngrediente("Carne", 202)
				.build();
		
		Ex2_Ricetta r3 = new Ex2_Ricetta.Ex2_RicettaBuilder().setNome("Rossa vegana")
				.setDescrizione("Ricetta rossa vegana: fai questo, fai quello")
				.setTipologia(Tipologia.VEGANA)
				.setLivelloDiDifficolta(LivelloDiDifficolta.FACILE)
				.addIngrediente("Olio", 52)
				.addIngrediente("Pomodoro", 502)
				.addIngrediente("Tofu", 202)
				.build();
		
		Ex2_Ricetta r4 = new Ex2_Ricetta.Ex2_RicettaBuilder().setNome("Verde vegana")
				.setDescrizione("Ricetta verde vegana: fai quello, fai questo")
				.setTipologia(Tipologia.VEGANA)
				.setLivelloDiDifficolta(LivelloDiDifficolta.MEDIO)
				.addIngrediente("Olio", 53)
				.addIngrediente("Spinaci", 503)
				.addIngrediente("Tofu", 203)
				.build();
		
		return new Ex2_Ricetta[] { r1, r2, r3, r4, r1, r2, r3, r4 };
	}
}
