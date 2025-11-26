package basic;

import java.util.ArrayList;

public class Assignment73_ArraylistIsempty {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		if(a1.isEmpty())
				{
			System.out.println("ArrayList is empty");
				}
		else {
			
			System.out.println("ArrayList is not empty");
		}

	}

}
