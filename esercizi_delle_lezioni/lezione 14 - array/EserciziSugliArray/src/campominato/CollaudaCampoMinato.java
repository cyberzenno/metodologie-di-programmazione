package campominato;

/**
 * La base dell'esercizio funziona, ma nell'insieme non mi e' piaciuto troppo.<br>
 * Toglie troppo tempo allo studente, che ancora non ha strumenti come <br>
 * Liste e Filtri (non quelli implementati a mano), che gli farebbero risparmiare ore e ore di tentativi.<br>
 * La ricorsione qui e' basilare e quindi andrebbe anche bene, ma avendo gli strumenti detti sopra.
 */
public class CollaudaCampoMinato {

	public static void main(String[] args) {
		CampoMinato c = new CampoMinato(5, 5, 5);
		
		c.scopri(0, 0);
		
		System.out.print(c);
	}
}
