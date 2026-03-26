public class DifferenzaInteraTraInteroEDouble
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		double b = Double.parseDouble(args[1]);
		
		// int c = a - b; 			//error: possible lossy conversion from double to int
		// int c = (a - b); 		//error: **
		// int c = (int)a - b;		//error: **
		// int c = (int)(a - b);		//it works
		int c = a - (int)b;
		
		System.out.print(a + " - " + b + " = " + c);		
	}	
}