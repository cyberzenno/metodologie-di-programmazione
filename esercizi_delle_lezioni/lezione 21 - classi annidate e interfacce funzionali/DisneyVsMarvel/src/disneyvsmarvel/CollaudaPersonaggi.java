package disneyvsmarvel;

import java.util.*;

import disneyvsmarvel.disney.*;
import disneyvsmarvel.marvel.*;

public class CollaudaPersonaggi {

	final static Random r = new Random();

	public static void main(String[] args) {

		ArrayList<Personaggio> squadraDisney = new ArrayList<>(List.of(new Paperino(), new Pippo(), new Ciccio()));
		ArrayList<Personaggio> squadraMarvel = new ArrayList<>(List.of(new PeterParker(), new LaCosa(), new Magneto()));

		// ogni personaggio di entrambe le squadre
		// fa N incontri casuali con l'altra squadra
		final int numeroDiIncontri = 2;

		for (Personaggio p : squadraDisney) {
			line();

			Supereroe s = p.getSupereroe();

			combattiEnneRound(numeroDiIncontri, s, squadraMarvel);

			((Personaggio) s).getPersonaggio();
			
			line();
		}

		for (Personaggio p : squadraMarvel) {
			line();

			Supereroe s = p.getSupereroe();

			combattiEnneRound(numeroDiIncontri, s, squadraDisney);
			
			((Personaggio) s).getPersonaggio();
			
			line();
		}

	}

	private static void combattiEnneRound(int nRound, Supereroe sa, List<Personaggio> squadraAvversaria) {
		
		for (int i = 0; i < nRound; i++) {

			Personaggio p = squadraAvversaria.get(r.nextInt(squadraAvversaria.size()));

			Supereroe sb = p.hasDoppiaVita() ? p.getDoppiaVita().assumiIdentitaSegreta() : p.getSupereroe();

			System.out.printf("%s VS %s: FIGHT!\n\n", sa, sb);

			sa.attacca(sb);
			sb.attacca(sa);

			System.out.printf("TIME OUT!\n\n");
		}

	}
	
	private static void line() {
		System.out.printf("------------------------------------\n");
	}
}
