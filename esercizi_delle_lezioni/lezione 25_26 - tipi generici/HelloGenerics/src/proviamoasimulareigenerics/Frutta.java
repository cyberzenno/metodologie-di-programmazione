package proviamoasimulareigenerics;

public class Frutta {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "%s_%s".formatted(this.getClass().getSimpleName(), this.hashCode() % 100);
	}
}
