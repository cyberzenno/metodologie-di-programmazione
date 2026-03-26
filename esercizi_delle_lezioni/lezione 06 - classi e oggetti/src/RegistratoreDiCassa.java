
public class RegistratoreDiCassa {

	private double totaleDaPagare;
	private double totalePagato;
	private boolean transazioneInCorso;

	public void registraPrezzoArticolo(double prezzoArticolo) {
		totaleDaPagare += prezzoArticolo;
		transazioneInCorso = true;
		this.stampaStato();
	}

	public double concludiTransazione(double denaroPagato) {
		totalePagato += denaroPagato;

		double restoDovuto = totalePagato - totaleDaPagare;
		if (restoDovuto >= 0) {
			transazioneInCorso = false;
			this.stampaStato();

			System.out.println("--> restoDovuto: " + restoDovuto);
		} else {

			this.stampaStato();
		}

		return restoDovuto;
	}

	public void stampaStato() {
		System.out.println("totaleDaPagare: " + totaleDaPagare);
		System.out.println("totalePagato: " + totalePagato);
		System.out.println("transazioneInCorso: " + transazioneInCorso);
		System.out.println("------");
	}

	public static void main(String[] args) {

		RegistratoreDiCassa r1 = new RegistratoreDiCassa();

		r1.registraPrezzoArticolo(10.50);
		r1.registraPrezzoArticolo(4.99);
		r1.registraPrezzoArticolo(8.99);

		r1.concludiTransazione(20.0);
		r1.concludiTransazione(10.0);
	}

}
