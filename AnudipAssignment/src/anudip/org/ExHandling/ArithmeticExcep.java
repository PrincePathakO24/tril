4
public class ArithmeticExcep
{
	int a=15;
	int b=0;
	{
		try
		{
			int c;
			c= a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException"+ e);
			
		}
	}
	
	  
	
}
