package campominato;

public class CollaudaCampoMinato {

	public static void main(String[] args) {
		CampoMinato c = new CampoMinato(5, 5, 10);
		
		c.scopri(0, 0);
		
		System.out.print(c);
	}
}
