package basic;

import java.util.HashMap;
import java.util.Map;

public class Assignment97_MapKeySet {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"Ram");
		map.put(2,"Sita");
		map.put(3,"Jo");
		map.put(4,"Jyothsna");
		System.out.println(map);
		
		for(Integer i1:map.keySet())
		{
			System.out.println(i1);
		}
		
	}

}
