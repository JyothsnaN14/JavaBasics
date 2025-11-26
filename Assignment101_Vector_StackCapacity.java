package basic;

import java.util.Stack;
import java.util.Vector;

public class Assignment101_Vector_StackCapacity {

	public static void main(String[] args) {
		Vector<Integer> v1=new Vector<Integer>();
		System.out.println("Initial Capacity of Vector:"+v1.capacity());
		//adding 11 elements
		v1.add(10);
		v1.add(20);
		v1.add(5);
		v1.add(1);
		v1.add(2);
		v1.add(53);
		v1.add(111);
		v1.add(25);
		v1.add(55);
		v1.add(53);
		v1.add(25);
		System.out.println("Current Capacity of Vector after Initial capacity is exceeded:"+v1.capacity());
		if(v1.capacity()==20)
		{
			System.out.println("Vector Doubles its size when the current capacity is exceeded");
		}
		else
		{
			System.out.println("Vector capacity is not doubled when the current capacity is exceeded");
		}
	
	Stack<Integer> s1=new Stack<Integer>();
	System.out.println("Initial Capacity of Stack:"+s1.capacity());
	//adding 11 elements
	s1.add(10);
	s1.add(20);
	s1.add(5);
	s1.add(1);
	s1.add(2);
	s1.add(53);
	s1.add(111);
	s1.add(25);
	s1.add(55);
	s1.add(53);
	s1.add(25);
	System.out.println("Current Capacity of Stack after Initial capacity is exceeded:"+s1.capacity());
	if(s1.capacity()==20)
	{
		System.out.println("Stack Doubles its size when the current capacity is exceeded");
	}
	else
	{
		System.out.println("Stack capacity is not doubled when the current capacity is exceeded");
	}
}

}
