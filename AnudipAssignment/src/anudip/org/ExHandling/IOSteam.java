package anudip.org.ExHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IOSteam 
{
	private static final String Fileinputsteam = null;


	static void Writefile()
	{
		
		//FileOutputStream fout;
		
				FileWriter FR = null;
				try {
					FR = new FileWriter ("E:\\IOFile2.txt");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try
				{
					FR.write(" Hello .... This is Java file 2nd");
					
					System.out.println("Your File successfully Witten....");
					
				}
				catch (IOException e)
				{
					System.out.println(e);
					
				}
				
				finally
				{
				  
					  try {
						FR.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  }
				
		
	}
	
	
	static void Readfile()
	{
		
		FileInputStream FR=null;
		System.out.println("Your File successfully Read........");
		try
		{
			FR=new FileInputStream("E:\\IOFile2.txt");
			int i=FR.read() ;
			while(i!=-1)
			{
				System.out.print((char) i);
				i=FR.read();
			}
		}
		catch (FileNotFoundException ie)
		{
			System.out.println(ie);
			
		}
		 catch (IOException e) 
		{
				e.printStackTrace();
			}
		}

public static void main (String args[])
{
	Writefile();
	Readfile();

}


}
