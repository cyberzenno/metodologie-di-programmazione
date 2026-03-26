public class CasisticheVarie
{
	public static void main(String[] args)
	{
		int a = 5;
		double b = 10;
		int differenzaIntera = (int)(a - b);
		print("differenzaIntera", differenzaIntera);
		
		int divisioneIntera = a/(int)b;
		print("divisioneIntera", divisioneIntera);
		
		int divisionePoiSomma5 = a/(int)b + 5;
		print("divisionePoiSomma5", divisionePoiSomma5);
	}	
	
	private static void print(String message, Object val)
	{
		System.out.println(message + ": " + val);
	}
}