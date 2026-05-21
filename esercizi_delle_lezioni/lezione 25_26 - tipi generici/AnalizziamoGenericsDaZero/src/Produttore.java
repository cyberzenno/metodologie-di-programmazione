
public class Produttore<T> {

	Class<T> classe;

	public Produttore(Class<T> classe) {
		this.classe = classe;
	}


	public T produci() {
		switch (classe.getSimpleName()) {
		case "Frutta":
			return (T) new Frutta();
		case "Mela":
			return (T) new Mela();
		case "Pera":
			return (T) new Pera();
		case "Motorino":
			return (T) new Motorino();
		}

		return null;
	}
}
