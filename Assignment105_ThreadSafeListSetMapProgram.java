package basic;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Assignment105_ThreadSafeListSetMapProgram {

	public static void main(String[] args) {
		 List<Integer> l1=new LinkedList<Integer>();
		 List<Integer> Syncl1=Collections.synchronizedList(l1);
		 Syncl1.add(25);
		 Syncl1.add(70);
		 Syncl1.add(25);
		 Syncl1.add(70);
		 Syncl1.add(25);
		 synchronized(Syncl1)
		 {
			 for(Integer i1:Syncl1)
			 {
				 System.out.println(i1);
			 }
		 }
		 
		 Set<String> s1=new HashSet<String>();
		 Set<String> Syncs1=Collections.synchronizedSet(s1);
		 Syncs1.add("Apple");
		 Syncs1.add("Banana");
		 Syncs1.add("Carrot");
		 synchronized(Syncs1)
		 {
			 for(String str:Syncs1)
			 {
				 System.out.println(str);
			 }
		 }
		 
		 Map<Character, String> m1=new HashMap<Character, String>();
		 Map<Character, String> syncm1=Collections.synchronizedMap(m1);
		 syncm1.put('P',"Pine Apple");
		 syncm1.put('C', "Custurd Apple");
		 
		 synchronized(syncm1) {
			 for(Entry<Character, String> e1:syncm1.entrySet())
			 {
				 System.out.println(e1); 
				
			 }
		 }
		 
	}

}
