package Anudip.StringArray;
	import java.util.Scanner;

	public class StringX 
	{
	
		String character()			// Method
		{
			 Scanner sc=new Scanner(System.in); // Input for User
			 
		       System.out.println("Enter the String : ");
		       String str=sc.nextLine();
		       
		       if(str.length()>4) // length Condition 
		       {
		    	   String allexceptlast4=str.substring(0,str.length()-4);
		    	   String repeatString="x".repeat(allexceptlast4.length());
		    	    repeatString=repeatString+str.substring(str.length()-4);
		    	  
		    	   System.out.println(repeatString); // Print
		       }
		       else
		       {
		    	   System.out.println("The String should be Greater than Four Digit... ");
		       }
		       sc.close(); 	//close the Scanner
			   return str;
		       
			}
		public static void main(String args[])
		{
			StringX  obj=new StringX(); //object of Class
			
			obj.character(); 		//calling the method 
		}
}