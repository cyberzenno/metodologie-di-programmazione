package contobancario;

public class NotificaBonifico extends Operazione {

	private ContoBancario conto;
	private String daIban;

	private double saldoOriginale;
	private double valore;
	private double nuovoSaldo;

	public NotificaBonifico(ContoBancario conto, String daIban, double saldoOriginale, double valore, double nuovoSaldo) {
		this.conto = conto;
		this.daIban = daIban;
		this.saldoOriginale = saldoOriginale;
		this.valore = valore;
		this.nuovoSaldo = nuovoSaldo;
	}

	@Override
	public void esegui() {
		//do nothing
	}

	@Override
	public String toString() {

		String daString = "%-18s %18s: %6.2f -- %6.2f --> %6.2f".formatted(conto.getIban(), getClass().getSimpleName(),
				saldoOriginale, valore, nuovoSaldo);

		return daString + " ==> " + daIban;
	}
}
