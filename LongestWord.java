/*
LongestWord.java
   Write a Java program to find the longest word in a text file.
*/

package IO;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LongestWord 
{

	public static void readString()
	{
		StringBuilder sb = new StringBuilder(); // String Builder class obj. 
        String strLine = "";
        String str_data = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("E:\\ReadFileLab1.txt"));
             
             // to Read in file 
             while (strLine != null)
             {
                str_data += strLine;
                strLine = br.readLine();	// read string by line
                
            }
              System.out.println(str_data);		// to print string 
             br.close();			// for closed Builder class
        } 
        catch (FileNotFoundException e) 
        {	
            System.err.println("File not found in System"); 	// to print Exception
        } 
        catch (IOException e) 
        {
            System.err.println("Unable to read this file ");		// to print Exception
        }
	}
	
	public static void LenthWord()
	{	
		
		File f=new File("E:\\ReadFileLab1.txt");
		try {
			String str="";
			String ct;
			
			Scanner sc=new Scanner(f);
			
			// to find check the length of String 
			while(sc.hasNext())
			{
				ct=sc.next();
				if(ct.length()>str.length())
				{
					str=ct;
				}
			}
			System.out.println(str); 		// to print longest length word 
		}
		catch (FileNotFoundException e) 	// to print Exception
		{
				e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args)
	{
		readString(); 			// to Call Method
		System.out.println();		// space to next line
		 System.out.println(" Now we find the longest length word in a text file Which is :  ");
		LenthWord();		// to Call Method
		
	}
}