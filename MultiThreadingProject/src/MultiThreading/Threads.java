	/*
	   Threads.java
	Q.1 Write a Java program to create multiple thread in Java.
	    (Print even and Odd numbers)Set their name and prorities.



	 */



package MultiThreading;

	class EvenOdd
	{
		 void even()
		{
			 System.out.println(Thread.currentThread().getName()+"The Even numbers are :");
				
				for(int i=0;i<50;i++)
				{	
					//checking condition for Even using if condition
					if(i%2==0)
					{
						System.out.println(Thread.currentThread().getName()+"Even number : "+i);
					}
				}
		}
		 void odd()
		 {
			 System.out.println(Thread.currentThread().getName()+"The Odd numbers are :");
			 for(int i=0;i<50;i++)
				{	
					//checking condition for odd using if condition
					if(i%2!=0)
					{
						System.out.println(Thread.currentThread().getName()+"Odd number : "+i);
					}
				}

		 }
	}

	class Even implements Runnable
	{
		@Override
		public void run() 
		{
			EvenOdd EO=new EvenOdd();
					EO.even();		
		}
	}


	class Odd implements Runnable
	{

		@Override
		public void run() 
		{
			EvenOdd EO=new EvenOdd();
					EO.odd();
			
		}
		
	

	public class ThreadMain 
	{


		public static void main(String[] args) 
		{
			EvenOdd EO=new EvenOdd();
			Odd Obj=new Odd();
			Even E=new Even();
			
			Thread th1=new Thread(Obj,"Thread 1 ");
			Thread th2=new Thread(E,"Thread 2 ");
			
			th1.start();
			th1.setPriority(1);
			th2.start();
			th2.setPriority(2);
		}
	}
}
