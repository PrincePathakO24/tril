/*2.Create a class  Student with four data members and constructors-
   
Institute name---it should be static and final.
  rollno.
  name
  age

Generate getter /setter and Override toString();
In the main class make 3 objects of Student  ...set their values and and print details.

 @author Prince Pathak

*/


package anudipTest.org.OopsProject;

public class Student 
{
	// Override toString
	
	@Override 
	public String toString() {
		return "Student [roll_No=" + roll_No + ", name=" + name + ", age=" + age + ", getRoll_No()=" + getRoll_No()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getRoll_No()  // getter method
	{
		return roll_No;
	}
	public void setRoll_No(int roll_No) //setter method of Roll no
	{
		this.roll_No = roll_No;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName()   // getter method
	{
		return name;
	}
	public void setName(String name)  //setter method of Name
	{
		this.name = name;
	}
	public int getAge()   // getter method
	{
		return age;
	}
	public void setAge(int age) //setter method of age
	{
		this.age = age;
	}
	public static String getInstituteName()   // getter method of Institute Name
	{
		return institute_name;
	}
	static final String institute_name = " Anudeep";
	int roll_No;
	String name;
	int age;
	public void setinstitute_name(String string) 
	{
		
		
	}
	
	
	
	
}
