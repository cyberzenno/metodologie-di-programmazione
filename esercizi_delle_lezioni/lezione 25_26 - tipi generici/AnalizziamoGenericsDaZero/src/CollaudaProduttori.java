
public class CollaudaProduttori {
	public static void main(String[] args) {

		//il concetto di produttore come "creatore" di roba,
		//pare che con i generics non sia la strada migliore
		//questo porta un po' di luce sul fatto che 
		// new T() a quanto pare non ha senso ..
		
		Produttore<Frutta> produttoreFrutta = new Produttore<>(Frutta.class);
		Produttore<Mela> produttoreMela = new Produttore<>(Mela.class);

		
		Frutta f = produttoreFrutta.produci();
		Frutta m = produttoreMela.produci();
	
		print(f);
		print(m);

	}

	static void print(Object o) {
		System.out.printf("%s_%s\n", o.getClass().getSimpleName(), o.hashCode() % 100);
	}
}
