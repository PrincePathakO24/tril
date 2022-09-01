package anudip.org.Collection;

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class SwapArray 
	{

	public static void main(String[] args) 
	{
		   ArrayList<String> i=new ArrayList<>();
		   out.print("Subject List....\n");
		   i.add("Computer");
		   i.add("Hindi");
		   i.add("Mathematics ");
		   i.add("English");
		   i.add("Bio");
		   i.add("Science");
		   out.print("List before swapping....\n");
		   out.println(i);
		   Collections.swap(i,1,2);
		   out.println("\nList after swapping....");
		   out.println(i);
		}
	}
