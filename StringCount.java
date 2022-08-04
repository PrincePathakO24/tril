package org.anudip.String;
public class StringCount 
{

	public static void main(String[] args) 
	{
		String s= "Prince Pathak";
		int count= 0;
		
		for (int i=0; i<=s.length();i++)
		{
			if (s.charAt(i)!=' ') // to ignore spaces
			{
				count++;
			}
		}
		System.out.println("Count of char. in String "+count);

	}

}
