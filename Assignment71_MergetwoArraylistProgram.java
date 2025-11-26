package basic;

import java.util.ArrayList;

public class Assignment71_MergetwoArraylistProgram {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a1.add(50);
		a1.add(60);
		
		a1.addAll(a2);
		System.out.println(a1);
		

	}

}
