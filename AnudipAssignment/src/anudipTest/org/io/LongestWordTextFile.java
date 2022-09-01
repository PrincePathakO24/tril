		package anudipTest.org.io;
		
		import java.util.Scanner;
		import java.io.File;
		import java.io.FileNotFoundException;
		
		public class LongestWordTextFile 
		{
			public static void main(String [ ] args) throws FileNotFoundException
			{
				new LongestWordTextFile().findLongestWords();
			}
			public String findLongestWords() throws FileNotFoundException 
			{
				String longest_word = " ";
				String current;
				Scanner sc = new Scanner(new File("C:\\Users\\princ\\eclipse-workspace\\Anudeep\\Pathak1.text"));
				while (sc.hasNext()) {
				current = sc.next();
				if (current.length() > longest_word.length()) {
				longest_word = current;
			}
		}
			System.out.println("\n"+longest_word+"\n");
			return longest_word;
			}
		}
