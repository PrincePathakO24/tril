/*Q.2 Write a JAVA program which will generate two threads:(Use Synchronization)

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.
*/



package MultiThreading;

import java.io.Serial;

class FiboRevThread extends Thread
	{
		synchronized public void run()
		{
			System.out.println("The fibonacci series till 10 terms is : "+fibseries(10));
			System.out.println("The reverse order terms are in the following way : ");
			revorder();
		}
		int fibseries(int n)
		{
			int no1=0,no2=1;
			int no3=0;
			for(int i=1;i<=n;i++)
			{
				no3=no1+no2;
				no1=no2;
				no2=no3;
			}
			return no3;
		}
		void revorder()
		{
			for(int i=10;i>=1;i--)
			{
				System.out.println(i);
			}
		}
	
	public class FiboRevThreadMain
	{
		public static void main(String[] args) 
		{
			FiboRevThread obj=new FiboRevThread();
			Thread t1=new Thread(obj,"MyThread1");
			t1.start();
		}
	}
}