package basic;

import java.util.ArrayList;

public class Assignment72_addelementatindex3 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		a1.add(3, 50);
		System.out.println(a1);

	}

}
