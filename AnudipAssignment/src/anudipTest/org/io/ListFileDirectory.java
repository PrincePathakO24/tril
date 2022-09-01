package anudipTest.org.io;

import java.io.File;

public class ListFileDirectory 
{
	public static void main(String a[])
	{
	File file = new File("C:\\Users\\princ\\eclipse-workspace\\Anudeep");
	String[] fileList = file.list();
	for(String name:fileList)
	{
	System.out.println(name);
	}
  }
}
