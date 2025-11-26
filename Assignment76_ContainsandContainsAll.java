package basic;

import java.util.ArrayList;

public class Assignment76_ContainsandContainsAll {

	public static void main(String[] args) {
		
			ArrayList<Integer> a1=new ArrayList<Integer>();
			a1.add(10);
			a1.add(30);
			a1.add(30);
			a1.add(20);
			boolean b1=a1.contains(10);
			System.out.println(b1);
			
			ArrayList<Integer> a2=new ArrayList<Integer>();
			a2.add(10);
			a2.add(20);
			boolean b2=a1.containsAll(a2);
			System.out.println(b2);
			

	}

}
