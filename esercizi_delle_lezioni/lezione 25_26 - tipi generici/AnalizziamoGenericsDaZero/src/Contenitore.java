
public class Contenitore<TIPO_DA_CONTENERE>{// extends Frutta> {

	private TIPO_DA_CONTENERE contenuto;

	public Contenitore(TIPO_DA_CONTENERE t) {
		this.contenuto = t;
	}

	public TIPO_DA_CONTENERE getContenuto() {
		return contenuto;
	}
	
	public void setContenuto(TIPO_DA_CONTENERE contenuto) {
		this.contenuto = contenuto;
	}

	@Override
	public String toString() {
		return "%s_%s di %s".formatted(getClass().getSimpleName(), this.hashCode() % 100,
				contenuto.getClass().getSimpleName());
	}
	
	public void print() {
		
			System.out.println(contenuto);
		
	}

}
