package anudipTest.org.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile 
{
	public static void main(String a[])
	{
		BufferedReader br = null;
		String strLine = "";
		try {
		br=newBufferedReader(newFileReader("C:\\Users\\princ\\eclipse-workspace\\Anudeep\\Pathak.txt"));
		while( (strLine = br.readLine()) != null)
		{
			System.out.println(strLine);
		}
		br.close();
		} 
		catch (FileNotFoundException e)
		{
			System.err.println("File not found");
		}
		catch (IOException e) 
			{
				System.err.println("Unable to read the file.");
			}
	}
		
		private static BufferedReader newBufferedReader(Object newFileReader) {
			
			return null;
		}
		
		private static Object newFileReader(String string) 
		{
			
		return null;
		}

}
