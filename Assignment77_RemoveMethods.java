package basic;

import java.util.ArrayList;

public class Assignment77_RemoveMethods {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("jyothsna");
		a1.add(27);
		a1.add("Hyderabad");
		a1.add('F');
		a1.add("jyo23@gmail.com");
		a1.add(9876543210l);
		a1.add("ATP");
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("jyothsna");
		a2.add("ATP");
		
		System.out.println(a1);
		
		a1.remove(9876543210l);
		System.out.println(a1);
		
		a1.remove(1);
		System.out.println(a1);
		
		a1.removeAll(a2);
		System.out.println(a1);
		

	}

}
