package basic;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment88_Vector_Iteration {

	public static void main(String[] args) {
	Vector<Integer> v1=new Vector<Integer>();
	
	v1.add(10);
	v1.add(20);
	v1.add(550);
	v1.add(40);
	v1.add(10);
	v1.add(20);
	v1.add(550);
	v1.add(80);
	
	//ListIterator
	ListIterator<Integer> i1=v1.listIterator();
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

	//Iterator
	Iterator<Integer> i2=v1.iterator();
	System.out.println("printing the elements in the forward direction using Iterator");
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	
	//Enumerator
	Enumeration<Integer> e1=v1.elements();
	System.out.println("printing the elements in the forward direction using Enumerator");
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	}

	}

																				
