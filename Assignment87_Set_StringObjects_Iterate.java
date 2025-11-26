package basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment87_Set_StringObjects_Iterate {

	public static void main(String[] args) {
		
		Set<String> s1=new HashSet<String>();
		s1.add("Jyothsna");
		s1.add("Gro tech minds");
		s1.add("Automation");
		s1.add("AB55");
		s1.add("Testing");
		s1.add("Manual");
		s1.add("Assignment");
		s1.add("Exams");
		Iterator<String> i1=s1.iterator();
		System.out.println("printing the elements in the forward direction using Iterator");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
