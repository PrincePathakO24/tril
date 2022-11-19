package com.SpringHibernateLab1.service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringHibernateLab1.dao.BookDao;
import com.SpringHibernateLab1.entity.BookEntity;


public class App {

	public static void main(String[] args) 
	{
		//ApplicationContext class reference
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringLabContext.xml");

		BookDao bd = (BookDao) ac.getBean("bkdao");
	

		char c='y';
		
		while (c=='y')		//while loop
		{
			// To Display
			System.out.println("Choose any options on which you want to perform task :\n");

			System.out.println("Enter 1 : To Choose 1st option to insert the Book details: ");
			System.out.println("Enter 2 : To Choose 2nd option to update the Book details: ");
			System.out.println("Enter 3 : To Choose 3th option to display the Book details: ");
			System.out.println("Enter 4 : To Choose 4rd option to delete the Book details: ");
			System.out.println("Enter 5 : To Choose 5th option to exit:");
			System.out.println(" ");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your option");
			int i = sc.nextInt();
			
			switch (i) 
			{
			// To Insert
			case 1: {
				BookEntity b = new BookEntity();
				
				System.out.println("Insert Book id:");
				int be1 = sc.nextInt();
				b.setBook_id(be1);
				
				System.out.println("Insert Book name:");
				String be2 = sc.next();
				b.setBook_name(be2);
				
				System.out.println("Insert Book Authour name:");
				String be3 = sc.next();
				b.setAuthor(be3);
				
				System.out.println("Insert Price of Book: ");
				int be4 = sc.nextInt();
				b.setPrice(be4);
				try {  
		            /*  
		            Integer a = sc.nextInt();     
		            System.out.println(a); */ 
		        }   
		        catch (InputMismatchException ex) {  
		            System.out.println(  
		                    ex);  
		        }
				int y = bd. insertBookEntity(b);
				if (y == 1) {
					System.out.println(" ..........................................");
					System.out.println(" Inserted successfully Completed ...");
					}
				
				else
					System.out.println("Cheak your details And Try Agian...");
				break;
			}
			
			// To Update
			case 2: {
				BookEntity b = new BookEntity();
				
				System.out.println("Enter Book id in Which you want to  Update :");
				int be1 = sc.nextInt();
				b.setBook_id(be1);
				
				System.out.println("Update Book name:");
				String be2 = sc.next();
				b.setBook_name(be2);
				
				System.out.println("Update Book Authour name:");
				String be3 = sc.next();
				b.setAuthor(be3);
				
				System.out.println("Update Price of Book:");
				Integer be4 = sc.nextInt();
				b.setPrice(be4);
				try {   
		            /*Integer a = sc.nextInt(); 
		            System.out.println(a); */ 
		        }   
		        catch (InputMismatchException ex) {  
		            System.out.println(  
		                    ex);  
		        }
				
				int y = bd.updateBookEntity(b);
				if (y == 1) {
					System.out.println(" ..........................................");
					System.out.println(" Updated successfully Completed ...");
					}
				else
					System.out.println("Cheak your details And Try Agian...");
				break;
			}
			
			//To Display
			case 3: {
				BookEntity b = new BookEntity();
				System.out.println("Displaying all users details...");

				List<BookEntity> list = bd.getAllBookEntitys();
				System.out.println("\n" + list + "\n");
				break;
			}
			//To Delete
			case 4: {
				
				BookEntity b = new BookEntity();
				
				System.out.println("Enter Book id Which you want to Delete: ");
				int be1 = sc.nextInt();
				b.setBook_id(be1);
				
				/*System.out.println("Delete Book name:");
				String be2 = sc.next();
				b.setBook_name(be2);
				
				System.out.println("Delete Book Authour name:");
				String be3 = sc.next();
				b.setAuthor(be3);
				
				System.out.println("Delete Price id:");
				Integer be4 = sc.nextInt();
				b.setPrice(be4);
				try { 
		            Integer a = sc.nextInt(); 
		            System.out.println(a);  
		        }   
		        catch (InputMismatchException ex) {  
		            System.out.println(  
		                    ex); 
		        }*/
				
				int y = bd.deleteBookEntity(b);
				if (y == 1)
				{
					System.out.println(" ..........................................");
					System.out.println(" Deleted successfully Completed ...");
				}
				else
					System.out.println("Cheak your details And Try Agian...");
				break;
			}
			
			//To Exit 
			case 5:{
				System.out.println("<-- Thank You for Visit --> ");
				c='n';
				break;
			}
			
			//Default
			default:
				System.out.println("Please Enter a valid option...\n");
				
			}
			System.out.println(" ................................");

			System.out.println("Do you want to continue y/n...");
			c=sc.next().charAt(0);
			
		}
	}
} 
	