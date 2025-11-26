package basic;

import java.util.ArrayList;

public class Assignment81_Clone_Equals_LastIndexOf_ArrayList {

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
			
			
			ArrayList<Integer> a2= (ArrayList<Integer>) a1.clone();
			System.out.println("Cloned List"+a2);
		
		boolean b1=a1.equals(a2);
		System.out.println(b1);
		
		System.out.println("Last Index of 10 is:"+a1.lastIndexOf(10));
			

	}

}
