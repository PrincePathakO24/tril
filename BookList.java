/* 	WAP to create 2 ArrayLists list1 and list2 and add 3 objects of Book in each list
 and print elements of both ArrayLists one on one line.
 
 	 Author Name => Prince Pathak
 
 */


package CollectionProject.Test;

import java.util.ArrayList;
import java.util.Collections;

public class BookList 
{

	public static void main(String[]args)
	{
		ArrayList<Book>list1=new ArrayList<>(); 	// ArrayList Obj.1 Book class 
		
		Book B1 = new Book ("B124"," Java", " Amit");  // Book class object with parameter for list
		Book B2 = new Book ("P527","Advance Java", " Rahul"); 	// Book class object with parameter for list
		Book B3 = new Book ("L194"," C++", " Ram");	// Book class object with parameter for list
	
		ArrayList<Book>list2=new ArrayList<>(); 	// ArrayList Obj.2 Book class 
		
		Book B4 = new Book ("L1564"," Hindi", " Jeeven");	// Book class object with parameter for list
		Book B5 = new Book ("E5777","Basic Computer", " Kavita");	// Book class object with parameter for list
		Book B6 = new Book ("J19564"," English", " Priya");		// Book class object with parameter for list
	
		list1.add(B1);  // Add in list 1
		list1.add(B2);	// Add in list 1
		list1.add(B3);	// Add in list 1
		list2.add(B4);	// Add in list 2
		list2.add(B5);	// Add in list 2
		list2.add(B6);	// Add in list 2
	
		System.out.println("Both ArrayLists one on one line........\n"); // For comment on console
		
		for(Book B:list1)
		   {
			System.out.println(B); 		// For Print
			}
		for(Book BB:list2)
		   {
			System.out.println(BB); 	// For Print
			}
		
				
		
	}
	
}
