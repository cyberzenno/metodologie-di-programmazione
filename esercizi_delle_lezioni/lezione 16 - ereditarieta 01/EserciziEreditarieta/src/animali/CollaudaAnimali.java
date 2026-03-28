package animali;

public class CollaudaAnimali {

	public static void main(String[] args) {

		Animale gatto = new Gatto();
		Animale tigre = new Tigre();
		
		gatto.emettiVerso();
		gatto.stampaBestia();
		
		tigre.emettiVerso();
		tigre.stampaBestia();
	}

}
