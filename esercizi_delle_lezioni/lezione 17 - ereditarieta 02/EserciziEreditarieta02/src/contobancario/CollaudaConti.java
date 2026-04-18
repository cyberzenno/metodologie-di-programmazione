package contobancario;

import contobancarioprotetto.ContoBancario;

public class CollaudaConti {

	public static void main(String[] args) {
		//qui non abbiamo visibilita su
		//getSaldo() e setSaldo()
		
		ContoBancario p = new ContoBancario("IBAN_PIPPO");
		
		p.versamento(100);
		p.versamento(200);
		p.versamento(300);
		p.prelievo(450);
		
		ContoBancario t = new ContoBancario("IBAN_TOPOLINO");
		p.bonifico(t, 150);
		
		t.versamento(800);
				
		p.stampaOperazioni();
		
		t.stampaOperazioni();
	}

}
