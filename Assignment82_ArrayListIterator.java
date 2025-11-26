package basic;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment82_ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add(20);
		System.out.println("printing the elements in the forward direction using Iterator");
		Iterator<Integer> a2 =a1.iterator();
		while(a2.hasNext())
		{
			System.out.println(a2.next());
			
		}

	}

}
