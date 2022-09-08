package anudipTest.org.OopsProject;

public class Rectangle extends Square implements Shape
{
public int width=3;
	
	@Override
	public int area() 	// method		
	{
		int ar=length*width; 	// area of Rectangle formula 
		return ar;				// to return value
	}
	
	
}
