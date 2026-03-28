package chiamatecostruttori;

public class CollaudaCostruttori {

	public static void main(String[] args) {
		
		A a = new A();
		
		line();
		
		B b = new B();
		
		line();
		
		C c = new C();
		
		line();
		line();
		
		AA aa = new AA("AA");
		line();
		
		BB bb = new BB();
		line();
		
		
		line();
	}
	
	private static void line() {
		System.out.println("----------------------");
	}
}
