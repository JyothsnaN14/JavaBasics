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

public class Assignment93_CollectionDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(50);
		a1.add(40);
		a1.add(10);
		System.out.println(a1);
		System.out.println("ArrayList accepts duplicate values");
		
		
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(9);
		l1.add(15);
		l1.add(10);
		System.out.println(l1);
		System.out.println("LinkedList accepts duplicate values");
		
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(100);
		v1.add(200);
		v1.add(50);
		v1.add(10);
		v1.add(10);
		System.out.println(v1);
		System.out.println("Vector accepts duplicate values");
		
		
		Stack<Integer> s1=new Stack<Integer>();
		s1.add(10);
		s1.add(200);
		s1.add(50);
		s1.add(10);
		s1.add(10);
		System.out.println(s1);
		System.out.println("Stack accepts duplicate values");
		
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		p1.add(15);
		p1.add(10);
		p1.add(5);
		p1.add(10);
		System.out.println(p1);
		System.out.println("PriorityQueue accepts duplicate values");
		
		Queue<Integer> q1=new LinkedList<Integer>();
		q1.add(30);
		q1.add(105);
		q1.add(5);
		q1.add(30);
		System.out.println(q1);
		System.out.println("LinkedList in Queue accepts duplicate values");
		
		ArrayDeque<Integer> AD1=new ArrayDeque<Integer>();
		AD1.add(15);
		AD1.add(30);
		AD1.add(5);
		AD1.add(30);
		System.out.println(AD1);		
		System.out.println("ArrayDeque accepts duplicate values");
		
		HashSet<Integer> HS1=new HashSet<Integer>();
		HS1.add(15);
		HS1.add(30);
		HS1.add(5);
		HS1.add(30);
		System.out.println(HS1);		
		System.out.println("HashSet does not accept duplicate values");
		
		LinkedHashSet<Integer> LHS1=new LinkedHashSet<Integer>();
		LHS1.add(15);
		LHS1.add(30);
		LHS1.add(5);
		LHS1.add(30);
		System.out.println(LHS1);		
		System.out.println("LinkedHashSet does not accept duplicate values");
		
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(15);
		t1.add(30);
		t1.add(5);
		t1.add(30);
		System.out.println(t1);		
		System.out.println("TreeSet does not accept duplicate values");
		

	}

}
