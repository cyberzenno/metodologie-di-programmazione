package contobancario;

import java.util.Arrays;

public class ContoBancario {

	private String iban;
	private double saldo;
	private Operazione[] operazioni;

	public ContoBancario(String iban) {
		this.iban = iban;
		this.operazioni = new Operazione[0];
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

	protected void aggiungiOperazione(Operazione operazione) {
		operazioni = Arrays.copyOf(operazioni, operazioni.length + 1);
		operazioni[operazioni.length - 1] = operazione;
	}
	
	public String getIban() {
		return iban;
	}

	public  Operazione[] getOperazioni() {
		return operazioni;
	}	
	
	public void stampaOperazioni()
	{
		for (Operazione o : getOperazioni()) {
			System.out.println(o);
		}
	}
}
