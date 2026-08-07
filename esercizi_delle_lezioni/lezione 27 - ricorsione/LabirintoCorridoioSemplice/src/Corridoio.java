import java.util.ArrayList;

public class Corridoio {

	private boolean minotauro;
	
	private ArrayList<Corridoio> corridoi;

	public Corridoio() {
		this(false);
	}
	
	public Corridoio(boolean minotauro) {
		this.minotauro = minotauro;
		corridoi = new ArrayList<Corridoio>();
	}

	public ArrayList<Corridoio> getCorridoi() {
		return corridoi;
	}
	
	public void addCorridoio(Corridoio c) {
		this.corridoi.add(c);
	}

	public boolean hasMinotauro() {
		return minotauro;
	}
		
}
