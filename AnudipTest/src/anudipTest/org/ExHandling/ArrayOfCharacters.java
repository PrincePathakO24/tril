package anudipTest.org.ExHandling;
import java.util.*;

public class ArrayOfCharacters     
{
	void countVowels(String str)
		{
			int strLength= str.length();
			char []arr= new char[strLength];
			int i; 
			for(i=0;i<strLength;i++) {
				arr[i]=str.charAt(i);
				
			}
			// TO Showing characters in array format
			System.out.print("The array is: ");
			str=str.toLowerCase();
			for(i=0;i<strLength;i++) 
			{
				System.out.print(" "+ arr[i]+" ");
			}
			System.out.println(" ");
			
			//To Print vowels	
			int count=0;
			System.out.print("The vowels: ");
			
			for(i=0;i<strLength;i++) 
			{
				if(arr[i]=='a'||arr[i]=='e'
						||arr[i]=='i'||arr[i]=='o'||
						arr[i]=='u') 
					str=str.toLowerCase();
				{
					System.out.print(" "+arr[i]+" ");
					count++;	
				}
			
			System.out.println(" ");
			System.out.println("The number of vowels: "+ count);
			
			if (arr[i]=='X') 
			{

				try
				{

				throw new Exception();

				}

				catch (Exception e) 
				{

				System.out.println("Letter x contains Exception");

				}
				
			

			return;
			}
	} }
			
		// Main class
		public static void main(String args[]) 
		{
			
			System.out.println("Enter any string: ");
			Scanner sc= new Scanner(System.in);
			String str= sc.next();
			
			ArrayOfCharacters obj= new ArrayOfCharacters();
			obj.countVowels(str);
			
		}
}
