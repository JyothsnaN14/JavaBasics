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

public class Assignment92_Collection_NullValues {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(null);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		if(a1.contains(null))
		{
		System.out.println("ArrayList accepts null values");
		}
		else
		{
			System.out.println("ArrayList does not accept null values");	
		}
		
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(null);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
		if(l1.contains(null))
		{
		System.out.println("LinkedList accepts null values");
		}
		else
		{
			System.out.println("LinkedList does not accept null values");		
		}
			
		
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(100);
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(700);
		System.out.println(v1);
		if(v1.contains(null))
		{
		System.out.println("Vector accepts null values");
		}
		else
		{
			System.out.println("Vector does not accept null values");		
		}
		
		
		Stack<Integer> s1=new Stack<Integer>();
		s1.add(10);
		s1.add(200);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
		if(s1.contains(null))
		{
		System.out.println("Stack accepts null values");
		}
		else
		{
			System.out.println("Stack does not accept null values");		
		}
		
		
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		//p1.add(null);
		//p1.add(null);
		p1.add(20);
		p1.add(30);
		System.out.println(p1);
		if(p1.contains(null))
		{
		System.out.println("PriorityQueue accepts null values");
		}
		else
		{
			System.out.println("PriorityQueue does not accept null values");		
		}
		
		
		Queue<Integer> q1=new LinkedList<Integer>();
		q1.add(null);
		q1.add(null);
		q1.add(5);
		q1.add(null);
		System.out.println(q1);
		if(q1.contains(null))
		{
		System.out.println("LinkedList in queue accepts null values");
		}
		else
		{
			System.out.println("LinkedList in queue does not accept null values");		
		}
		
		
		ArrayDeque<Integer> AD1=new ArrayDeque<Integer>();
		//AD1.add(null);
		AD1.add(105);
		AD1.add(15);
		//AD1.add(null);
		System.out.println(AD1);		
		if(AD1.contains(null))
		{
		System.out.println("ArrayDeque accepts null values");
		}
		else
		{
			System.out.println("ArrayDeque does not accept null values");		
		}
		
		HashSet<Integer> HS1=new HashSet<Integer>();
		HS1.add(null);
		HS1.add(null);
		HS1.add(null);
		HS1.add(30);
		System.out.println(HS1);		
		if(HS1.contains(null))
		{
		System.out.println("HashSet accepts one null value");
		}
		else
		{
			System.out.println("HashSet does not accept null values");		
		}
		
		LinkedHashSet<Integer> LHS1=new LinkedHashSet<Integer>();
		LHS1.add(null);
		LHS1.add(null);
		LHS1.add(5);
		LHS1.add(null);
		System.out.println(LHS1);		
		if(LHS1.contains(null))
		{
		System.out.println("LinkedHashSet accepts one null value");
		}
		else
		{
			System.out.println("LinkedHashSet does not accept null values");		
		}
		
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(15);
		//t1.add(null);
		t1.add(20);
		//t1.add(null);
		System.out.println(t1);	
		System.out.println("TreeSet does not accept null values");		
	
		/*
		 * if(t1.contains(null)) { System.out.println("TreeSet accepts null values"); }
		 * else { System.out.println("TreeSet does not accept null values"); }
		 */
	

	}

}
