package anudipTest.org.OopsProject;

public class Square  implements Shape
{
	public int length=5;
	@Override
	public int area() 		// method
	{		
		int ar=length*length;	// area of Square formula
		return ar;				// to return value
	}
	
	
	
}
