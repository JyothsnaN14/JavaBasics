package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment99_MapEntrySet {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"Ram");
		map.put(2,"Sita");
		map.put(3,"Jo");
		map.put(4,"Jyothsna");
		System.out.println(map);
		
		for(Entry<Integer, String> e1:map.entrySet())
		{
			System.out.println(e1);
			
		}
	}

}
