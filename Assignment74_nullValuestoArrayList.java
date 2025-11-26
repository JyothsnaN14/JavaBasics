package basic;

import java.util.ArrayList;

public class Assignment74_nullValuestoArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(null);
		a1.add(30);
		a1.add(40);
		a1.add(null);
		a1.addFirst(null);
		a1.addLast(null);
		a1.add(1,null);
		System.out.println(a1);
		
	}
	
}
