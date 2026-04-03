package esercizisugliarray;

import java.util.Arrays;

public class Filtro {
	int[] originale;

	public Filtro(int... originale) {
		this.originale = originale;
	}

	public int[] passaBasso(int k) {
		return filtroInterno(originale, k, "minoreUguale");
	}

	public int[] passaAlto(int k) {
		return filtroInterno(originale, k, "maggioreUguale");
	}

	public int[] filtra(int k) {
		return filtroInterno(originale, k, "nonUguale");
	}

	public int[] filtra(int... lista) {
		int[] filtrato = originale;
		for (int i = 0; i < lista.length; i++) {
			int k = lista[i];
			filtrato = filtroInterno(filtrato, k, "nonUguale");
		}

		return filtrato;

	}

	/**
	 * metodo interno per filtro generico
	 * 
	 * @param k
	 * @param tipologia
	 * @return
	 */
	private static int[] filtroInterno(int[] filtraQuesto, int k, String tipologia) {

		// 1. conta occorrenze
		int occorrenze = 0;
		for (int i = 0; i < filtraQuesto.length; i++) {
			switch (tipologia) {
			case "maggioreUguale" -> occorrenze += filtraQuesto[i] >= k ? 1 : 0;
			case "minoreUguale" -> occorrenze += filtraQuesto[i] <= k ? 1 : 0;
			case "nonUguale" -> occorrenze += filtraQuesto[i] != k ? 1 : 0;

			default -> throw new IllegalArgumentException(tipologia);
			}
		}

		// 2. filtro effettivo
		int[] filtrato = new int[occorrenze];

		for (int i = 0, j = 0; i < filtraQuesto.length; i++) {
			switch (tipologia) {
			case "maggioreUguale" -> {
				if (filtraQuesto[i] >= k)
					filtrato[j++] = filtraQuesto[i];
			}
			case "minoreUguale" -> {
				if (filtraQuesto[i] <= k)
					filtrato[j++] = filtraQuesto[i];
			}
			case "nonUguale" -> {
				if (filtraQuesto[i] != k)
					filtrato[j++] = filtraQuesto[i];
			}

			default -> throw new IllegalArgumentException("");
			}
		}

		return filtrato;
	}

	private static void stampa(int[] a) {
		String arrayComeStringa = Arrays.toString(a);
		System.out.println(arrayComeStringa);
	}

	public static void main(String[] args) {
		Filtro f = new Filtro(1, 2, 10, 2, 42, 7, 8);

		stampa(f.passaBasso(8));
		stampa(f.passaAlto(9));
		stampa(f.filtra(2));
		stampa(f.filtra(2, 7, 42));		
	}
}
