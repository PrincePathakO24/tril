package anudip2.assignment;

public class DuplicateElement 
{
	void display()
	{
		int [] A = new int [] {5, 9, 3, 9, 3, 7, 8, 2, 8};   
		
        System.out.println("Duplicate elements in given array: ");  
     
        for(int i = 0; i < A.length; i++) {  
            for(int j = i + 1; j < A.length; j++) {  
                if(A[i] == A[j])  
                    System.out.println(A[j]);  
            }  
        }  
    }  
		
    public static void main(String[] args)
 {
    	DuplicateElement DE = new DuplicateElement();
	 DE.display();
	 
 }
}
