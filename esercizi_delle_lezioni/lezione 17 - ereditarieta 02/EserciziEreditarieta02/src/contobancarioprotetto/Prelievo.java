package contobancarioprotetto;

public class Prelievo extends Operazione {

	private ContoBancario conto;
	
	private double saldoOriginale;
	private double valore;
	private double nuovoSaldo;

	public Prelievo(ContoBancario conto, double valore) {
		this.conto = conto;
		this.valore = valore;
	}

	@Override
	public void esegui() {

		saldoOriginale = conto.getSaldo();
		nuovoSaldo = saldoOriginale - valore;

		if (nuovoSaldo >= 0)
			conto.setSaldo(nuovoSaldo);
		
		nuovoSaldo = conto.getSaldo();
		
		conto.aggiungiOperazione(this);
	}

	@Override
	public String toString() {
		return "%-18s %18s: %6.2f -- %6.2f --> %6.2f".formatted(conto.getIban(), getClass().getSimpleName(),
				saldoOriginale, valore, nuovoSaldo);
	}
}
