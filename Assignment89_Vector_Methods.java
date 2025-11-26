package basic;

import java.util.Vector;

public class Assignment89_Vector_Methods {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
		v1.add("Jyothsna");
		v1.add("Gro tech minds");
		v1.add("Automation");
		v1.add("AB55");
		v1.add("Testing");
		v1.add("Manual");
		v1.add("Assignment");
		v1.add("Exams");
		v1.add("Testing");
		v1.add("Manual");
		System.out.println(v1);
		
		Vector<String> v2=new Vector<String>();
		v2.add("Jyothsna");
		v2.add("Gro tech minds");
		v2.add("Automation");
		v2.add("AB55");
		System.out.println(v2);
		
		v2.add(0, "Java");
		System.out.println(v2);
		
		v2.addAll(v1);
		System.out.println(v2);
		
		v1.addAll(0,v2);
		System.out.println(v1);
		
		v1.addElement("Viva");
		System.out.println(v1);
		
		boolean b1=v1.contains("Jyothsna");
		System.out.println(b1);

		boolean b2=v1.containsAll(v2);
		System.out.println(b2);
		
		boolean b3=v1.equals(v2);
		System.out.println(b3);
		
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		
		v1.setElementAt("Students", 0);
		System.out.println(v1);
		
		System.out.println(v1.elementAt(0));
		System.out.println(v1.get(1));
		System.out.println(v1.capacity());
		System.out.println(v1.indexOf("Jyothsna", 2));
	    
		v1.removeAll(v2);
		System.out.println(v1);
		
		boolean b4=v2.isEmpty();
		System.out.println(b4);

		v2.removeAllElements();
		System.out.println(v2);
		 
		v1.removeElementAt(0);
		System.out.println(v1);
		
		v1.removeElement("Jyothsna");
		System.out.println(v1);
		
		v1.setElementAt("Students", 0);
		System.out.println(v1);
		v1.clear();
		System.out.println(v1);
		
	    
		
		 
		 
		
	}

}
