package basic;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment80_SortelementsinArrayList {

	public static void main(String[] args) {
	
			ArrayList<Integer> a1=new ArrayList<Integer>();
			a1.add(55);
			a1.add(20);
			a1.add(104);
			a1.add(4);
			a1.add(571);
			a1.add(5);
			a1.add(1);
			a1.add(-20);
			a1.add(55);
			a1.add(20);
			a1.add(104);
			a1.add(10000);
			Collections.sort(a1);
			System.out.println("Elements after sorting in Ascending order:"+a1);
			
			
	}

}
