package classiannidate;

public class A {

	private String nome;

	public A() {
		this.nome = "A";
	}

	@Override
	public String toString() {
		return this.nome;
	}

	public class B {

		private String nome;

		public B() {
			this.nome = "B";
		}

		@Override
		public String toString() {
			return "%s <-- %s".formatted(A.this.nome, this.nome);
		}

		public class C {

			private String nome;

			public C() {
				this.nome = "C";
			}

			@Override
			public String toString() {
				return "%s <-- %s <-- %s".formatted(A.this.nome, B.this.nome, C.this.nome);
			}
		}
		
		public static class C_Static{

			private String nome;

			public C_Static() {
				this.nome = "C_Static";
			}
			
			@Override
			public String toString() {
				return this.nome;
			}
			
		}
	}
}
