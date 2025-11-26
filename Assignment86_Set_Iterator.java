package basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment86_Set_Iterator {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(550);
		s1.add(40);
		s1.add(10);
		s1.add(20);
		s1.add(550);
		s1.add(80);
		System.out.println("Elements in the set are:"+s1);
		Iterator<Integer> i1=s1.iterator();
		System.out.println("printing the elements in the forward direction using Iterator");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
