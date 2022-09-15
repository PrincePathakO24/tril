/*Create a class Book with 3 private data members:
-bid
-subject
-author

	Author Name => Prince Pathak

*/




package CollectionProject.Test;

public class Book implements Comparable<Book>
{
	private String book_Id;
	private String subject;
	private String author;
	
		
	// parameterized constructor with fields
		public Book(String book_Id, String subject, String author)
		{
		super();
		this.book_Id = book_Id;
		this.subject = subject;
		this.author = author;
	}

		@Override
	public String toString() 
		{
		return "Book [book_Id=" + book_Id + ", subject=" + subject + ", author=" + author + ", getBook_Id()="
				+ getBook_Id() + ", getSubject()=" + getSubject() + ", getAuthor()=" + getAuthor() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public String getBook_Id() // Get Method of Book_Id
	{
		return book_Id;
	}
	public void setBook_Id(String book_Id) 	//Set method of Book_Id
	{
		this.book_Id = book_Id;
	}
	public String getSubject() 	// Get Method of Subject
	{
		return subject;
	}
	public void setSubject(String subject) //Set method of Subject
	{
		this.subject = subject;
	}
	public String getAuthor()	// Get Method of Author
	{
		return author;
	}
	public void setAuthor(String author) 	//Set method of Author
	{
		this.author = author;
	}
	
	//it is used to compare the element for addition of treeset
	public int compareTo(Book B) 		
	{
		return this.book_Id.compareTo(B.getBook_Id());
	}

}

