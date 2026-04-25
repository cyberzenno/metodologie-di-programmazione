package classiannidate;

public class CollaudaA {

	public static void main(String[] args) {
	
			//come ha detto anche il professore, non mi piace la sintassi e le modalita di accesso
			//ma in tutto sommato, non le dobbiamo usare per forza
			A a = new A();
			System.out.println(a);
			
			A.B ab = new A().new B();
			System.out.println(ab);
			
			A.B.C abc = new A().new B().new C();
			System.out.println(abc);
			
			//da notare che il modificatore "static" per le classi (in JAVA) 
			//si puo applicare SOLO alle classi annidate
			//questo, elimina SOLO la necessita di usare la parola chiave NEW per le classi esterne
			//ma bisgona cmq istanziare la classe "statica" (questo confonde parecchio chi viene da C#)
			A.B.C_Static c = new A.B.C_Static();
			System.out.println(c);		
			
	}	
}
