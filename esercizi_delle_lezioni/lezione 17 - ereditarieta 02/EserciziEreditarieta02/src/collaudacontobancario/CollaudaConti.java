package collaudacontobancario;

import contobancario.*;

public class CollaudaConti {

	public static void main(String[] args) {
		//qui non abbiamo visibilita su
		//getSaldo() e setSaldo()
		
		ContoBancario p = new ContoBancario("IBAN_PIPPO");
		ContoBancario t = new ContoBancario("IBAN_TOPOLINO");
		
		Operazione[] op = {
			new Versamento(p, 100),
			new Versamento(p, 200),
			new Versamento(p, 300),
			new Prelievo(p, 400),
			new Bonifico(p, t, 150),
			new Versamento(t, 800),
			new SituazioneConto(p),
			new SituazioneConto(t),
		};
		
		for (Operazione o : op) {
			o.esegui();
		}
					
		p.stampaOperazioni();
		
		System.out.println();
		
		t.stampaOperazioni();
		
		
		//utilizzando l'approccio "conto centrico"
		//la parte pratica del conto sarebbe decisamente piu comoda
		
		//p.versamento(100);
		//p.versamento(200);
		//p.versamento(300);
		//p.prelievo(450);
		//p.bonifico(t, 150);
		//t.versamento(800);
		//p.stampaOperazioni();
		//t.stampaOperazioni();
}

}
