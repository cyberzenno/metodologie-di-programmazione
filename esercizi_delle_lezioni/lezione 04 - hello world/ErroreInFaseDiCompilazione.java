public class ErroreInFaseDiCompilazione
{
	//questo e' un programma che lancia un errore in fase di compilazione
	public static void main(String[] args)
	{
		
		int a; //variabile dichiarata ma non inizializzata
		
		System.out.print(a);
		
		b = 0; //variabile parzialmente dichiarata: manca il tipo di dato
	}	
} 