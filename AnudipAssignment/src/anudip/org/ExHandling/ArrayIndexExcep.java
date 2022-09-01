package anudip.org.ExHandling;

public class ArrayIndexExcep 

{
	public static void main(String[] args)
	{
		int[] arr=new int[2];
		try {
		arr[3]=5;
		System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("This Array Index not lay in given range \n" + e);
		}
	}

}


