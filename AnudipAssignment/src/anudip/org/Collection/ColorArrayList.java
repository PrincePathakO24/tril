package anudip.org.Collection;

import static java.lang.System.*;
import java.util.ArrayList;

public class ColorArrayList  
{

	public static void main(String[] args) 
	{
		
		ArrayList<String> colors=new ArrayList<>();
		out.println("Colors List \n");
		colors.add("Red");
		colors.add("Pink");
		colors.add("Black");
		colors.add("Yellow");
		colors.add("Sky Blue");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Grey");
		
				
		for(String s:colors)
		{
			out.println(s);
		}

	}
}

