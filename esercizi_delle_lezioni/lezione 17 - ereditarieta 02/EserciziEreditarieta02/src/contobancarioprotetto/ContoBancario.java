package contobancarioprotetto;

import java.util.Arrays;

public class ContoBancario {

	private String iban;
	private double saldo;
	private Operazione[] storicoOperazioni;

	public ContoBancario(String iban) {
		this.iban = iban;
		this.storicoOperazioni = new Operazione[0];
	}

	/**
	 * questa roba dovrebbe essere accessibile SOLO alle operazioni. come si fa?
	 */
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * questa roba dovrebbe essere accessibile SOLO alle operazioni. come si fa?
	 */
	protected double getSaldo() {
		return saldo;
	}

	public void versamento(double denaro) {
		Operazione operazione = new Versamento(this, denaro);
		operazione.esegui();
	}

	public void prelievo(double denaro) {
		Operazione operazione = new Prelievo(this, denaro);
		operazione.esegui();
	}

	public void bonifico(ContoBancario t, int denaro) {
		Operazione operazione = new Bonifico(this, t, denaro);
		operazione.esegui();
	}

	public void stampaOperazioni() {
		for (Operazione operazione : storicoOperazioni) {
			System.out.println(operazione);
		}
	}

	protected void aggiungiOperazione(Operazione operazione) {
		storicoOperazioni = Arrays.copyOf(storicoOperazioni, storicoOperazioni.length + 1);
		storicoOperazioni[storicoOperazioni.length - 1] = operazione;
	}

	public String getIban() {
		return iban;
	}

}
