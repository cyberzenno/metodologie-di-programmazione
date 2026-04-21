
public class CollaudaAnimali {

	public static void main(String[] args) {

		Aquila a = new Aquila();
		Cornacchia c = new Cornacchia();
		Leone l = new Leone();

		Animale[] animali = { a, c, l };
		Volante[] volanti = { a, c };

		for (Animale x: animali) {
			x.emettiVerso();
		}
		
		for (Volante v : volanti) {
			v.vola();
		}
	}
}
