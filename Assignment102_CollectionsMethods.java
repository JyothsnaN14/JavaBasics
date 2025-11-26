package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Assignment102_CollectionsMethods {

	public static void main(String[] args) {
	 ArrayList<Integer> a1=new ArrayList<Integer>();
	 a1.add(10);
	 a1.add(5);
	 a1.add(50);
	 a1.add(10);
	 a1.add(30);
	 
	 List<Integer> l1=new LinkedList<Integer>();
	 l1.add(25);
	 l1.add(70);
	 l1.add(25);
	 l1.add(70);
	 l1.add(25);
	 
	 //min()
	System.out.println(Collections.min(a1));
	
	//max()
	System.out.println(Collections.max(a1));
	
	//frequency()
	System.out.println(Collections.frequency(a1, 10));
	
	//sort()
	Collections.sort(a1);
	System.out.println(a1);
	
	//reverse()
	Collections.reverse(a1);
	System.out.println(a1);
	
	//shuffle()
	Collections.shuffle(a1);
	System.out.println(a1);
	
	//binarySearch()
	System.out.println(Collections.binarySearch(a1, 50));
	
	//rotate()
	Collections.rotate(a1,-2);
	System.out.println(a1);
	
	//disjoint()
	System.out.println(Collections.disjoint(a1,l1));
	
	//copy()
	Collections.copy(l1, a1);
	System.out.println(l1);
	
	//replaceAll()
	Collections.replaceAll(l1, 10, 20);
	System.out.println(l1);
	
	//fill()
	Collections.fill(a1, 25);
	System.out.println(a1);
	
	
	
	
	
	
	
	
	 
	
	}

}
