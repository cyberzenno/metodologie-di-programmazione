package esercizisullematrici;

public class Tris {

	public static void main(String[] args) {
		
		ScacchieraTris tris = new ScacchieraTris();
		
		tris.occupaCasellaX(0, 0);
		
		tris.occupaCasellaO(1, 1);
		
		tris.occupaCasellaX(2, 2);
		
		tris.occupaCasellaO(0, 2);
		
		tris.occupaCasellaX(2, 0);

		tris.stampa();
		
		System.out.println("--------");
		
		tris.occupaCasellaO(1, 0);

		tris.occupaCasellaX(2, 1);
		
		tris.stampa();
	}
}
