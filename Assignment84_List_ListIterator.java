package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment84_List_ListIterator {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("Jyothsna");
		l1.add("Gro tech minds");
		l1.add("Automation");
		l1.add("AB55");
		l1.add("Testing");
		
		ListIterator<String> i1=l1.listIterator();
		System.out.println("printing the elements in the forward direction using ListIterator");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("printing the elements in the backward direction using ListIterator");
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}

		
	}

}
