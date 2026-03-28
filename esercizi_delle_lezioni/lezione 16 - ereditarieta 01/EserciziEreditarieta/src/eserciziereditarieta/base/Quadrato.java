package eserciziereditarieta.base;

public class Quadrato extends Forma{

	public Quadrato()
	{
		super("Quadrato");
	}
	
	@Override
	public void stampa() {
		
		System.out.println("*******");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*******");
		
	}
}
