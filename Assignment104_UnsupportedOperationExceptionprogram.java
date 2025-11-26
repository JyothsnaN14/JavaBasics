package basic;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment104_UnsupportedOperationExceptionprogram {

	public static void main(String[] args) {
		 List<String> l1=Collections.singletonList("apple");
		 System.out.println("SingleTonList:"+l1);
		 
		 Set<Integer> s1=Collections.singleton(150);
		 System.out.println("SingleTonSet:"+s1);
		 
		 Map<Character, String> m1=Collections.singletonMap('A', "Apple");
		 System.out.println("SingleTonMap:"+m1); 
		
		 try
		 {
			 l1.add("Banana");
		 }
		 catch(UnsupportedOperationException u1)
		 {
			 System.out.println("Cannot modify singleton List");
		 }
		 
		 try
		 {
			 s1.add(20);
		 }
		 catch(UnsupportedOperationException u1)
		 {
			 System.out.println("Cannot modify singleton set");
		 }
		 
		 try
		 {
			 m1.put('B',"Banana");
		 }
		 catch(UnsupportedOperationException u1)
		 {
			 System.out.println("Cannot modify singleton Map");
		 }

	}

}
