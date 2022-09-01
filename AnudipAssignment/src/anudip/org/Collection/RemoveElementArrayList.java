package anudip.org.Collection;

import static java.lang.System.*;
import java.util.ArrayList;

public class RemoveElementArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<>();
		out.print("Name List....\n");
		name.add("Rahul");
		name.add("Amit");
		name.add("Manish");
		name.add("Ram");
		name.add("Yash");
		
		out.println(name);
		name.remove(3);
		out.println(name);
		
	}

}
