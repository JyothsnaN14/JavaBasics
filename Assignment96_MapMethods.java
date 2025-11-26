package basic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment96_MapMethods {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"Ram");
		map.put(2,"Sita");
		map.put(3,"Jo");
		map.put(4,"Jyothsna");
		System.out.println(map);
		
		map.putIfAbsent(5, "Ram");
		System.out.println(map);
		
		Map<Integer,String> map1=new LinkedHashMap<Integer, String>();
		map1.put(6,"Bharatha");
		map1.put(7,"Lakshman");
		
		map1.putAll(map);
		System.out.println(map1);
		
		boolean b1=map.equals(map1);
		System.out.println(b1);
		
		map.remove(3);
		System.out.println(map);
		
		map1.remove(6,"Bharatha");
		System.out.println(map1);
		
		map1.replace(5, "Janaka");
		System.out.println(map1);
		
		map1.replace(3, "Jo", "Kowsalya");
		System.out.println(map1);
		
		boolean b2=map.containsKey(2);
		System.out.println(b2);
		
		boolean b3=map.containsValue("Jo");
		System.out.println(b3);
		
		System.out.println(map.size());
		System.out.println(map.get(4));
		
		
	
	
	}

}
