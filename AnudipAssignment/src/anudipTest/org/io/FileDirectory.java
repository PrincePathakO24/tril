package anudipTest.org.io;

import java.io.File;

public class FileDirectory {

	public static void main(String[] args) 
{
	
		File my_file_dir = new File("C:\\Users\\princ\\eclipse-workspace\\Anudeep");
		if (my_file_dir.exists())
			{
			System.out.println("The directory or file exists.\n");
			}
		else
			{
			System.out.println("The directory or file does not exist.\n");
			}
		}	
}