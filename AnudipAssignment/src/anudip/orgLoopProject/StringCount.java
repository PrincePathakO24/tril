package anudip.orgLoopProject;
import java.util.*;

public class StringCount 
{
	void display()
	{
		int count = 0;
		Scanner s= new Scanner(System.in);			// for input
		System.out.println("Enter a String : ");	// for user
		String sc = s.nextLine();					// take input
		for (int i=0; i<sc.length();i++)			// loop
		{
			if (sc.charAt(i)!=' ') // to ignore spaces
			{
				count++;			// increment
			}
		}
		System.out.println("Count of char. in String "+count); // to print
		
	}	
		
	public static void main(String[] args)
	{
		StringCount obj= new StringCount (); // object of class
		obj.display();						// to call method
	}
}

