/*
2.Write a Java program to append text to an existing file.

*/

package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
public class AppendFile
{
     public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "E:\\ReadFileLab1.txt";
             FileWriter fw = new FileWriter(filename,true); 
            
             //to write the string in file
             fw.write("Java IO Stream LabTest\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("E:\\ReadFileLab1.txt"));
           
             // to read the file content
             while (strLine != null)
             {
                sb.append(strLine);				// to append string
                strLine = br.readLine();		// read string by line
                System.out.println(strLine);  // to print file content 
            }
             br.close();		// for closed Builder class
           }
           
        catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());		// to print Exception
           }
        }
  }