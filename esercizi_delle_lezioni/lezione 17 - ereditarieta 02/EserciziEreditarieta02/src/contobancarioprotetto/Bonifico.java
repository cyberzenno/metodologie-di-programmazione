package contobancarioprotetto;

public class Bonifico extends Operazione {

	private ContoBancario da;
	private ContoBancario a;

	private double valore;
	private double daSaldoOriginale;
	private double daNuovoSaldo;
	private double aSaldoOriginale;
	private double aNuovoSaldo;

	public Bonifico(ContoBancario da, ContoBancario a, double valore) {
		this.da = da;
		this.a = a;
		this.valore = valore;
	}

	@Override
	public void esegui() {
		daSaldoOriginale = da.getSaldo();
		aSaldoOriginale = a.getSaldo();

		if (daSaldoOriginale - valore >= 0) {
			da.setSaldo(daSaldoOriginale - valore);

			a.setSaldo(aSaldoOriginale + valore);
		}

		daNuovoSaldo = da.getSaldo();
		aNuovoSaldo = a.getSaldo();

		da.aggiungiOperazione(this);
		a.aggiungiOperazione(new NotificaBonifico(a, da.getIban(), aSaldoOriginale, valore, aNuovoSaldo));
	}

	@Override
	public String toString() {

		String daString = "%-18s %18s: %6.2f -- %6.2f --> %6.2f".formatted(da.getIban(), getClass().getSimpleName(),
				daSaldoOriginale, valore, daNuovoSaldo);

		return daString + " ==> " + a.getIban();
	}
}
