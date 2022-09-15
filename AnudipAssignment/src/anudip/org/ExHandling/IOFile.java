package anudip.org.ExHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.stream.Stream;


public class IOFile 
{	
		
	public static void main (String args[]) throws IOException 
	{	
		
		 
		FileWriter FR = new FileWriter ("E:\\IOFile.txt");
		//FileOutputStream fout;
		
		/*FileWriter FR = null;
		try {
			FR = new FileWriter ("E:\\IOFile.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		try
		{
			FR.write(" hi .... This is a Java File");
			
			System.out.println("Your File successfully Witten....");
			
		}
		catch (IOException e)
		{
			System.out.println(e);
			
		}
		
		finally
		{
		  
			  FR.close();
		  }
		
		readFile();
	}

	
	public static void readFile() throws IOException
	{
		System.out.println("Your File successfully Read........");
		FileInputStream FR = null;// = new FileInputStream("E:\\IOFile.txt");
		try {
			FR=new FileInputStream("E:\\IOFile.txt");
					
			Scanner reader=new Scanner(FR);
			while(reader.hasNextLine())
			{
				String st= reader.nextLine();
				System.out.println(st);
			}
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
			//System.out.println(ie);
		}
		finally
		{
		
			FR.close();
		}
	
		
	}
}



