package basic;

import java.util.HashMap;
import java.util.Map;

public class Assignment98_MapValues {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"Ram");
		map.put(2,"Sita");
		map.put(3,"Jo");
		map.put(4,"Jyothsna");
		System.out.println(map);
		
		for(String s1:map.values())
		{
			System.out.println(s1);
			
		}
	}

}
