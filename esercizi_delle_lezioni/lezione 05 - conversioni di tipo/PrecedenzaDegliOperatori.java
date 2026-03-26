import java.util.*;

//Nota: questo esercizio non e' esplicitamente richiesto nella lezione, ma e' interessante provare a fare i calcoli a penna e poi far girare il programma per vedere i risultati
public class PrecedenzaDegliOperatori {
    public static void main(String[] args) {
      
      
        // =======================
        // Livello 1 — Base
        // =======================

        System.out.println("----- Livello 1: Base -----");

        System.out.println("5 + 3 = " + (5 + 3));
        System.out.println("10 - 7 = " + (10 - 7));
        System.out.println("4 * 6 = " + (4 * 6));
        System.out.println("20 / 5 = " + (20 / 5));
        System.out.println("17 % 5 = " + (17 % 5));

        System.out.println();


        // =======================
        // Livello 2 — Due operatori
        // =======================

        System.out.println("----- Livello 2: Due operatori -----");

        System.out.println("8 + 3 * 2 = " + (8 + 3 * 2));
        System.out.println("10 - 4 * 2 = " + (10 - 4 * 2));
        System.out.println("18 / 3 + 4 = " + (18 / 3 + 4));
        System.out.println("15 % 4 + 6 = " + (15 % 4 + 6));
        System.out.println("7 + 9 / 3 = " + (7 + 9 / 3));

        System.out.println();


        // =======================
        // Livello 3 — Precedenza operatori
        // =======================

        System.out.println("----- Livello 3: Precedenza operatori -----");

        System.out.println("5 + 6 * 2 - 3 = " + (5 + 6 * 2 - 3));
        System.out.println("12 / 3 + 4 * 2 = " + (12 / 3 + 4 * 2));
        System.out.println("20 - 6 / 3 * 2 = " + (20 - 6 / 3 * 2));
        System.out.println("18 % 5 + 7 * 2 = " + (18 % 5 + 7 * 2));
        System.out.println("30 / 5 + 8 - 3 = " + (30 / 5 + 8 - 3));

        System.out.println();


        // =======================
        // Livello 4 — Divisione intera e resto
        // =======================

        System.out.println("----- Livello 4: Divisione intera e resto -----");

        System.out.println("7 / 2 = " + (7 / 2));
        System.out.println("7 % 2 = " + (7 % 2));
        System.out.println("9 / 4 + 3 = " + (9 / 4 + 3));
        System.out.println("11 % 4 + 2 * 3 = " + (11 % 4 + 2 * 3));
        System.out.println("15 / 4 * 2 = " + (15 / 4 * 2));

        System.out.println();


        // =======================
        // Livello 5 — Più operatori
        // =======================

        System.out.println("----- Livello 5: Più operatori -----");

        System.out.println("5 + 3 * 4 - 6 / 2 = " + (5 + 3 * 4 - 6 / 2));
        System.out.println("18 / 3 + 7 * 2 - 5 = " + (18 / 3 + 7 * 2 - 5));
        System.out.println("20 % 6 + 8 * 3 = " + (20 % 6 + 8 * 3));
        System.out.println("30 / 4 + 5 * 2 = " + (30 / 4 + 5 * 2));
        System.out.println("25 - 8 % 3 * 4 = " + (25 - 8 % 3 * 4));

        System.out.println();


        // =======================
        // Livello 6 — Con parentesi
        // =======================

        System.out.println("----- Livello 6: Parentesi -----");

        System.out.println("(5 + 3) * 4 = " + ((5 + 3) * 4));
        System.out.println("18 / (3 + 3) = " + (18 / (3 + 3)));
        System.out.println("(10 - 4) * (6 / 2) = " + ((10 - 4) * (6 / 2)));
        System.out.println("(20 % 6) * 3 + 4 = " + ((20 % 6) * 3 + 4));
        System.out.println("30 / (4 + 1) * 2 = " + (30 / (4 + 1) * 2));

        System.out.println();


        // =======================
        // Livello 7 — Più complessi
        // =======================

       System.out.println("----- Livello 7: Più complessi -----");

       System.out.println("5 + (3 * 4 - 6) / 2 = " + (5 + (3 * 4 - 6) / 2));
       System.out.println("(18 / 3 + 7) * 2 - 5 = " + ((18 / 3 + 7) * 2 - 5));
       System.out.println("20 % (6 + 2) * 3 = " + (20 % (6 + 2) * 3));
       System.out.println("30 / (4 + 1) * (2 + 3) = " + (30 / (4 + 1) * (2 + 3)));
       System.out.println("25 - (8 % 3 * 4) + 6 = " + (25 - (8 % 3 * 4) + 6));
       
       
		// =======================
		// Livello 8 — Più complessi
		// =======================

		System.out.println("----- Livello 8: Più complessi -----");

		System.out.println("5 + 3 * 4 - 6 / 2 = " + (5 + 3 * 4 - 6 / 2));
		System.out.println("18 / 3 + 7 * 2 - 5 = " + (18 / 3 + 7 * 2 - 5));
		System.out.println("20 % 6 + 2 * 3 = " + (20 % 6 + 2 * 3));
		System.out.println("30 / 4 + 1 * 2 + 3 = " + (30 / 4 + 1 * 2 + 3));
		System.out.println("25 - 8 % 3 * 4 + 6 = " + (25 - 8 % 3 * 4 + 6));


		// =======================
		// Livello finale — Senza parentesi
		// =======================

		System.out.println("8 + 6 * 3 - 4 / 2 + 9 % 5 * 7 - 1 = " + (8 + 6 * 3 - 4 / 2 + 9 % 5 * 7 - 1));
		System.out.println("12 - 5 * 2 + 18 / 3 + 7 % 4 * 6 - 9 = " + (12 - 5 * 2 + 18 / 3 + 7 % 4 * 6 - 9));
		System.out.println("15 + 4 * 7 - 20 / 5 + 11 % 3 * 8 - 6 = " + (15 + 4 * 7 - 20 / 5 + 11 % 3 * 8 - 6));
		System.out.println("21 - 8 * 2 + 16 / 4 + 10 % 3 * 9 - 7 = " + (21 - 8 * 2 + 16 / 4 + 10 % 3 * 9 - 7));
		System.out.println("14 + 9 * 3 - 12 / 4 + 13 % 5 * 6 - 2 = " + (14 + 9 * 3 - 12 / 4 + 13 % 5 * 6 - 2));

    }
}