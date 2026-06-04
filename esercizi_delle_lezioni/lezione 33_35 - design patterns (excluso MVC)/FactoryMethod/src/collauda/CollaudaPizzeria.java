package collauda;

import java.util.Scanner;

import factorymethod_pizzeria.*;

public class CollaudaPizzeria {
	public static void main(String[] args) {

		stampa("Ciao! Questo e' un simulatore di Pizzerie," + "usando il Factory Method e Abstract Factory Pattern.\n"
				+ "Lasciate ogni speranza voi che entrate, cercando di capire la differenza tra i due.\n");

		String tipoDiPizzeria = "";
		while (!tipoDiPizzeria.equals("x")) {
			tipoDiPizzeria = prompt("Che tipo di pizzeria vuoi? Normale, Vegana, Gourmet? n, v, g (x to exit)");
			if(tipoDiPizzeria.equals("x")) break;
			
			Pizzeria pizzeria = Pizzeria.parse(tipoDiPizzeria);

			String tipoDiPizza = "";
			while (!tipoDiPizza.equals("x")) {

				tipoDiPizza = prompt("Che tipo di pizza vuoi? Margherita, Boscaiola o Capricciosa? m, b, c (x to exit)");
				if(tipoDiPizza.equals("x")) break;
				
				var actualTipoDiPizza = Pizza.parse(tipoDiPizza);
				
				var pizzaAlPiatto = pizzeria.ordinaPizzaAlTavolo(actualTipoDiPizza);
				stampa(pizzaAlPiatto);

				var pizzaAllaScatola = pizzeria.ordinaPizzaAPortareVia(actualTipoDiPizza);
				stampa(pizzaAllaScatola);

				var pizzaSurgelataSalvaFreschezza = pizzeria.ordinaPizzaSurgelataCruda(actualTipoDiPizza);
				stampa(pizzaSurgelataSalvaFreschezza);

				var pizzaSurgelataCotta = pizzeria.ordinaPizzaSurgelataCotta(actualTipoDiPizza);
				stampa(pizzaSurgelataCotta);
			}
		}
		
		stampa("Grazie per aver giocato. Ora sono sicuro che il Factory Method e' molto piu' chiaro!");

	}

	private static void stampa(Object x) {
		System.out.println(x);
	}

	private static Scanner scanner = new Scanner(System.in);

	private static String prompt(String message) {
		stampa(message);

		return scanner.nextLine().toLowerCase();
	}
	
	private static String promptTipoDiPizzeria(String message) {
		stampa(message);

		return scanner.nextLine().toLowerCase();
	}

}
