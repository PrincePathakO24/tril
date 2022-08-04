package org.anudip.Array;
package org.anudip.Array;
public class ArrayAverage 
{
	public static void main(String[] args) 
	{
		int[] a={4,2,9,3,5,1,6};
		int length =a.length;
		int sum = 0;
		
		for (int i=0; i<a.length; i++)
		{
			sum +=a[i];
		}
			double average =sum/length;
			
	System.out.println( "The average of the no. is -> "+ average );
		
	}

}
