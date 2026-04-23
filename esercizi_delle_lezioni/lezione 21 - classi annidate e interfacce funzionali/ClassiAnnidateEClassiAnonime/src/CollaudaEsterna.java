
public class CollaudaEsterna {
	public static void main(String[] args) {

		Esterna esterna = new Esterna("Esternuccia");

		//vabbe, questo new volante non lo comprendo a pieno
		//ma andiamo avanti.
		Esterna.Interna interna = esterna.new Interna("Internuccia");
		
		System.out.println(esterna.getClass().getName());
		System.out.println(interna.getClass().getName());
		
		var internaCreataInternamente = Esterna.creaInterna("Internucciolevoletta");
		System.out.println(internaCreataInternamente.getClass().getName());
		
		Esterna.InternaStatica.salutaInternamente();
		var x = new Esterna.InternaStatica();
		
		System.out.println(x.getClass().getName());
	}
}
