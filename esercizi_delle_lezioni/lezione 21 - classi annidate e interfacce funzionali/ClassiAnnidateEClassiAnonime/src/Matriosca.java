
public class Matriosca {

	private String nome;

	public Matriosca(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return this.nome;
	}

	public class _Matriosca {

		private String nome;

		public _Matriosca(String nome) {
			this.nome = nome;
		}

		@Override
		public String toString() {
			return "%s --> %s".formatted(Matriosca.this.nome, this.nome);
		}

		public class __Matriosca {

			private String nome;

			public __Matriosca(String nome) {
				this.nome = nome;
			}

			@Override
			public String toString() {
				return "%s --> %s --> %s".formatted(Matriosca.this.nome, __Matriosca.this.nome, this.nome);
			}

		}

	}

	public static void main(String[] args) {
	
			//come ha detto anche il professore, non mi piace la sintassi e le modalita di accesso
			//ma in tutto sommato, non le dobbiamo usare per forza
			Matriosca a = new Matriosca("A");
			System.out.println(a);
			
			Matriosca._Matriosca aa = new Matriosca("A").new _Matriosca("AA");
			System.out.println(aa);
			
			Matriosca._Matriosca.__Matriosca aaa = new Matriosca("A").new _Matriosca("AA").new __Matriosca("AAA");
			System.out.println(aaa);		
	}	
}
