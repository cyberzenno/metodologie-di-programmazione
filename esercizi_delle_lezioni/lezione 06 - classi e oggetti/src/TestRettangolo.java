
public class TestRettangolo {

	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(0, 0, 20, 10);

		r1.trasla(10, 5);

		String expected = "(10,5)->(30,15)";
		String actual = r1.toString();

		System.out.println("expected: " + expected);
		System.out.println("actual: " + actual);
		
		System.out.println(expected.equals(actual));
		
		r1.impostaColore(1, 2, 3);
		r1.stampaColore();		
	}

}
