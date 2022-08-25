package Anudip.StringArray;

	public class ArrayStringArg 
	{
	
			static String strConcatDisplay(String st[])
			{
				
				StringBuilder builder =new StringBuilder(); 	//Array in StringBuilder object
				try
				{
					
					if(st==null)	//String is null
					{
						throw new Exception();
					}
					
					for(String s:st)
					{
						builder.append(s+" "); // Append Method
					}
				}
				catch(Exception e)
				{
					
					System.out.println("The Array should not be null ");  // Message of Null Array
				}
				
				return builder.toString();
			}
		 public static void main(String args[])
		 {
			 //for String values
			 String str1[]=null;
			 String str2[]= {"Hello","Everyone"};
			 String str3[]= {"How", "all","are","you?"};
			 
			//Print
			 System.out.println(strConcatDisplay(str1));
			 System.out.println(strConcatDisplay(str2));
			 System.out.println(strConcatDisplay(str3));
		 }
		}
