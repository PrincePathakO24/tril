package anudipTest.org.ExHandling;

import java.util.Scanner;

public class ArrayLengthZerro 
{
	int sum(int[] values, int start,int end)
	{
		int sum = 0; 
		try 
		{//loop iterating from start index to end index
			
			for(int a = start;a<end;a++) 
			{
				sum += values[a];
			}
			
			if(values.length==0) 
				throw new IllegalArgumentException();
			
			if(values==null) 
				throw new NullPointerException();
			
			if(start<0 || end>=values.length || start>end)
				throw new ArrayIndexOutOfBoundsException();
			
			if(sum==0) 
				throw new Exception();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(NullPointerException a)
		{
			System.out.println("NullPointerException");
		}
		catch(Exception e) 
		{
			System.out.println("sum is 0");
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayLengthZerro s = new ArrayLengthZerro();

		Scanner sc = new Scanner(System.in);
		int start,end,size;

		System.out.println("Enter Size of array : ");
		size = sc.nextInt();
		int arr[] =new int[size];
//		Accepting  values from user
		for(int i=0;i<size;i++)
		{
			System.out.println("enter value of ["+i+"] index");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter Start index of array : ");
		start = sc.nextInt();
		
		System.out.println("Enter End index of array : ");
		end = sc.nextInt();

		System.out.println("Sum of array elements is : "+s.sum(arr, start, end));
		sc.close();
	}
}