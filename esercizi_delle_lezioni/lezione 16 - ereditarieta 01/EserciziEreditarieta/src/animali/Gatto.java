package animali;

public class Gatto extends Felino{

	public Gatto() {
		super(4, Taglia.PICCOLA);
	}

	@Override
	public void emettiVerso() {
		System.out.println("miao miao");
	}

}
