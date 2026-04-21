
public class Aquila extends Animale implements Volante, Camminante {

	@Override
	public void emettiVerso() {
		System.out.println("Kiiiii...");
	}

	@Override
	public void vola() {
		System.out.println("Flap, flap, flap...");
	}

	@Override
	public void cammina() {
		System.out.println("tip, tip, tip...");
	}
}
