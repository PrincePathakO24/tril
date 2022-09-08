package anudipTest.org.OopsProject;

public class ShapeMain 
{

	public static void main(String args[])
	{
		Square obj=new Square();		// Square class object
		obj.area();						// to call method 
		System.out.println("The area of the square is : "+obj.area()); 		//to Print
		
		Rectangle obj2=new Rectangle();		// Rectangle class object
		obj2.area();						// to call method 
		System.out.println("The area of the rectangle is : "+obj2.area());	//to Print
	}
}