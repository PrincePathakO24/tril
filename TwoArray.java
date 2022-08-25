package Anudip.StringArray;

import java.util.Arrays;

public class TwoArray
{
	void values()
	{
		int[] arr={15,  9, 14, 10, 12};			// Array given in Q
	    String[] str={"Peter", "Amy", "John", "Boyd", "Cathy"};		// String given in Q
		
		Arrays.sort(str); // Sorting for String
	  
	    Arrays.sort(arr);   //sorting for Array
			     
	    System.out.println("Name     Value");   // To Print
		
		for(int i=0;i<arr.length || i<str.length ;i++)
			 {
			   System.out.println(str[i]+"     "+arr[i]);
			 }	
	}
	public static void main(String args[])
	{
		TwoArray obj=new TwoArray();
		obj.values();
	}
}