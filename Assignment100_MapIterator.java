package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment100_MapIterator {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"Ram");
		map.put(2,"Sita");
		map.put(3,"Jo");
		map.put(4,"Jyothsna");
		System.out.println(map);
		Set<Entry<Integer, String>> s=map.entrySet();
	Iterator<Entry<Integer, String>> i1=s.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
		
	}

}
