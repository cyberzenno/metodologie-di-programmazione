public class AnnoBisestileUnicaEspressione
{
	public static void main(String[] args)
	{
		int anno = Integer.parseInt(args[0]);
		boolean eBisestile = anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0;
		System.out.print("L'anno " + anno + " e' un anno bisestile? " + eBisestile);
	}	
}