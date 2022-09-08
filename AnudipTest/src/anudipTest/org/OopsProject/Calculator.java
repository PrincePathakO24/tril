/* 3.Create a class Calculator with two methods add() and substract() and default and parameterized constructor
 Overload theses methods--
   int add(int,int)
   double add(double,int,int)
   String add(String,String)

  int substract(int,int)
   double substract(double,double)

 @author Prince Pathak

*/



package anudipTest.org.OopsProject;

public class Calculator 
{

	public void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(+c);
		
		
		}
	public void add(double a,int b,int c)	// method			
	{
		double d;
		
		d= a+b+c;						// to Add values
		System.out.println(+d);			// to print
	}
	public void add(String a,String b)	// method		
	{
		String c;
		
		c= a+b;							// to Add values
		System.out.println(c);			// to print
	}
	
	public void Sub(int a ,int b)		// method		
	{
		int c;
		
		c= a-b;							// to substract values
		System.out.println(+c);
	}
public void Sub(double a,double b)		// method		
{
	double c;
	c=a-b;							// to substract values
}
	
	

}
