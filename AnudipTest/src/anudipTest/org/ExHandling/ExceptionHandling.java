package anudipTest.org.ExHandling;

import java.util.Scanner;
import java.lang.Exception;

public class ExceptionHandling {

	public static void main(String args[])
	{
		// Take a value by user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First No :");
		String str1=sc.nextLine();
		System.out.println("Enter the Second No :");
		String str2=sc.nextLine();

		try
		{
		int a=Integer.parseInt(str1); // value
		int b=Integer.parseInt(str2);  // value
		int c=a/b;
		System.out.println("The value of divide by a & b: "+c);
			
	}
	
		catch(NumberFormatException ex)
		{
			System.out.println("format mismatch : ");
		}
		catch(Exception e)
		{
			System.out.println("Divided by zero is invalid division : "+e);
		}
		
		finally
		{
			System.out.println(" Exception encountered ");
		}
		System.out.println(" Exception Handling Completed ");
		
	}
}

