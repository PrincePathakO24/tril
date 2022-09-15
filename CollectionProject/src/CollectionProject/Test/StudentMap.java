/*3. WAP to create a HashMap and add 5 student's id(101,102,103,104,105) as key and name as value.
   Print the name of students whose id is greater than 103.
   
   Author Name => Prince Pathak
   
   */



package CollectionProject.Test;

import java.util.HashMap;
import java.util.Set;

public class StudentMap {

	public static void main(String[] args) 
	{
		
			HashMap<Integer,String> map=new HashMap<>(); // HashMap object
			map.put(101, "Pathak");		// HashMap list
			map.put(102, "Akash");		// HashMap list
			map.put(103, "Manish");		// HashMap list
			map.put(104, "Nikki");		// HashMap list
			map.put(105, "Renu");		// HashMap list
			
			Set<Integer> keys=map.keySet(); 	//
			for(Integer e:keys)	//Traversing the value of keys by using for each loop
			{
				// loop for print the element id grater then 103
				if( e.intValue()>103 ) 
				{
				System.out.println(map.get(e)); //Print the element id grater then 103
			    }
			}
			
		}
	

}
