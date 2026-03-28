package formebase;

public class Triangolo extends Forma{
	public Triangolo()
	{
		super("Triangolo");
	}
	@Override
	public void stampa() {
		
		System.out.println("   *   ");
		System.out.println("  ***  ");
		System.out.println(" ***** ");
		System.out.println("*******");
		
	}
}
