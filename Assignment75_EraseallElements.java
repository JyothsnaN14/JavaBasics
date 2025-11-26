package basic;

import java.util.ArrayList;

public class Assignment75_EraseallElements {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println("Before Erasing:"+a1);
		a1.clear();
		System.out.println("After Erasing:"+a1);

	}

}
