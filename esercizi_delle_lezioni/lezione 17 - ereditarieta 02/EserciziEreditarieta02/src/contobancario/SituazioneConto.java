package contobancario;

public class SituazioneConto extends Operazione {

	private ContoBancario conto;
	private double saldo;

	public SituazioneConto(ContoBancario conto) {
		this.conto = conto;
	}

	@Override
	public void esegui() {

		saldo = conto.getSaldo();

		System.out.printf("Il saldo dell'IBAN %s e' di %.2f\n", conto.getIban(), saldo);

		conto.aggiungiOperazione(this);

	}

	@Override
	public String toString() {

		return "%-18s %18s: %6.2f".formatted(conto.getIban(), getClass().getSimpleName(), saldo);
	}

}
