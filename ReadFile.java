/*
1. Write a java program to read a file line by line and store it into a variable.


*/

package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
 
public class ReadFile 
{ 
 
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();		// String Builder class obj. 
        String strLine = "";
        String str_data = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("E:\\ReadFileLab1.txt"));
             
          // to Read in file
             while (strLine != null)
             {
                str_data += strLine;
                strLine = br.readLine();   // read string by line
                
            }
              System.out.println(str_data);		// to print string
             br.close();						// for closed Builder class
        } 
        catch (FileNotFoundException e) 
        {
            System.err.println("File not found in System");		// to print Exception
        } catch (IOException e) {
            System.err.println("Unable to read this file ");	// to print Exception
        }
     }
}