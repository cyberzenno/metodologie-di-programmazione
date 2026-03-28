package animali;

public class Tigre extends Felino{

	public Tigre() {
		super(4, Taglia.GRANDE);
	}

	@Override
	public void emettiVerso() {
		System.out.println("roar roar");		
	}

}
