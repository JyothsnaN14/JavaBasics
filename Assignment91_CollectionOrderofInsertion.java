package basic;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Assignment91_CollectionOrderofInsertion {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(50);
		a1.add(40);
		a1.add(30);
		System.out.println(a1);
		if(a1.getFirst()==10 && a1.getLast()==30)
		{
		System.out.println("Order of Insertion is followed for ArrayList");
		}
		else
		{
		System.out.println("Order of Insertion is not followed for ArrayList");	
		}
		
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(9);
		l1.add(15);
		l1.add(5);
		System.out.println(l1);
		if(l1.getFirst()==10 && l1.getLast()==5)
		{
		System.out.println("Order of Insertion is followed for LinkedList");
		}
		else
		{
		System.out.println("Order of Insertion is not followed for LinkedList");	
		}
		
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(100);
		v1.add(200);
		v1.add(50);
		v1.add(10);
		v1.add(700);
		System.out.println(v1);
		if(v1.getFirst()==100 && v1.getLast()==700)
		{
		System.out.println("Order of Insertion is followed for Vector");
		}
		else
		{
		System.out.println("Order of Insertion is not followed for Vector");	
		}
		
		Stack<Integer> s1=new Stack<Integer>();
		s1.add(10);
		s1.add(200);
		s1.add(50);
		s1.add(10);
		s1.add(700);
		System.out.println(s1);
		if(s1.getFirst()==10 && s1.getLast()==700)
		{
		System.out.println("Order of Insertion is followed for Stack");
		}
		else
		{
		System.out.println("Order of Insertion is not followed for Stack");	
		}
		
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		p1.add(15);
		p1.add(10);
		p1.add(5);
		p1.add(30);
		System.out.println(p1);
		System.out.println("Order of Insertion is not followed for PriorityQueue");	
		
		Queue<Integer> q1=new LinkedList<Integer>();
		q1.add(15);
		q1.add(105);
		q1.add(5);
		q1.add(30);
		System.out.println(q1);
		System.out.println("Order of Insertion is followed for LinkedList(Queue)");
		
		ArrayDeque<Integer> AD1=new ArrayDeque<Integer>();
		AD1.add(15);
		AD1.add(105);
		AD1.add(5);
		AD1.add(30);
		System.out.println(AD1);		
		if(AD1.getFirst()==15 && AD1.getLast()==30)
		{
		System.out.println("Order of Insertion is followed for ArrayDeque");
		}
		else
		{
		System.out.println("Order of Insertion is not followed for ArrayDeque");	
		}
		
		HashSet<Integer> HS1=new HashSet<Integer>();
		HS1.add(15);
		HS1.add(105);
		HS1.add(5);
		HS1.add(30);
		System.out.println(HS1);		
		System.out.println("Order of insertion is not followed for HashSet");
		
		LinkedHashSet<Integer> LHS1=new LinkedHashSet<Integer>();
		LHS1.add(15);
		LHS1.add(105);
		LHS1.add(5);
		LHS1.add(30);
		System.out.println(LHS1);		
		if(LHS1.getFirst()==15 && LHS1.getLast()==30)
		{
		System.out.println("Order of Insertion is followed for LinkedHashSet");
		}
		else
		{
		System.out.println("Order of Insertion is not followed for LinkedHashSet");	
		}
		
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(15);
		t1.add(105);
		t1.add(5);
		t1.add(30);
		System.out.println(t1);		
		if(t1.getFirst()==15 && t1.getLast()==30)
		{
		System.out.println("Order of Insertion is followed for TreeSet");
		}
		else
		{
		System.out.println("Order of Insertion is not followed for TreeSet");	
		}

	}

}
