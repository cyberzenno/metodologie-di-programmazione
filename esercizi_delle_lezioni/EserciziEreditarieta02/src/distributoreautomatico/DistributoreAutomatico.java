package distributoreautomatico;

import java.util.Random;

public class DistributoreAutomatico {
	private Prodotto[] prodotti;
	private double saldo;

	private static final int TIPI_DI_PRODOTTO_POSSIBILI = 3;

	public void carica(int n) {
		Random r = new Random();

		prodotti = new Prodotto[n];

		for (int i = 0; i < n; i++) {

			int rid = r.nextInt(0, TIPI_DI_PRODOTTO_POSSIBILI);

			prodotti[i] = switch (rid) {
			case 0 -> new Acqua(i, 1.5);
			case 1 -> new Cioccolato(i, 5);
			case 2 -> new GommeDaMasticare(i, 3);

			default -> throw new IllegalArgumentException("Unexpected value: " + rid);
			};
		}
	}

	public void inserisciImporto(double importo) {
		saldo += importo;
	}

	public Prodotto getProdotto(int id) {
		// assumiamo per brevita' che l'id corrisponde alla posizione nell'array
		Prodotto p = prodotti[id];

		if (p != null && p.getPrezzo() <= saldo) {
			saldo -= p.getPrezzo();
			prodotti[id] = null;
			return p;
		}

		return null;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getResto() {
		double resto = saldo;
		saldo = 0;
		return resto;
	}
	
	public int prodottiRimasti() {
		int p = 0;
		for (int i = 0; i < prodotti.length; i++) {
			p += prodotti[i] != null ? 1 : 0;
		}
		return p;
	}
	
	public boolean erogazioneAbilitata() {
		return prodottiRimasti() > 0 && getSaldo() >= prezzoMinimoRimasto();
	}


	private double prezzoMinimoRimasto() {
		double min = 0;

		for (Prodotto p : prodotti) {
			if (p == null)
				continue;

			min = min == 0 ? p.getPrezzo() : Math.min(min, p.getPrezzo());
		}

		return min;
	}


	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("-".repeat(20) + "\n");

		sb.append("Saldo: €%.2f\n".formatted(saldo));

		for (int i = 0; i < prodotti.length; i++) {
			Prodotto p = prodotti[i];
			if (p != null)
				sb.append("%s\n".formatted(p));
			else
				sb.append("%s:\n".formatted(i));
		}

		sb.append("-".repeat(20) + "\n");

		return sb.toString();

	}

}
