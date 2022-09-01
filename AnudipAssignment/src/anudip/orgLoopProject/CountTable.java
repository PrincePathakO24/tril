package anudip.orgLoopProject;
import java.util.*;

public class CountTable 
{
	void display() 	// method
	{
		
		Scanner s= new Scanner(System.in);   // for input
		System.out.println("Enter your NO for table : ");	// display for user
		int table = s.nextInt();						// take input
		 
		for(int i = 1; i<=10;i++ ) 	// loop for table
		{
			System.out.println(table+ " x " +i+" = " + table*i);  // to print
		}
		
	}
	
	public static void main(String[] args)
	{
		CountTable obj= new CountTable (); // object of class
		obj.display();	// to call method
	}
}
