/*
 Q.3 Apply InterThread Communication on demand and supply model.
  Create a class Producer with one data member int availableProduct and 
  two methods --demand() and supply().
  Create two threads . In the run() of first thread call demand(int n) and 
  In the run() of second thread call supply(int n).If deamnding number is gretaer than availableProduct
  consumer should wait till supply increases the availableProduct. 
 */


package MultiThreading;

class InterThreadCommunication 
{

		 int amount=500;
		
		 synchronized public void withDraw(int amt)
		 {
			  if(amount<amt)
			  {
					 try 
					 {
					    wait();
					 }
					 catch(InterruptedException ie)
				 	{
					    ie.printStackTrace();	 
						 
				 	}
					 amount-=amt;
			  }
			  else
				  amount-=amt;
			  System.out.println("Amount after withdraw="+amount);
			 
		 }
		 
		 
		 synchronized public void deposit(int amt)
		 {
			
			 amount+=amt;
			 System.out.println("Amount after deposit="+amount);
			 notify();
			 
		 }
}
	   class Thread1 extends Thread
	   {
		   InterThreadCommunication tc;
		   Thread1(InterThreadCommunication tc)
		   {
			   this.tc=tc;
		   }
		   
		  public void run()
		  {
			tc.withDraw(100);  
			  
		  }
		 
	   }

	   
	   class Thread2 extends Thread
	   {
		   InterThreadCommunication tc;
		   Thread2(InterThreadCommunication tc)
		   {
			   this.tc=tc;
		   }
		   
		  public void run()
		  {
			tc.deposit(1000);  
			  
		  }
		 
	   }
   
	   public class ThreadCommunication
	   {
		 public static void main(String ...args)
		 {
			 InterThreadCommunication tc=new InterThreadCommunication();
			 
			 Thread1 th1=new Thread1(tc);
			 
			 
			 th1.start();
			
			 Thread2 th2=new Thread2(tc);
			 th2.start();			 
			 
		 }
	   }	