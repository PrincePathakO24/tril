package anudip2.assignment;

public class WhiteSpaces 
{
	void display()
	{

        String str = "    Prince Pathak     ";
 
        str = str.replaceAll("\\s", "");     // Call the replaceAll() method
 
        System.out.println(str);
		
		
		
	}
	 public static void main(String[] args)
	 {
		 WhiteSpaces ws = new WhiteSpaces();
		 ws.display();
		 
	 }
	}

