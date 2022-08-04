package org.anudip.Inheritance;

public class Shape 
{
	void shape()
	{
		System.out.println("this is a Shape");
	}
}	
	
class Rectangle extends Shape 
{
	void rectangle()
	{
		System.out.println("this is a Rectangle");
	}
}	

class Circle extends Shape 
{
	void circle()
	{
		System.out.println("this is a Circle");
	}
}	

class Square extends Shape 
{
	void square()
	{
		System.out.println("this is a Squre");
	}

	public void rectangle() 
	{
		System.out.println("this is a Rectangle");
		
	}

	public void circle() 
	{
		System.out.println("this is a Circle");
		
	}


	public static void main(String[] args) 	
	{
	Square sq =new Square();		// make an object
	sq.shape(); 				    //call a function
	sq.rectangle();			    	// call a function
	

	}
}
