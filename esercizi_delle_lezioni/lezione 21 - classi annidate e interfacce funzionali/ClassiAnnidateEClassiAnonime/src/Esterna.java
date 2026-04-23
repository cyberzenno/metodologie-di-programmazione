
public class Esterna {

	private String nome;

	public Esterna(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public class Interna {
		private String nome;

		public Interna(String nome) {
			this.nome = nome;
		}

		public String getNome() {
			return this.nome;
		}
	}

	public static Interna creaInterna(String nome) {
		return new Esterna("dummy").new Interna(nome);
	}

	public static class InternaStatica {
		public static void salutaInternamente() {
			System.out.println("saluto internamente.");
		}
	}
}
