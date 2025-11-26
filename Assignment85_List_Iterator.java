package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment85_List_Iterator {

	public static void main(String[] args) {
		
			List<String> l1=new ArrayList<String>();
			l1.add("Jyothsna");
			l1.add("Gro tech minds");
			l1.add("Automation");
			l1.add("AB55");
			l1.add("Testing");
			
			Iterator<String> i1=l1.iterator();
			System.out.println("printing the elements in the forward direction using Iterator");
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
	}

}
