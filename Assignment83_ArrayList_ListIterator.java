package basic;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment83_ArrayList_ListIterator {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		
		ListIterator<Integer> i1=a1.listIterator();
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
