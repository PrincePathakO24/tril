package anudip.org.ExHandling;

public class ArithmeticException 
{
	int a=15;
	int b=0;
	{
		try
		{
			c= a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException"+ e);
			
		}
	}
	
	
	
}
