package anudipTest.org.OopsProject;

public class StudentMain 
{
	public static void main(String args[])
	{
		Student obj1 =new Student();			// Student class 1st object
		{
		
		obj1.setRoll_No(123);					// to call set method
		obj1.setName("Vijay");					// to call set method
		obj1.setAge(22);						// to call set method
		
		System.out.println(obj1.getInstituteName());	// to Print InstituteName
		System.out.println(obj1.getRoll_No());			// to Print Roll_No
		System.out.println(obj1.getName());				// to Print Name
		System.out.println(obj1.getAge());				// to Print Age
		
		}
		System.out.println( );
		
		Student obj2 =new Student();			// Student class 2nd object
		{	
		
		obj2.setRoll_No(124);					// to call set method
		obj2.setName("Prince");					// to call set method
		obj2.setAge(22);						// to call set method
		
		System.out.println(obj1.getInstituteName()); // to Print InstituteName
		System.out.println(obj1.getRoll_No());		// to Print Roll_No
		System.out.println(obj1.getName());			// to Print Name
		System.out.println(obj1.getAge());			// to Print Age
		}
		System.out.println();						// for next line
		
		Student obj3 =new Student();			// Student class 3d object
		{
		
		obj3.setRoll_No(125);					// to call set method
		obj3.setName("Pathak");					// to call set method
		obj3.setAge(22);						// to call set method
		
		System.out.println(obj1.getInstituteName());	//to Print InstituteName
		System.out.println(obj1.getRoll_No());			// to Print Roll_No
		System.out.println(obj1.getName());				// to Print  Name
		System.out.println(obj1.getAge());				// to Print Age
		}
	}

}
