package ex_2_ricette_ingredienti;

import ex_2_ricette_ingredienti.Ex2_Ricetta.LivelloDiDifficolta;
import ex_2_ricette_ingredienti.Ex2_Ricetta.Tipologia;

public class Ex2_CollaudaRicette {
	public static void main(String[] args) {

		//disclaimer gastronomico: 
		//ingredienti e quantita' sono puramente indicativi per lo scopo dell'esercizio
		//e non intende in alcun modo rappresentare le qualita' culinarie dell'autore
		
		Ex2_Ricetta amatriciana =
		        new Ex2_Ricetta.Ex2_RicettaBuilder()
		                .setNome("Rigatoni all'amatriciana")
		                .setDescrizione("Deliziosa ricetta romana per quattro persone.")
		                .setTipologia(Tipologia.NON_VEGANA)
		                .setLivelloDiDifficolta(LivelloDiDifficolta.FACILE)
		                .addIngrediente("Rigatoni", 500)
		                .addIngrediente("Guanciale", 200)
		                .addIngrediente("Pomodoro", 800)
		                .addIngrediente("Pecorino", 150)
		                .addIngrediente("Olio extravergine d'oliva", 20)
		                .addIngrediente("Pepe nero", 5)
		                .build();
		
		Ex2_Ricetta amatricianaVegana =
		        new Ex2_Ricetta.Ex2_RicettaBuilder()
		                .setNome("Rigatoni all'amatriciana vegana")
		                .setDescrizione("Versione vegana della classica amatriciana.")
		                .setTipologia(Tipologia.VEGANA)
		                .setLivelloDiDifficolta(LivelloDiDifficolta.MEDIO)
		                .addIngrediente("Rigatoni", 500)
		                .addIngrediente("Tofu affumicato", 200)
		                .addIngrediente("Pomodoro DOP", 400)
		                .addIngrediente("Formaggio di soia", 30)
		                .addIngrediente("Olio extravergine d'oliva", 20)
		                .addIngrediente("Pepe nero", 5)
		                .build();
		
		
		Ex2_Ricette ricette = Ex2_Ricette.getInstance();
		
		ricette.addRicetta(amatriciana);
		ricette.addRicetta(amatricianaVegana);
		
		

	}
}
