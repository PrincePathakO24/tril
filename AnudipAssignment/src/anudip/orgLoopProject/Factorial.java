package anudip.orgLoopProject;
import java.util.Scanner;

public class Factorial 
{
	 private static Factorial obj;

	void Factorial(int n) 
	 {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		String y ="yes";
		String n1 ="no";
		System.out.println("Enter number for find factorial");
		n = sc.nextInt();
		
		
		int  i=1;
		do
		{
		    		
			if (i<=n);
			{
				fact=fact*i;
				i++;
			System.out.println("factorial is :"+fact);
			}
			System.out.println(" Do you want to Continue (yes/no) ");
			y = sc.next().toLowerCase();
		}
	while (y.equals("yes")); 
	} 

	public static void main(String[] args) 
	{	
		Factorial.obj = new Factorial();
				obj.Factorial(0);
	}	
}

