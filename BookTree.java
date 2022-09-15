
/*Write a Java program to create a new tree set and add above ArrayLists in TreeSet.
    Get the number of elements in  tree set and print first and last element of treeset.
    
     Author Name => Prince Pathak
    
    */


package CollectionProject.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class BookTree 
{
	public static void main(String[] args)
	{
		ArrayList<Book> list5=new ArrayList<>(); 		// ArrayList Obj.1 Book class
		Book BA1=new Book("PH70","Hindi","Sourav");		// Book class object with parameter for list 5
		Book BA2=new Book("KI56","Computer","Sushil");	// Book class object with parameter for list 5
		Book BA3=new Book("NF45","Physic","Gourav");	// Book class object with parameter	for list 5
		list5.add(BA1);
		list5.add(BA2);
		list5.add(BA3);
		System.out.println("..........First List..........\n");		// For comment on console
		for(Book B:list5)
		{
			
			System.out.println(B);	// // For Print the elements
		}
		
		ArrayList<Book> list6=new ArrayList<>(); 
		Book BA4=new Book("HT67","English","Rahul Sharma");		// Book class object with parameter	for list 6
		Book BA5=new Book("LN23","Networking","Sushil Pathak...");	// Book class object with parameter	for list 6
		Book BA6=new Book("BH590","Programing With C ","Jatin");	// Book class object with parameter	for list 6
		list6.add(BA4);			// Add in list 
		list6.add(BA5);			// Add in list 
		list6.add(BA6);			// Add in list 
		System.out.println("\n..........Second List..........\n");		// For comment on console
		for(Book BB:list6)
		{
			
			System.out.println(BB);		// For Print the elements
		}
		list6.addAll(list5); 		// Add all the elements of list 6 in list 5
		TreeSet<Book> set = new TreeSet<>(list6);		// Treeset Object
		System.out.println("Now we Set the values of Treeset...\n");		// For comment on console
		for(Book B:set)
		{
			
			System.out.println(B);		// for Print
		}
		
		System.out.println("\nFirst Element : " +set.first());  // For Print the First element of treeset
		System.out.println("last Element : "+set.last());		// For Print the last element of treeset
		
	
	}
	
}
