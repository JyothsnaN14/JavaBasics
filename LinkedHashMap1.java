package basic;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> l1=new LinkedHashMap<Integer, String>();
		l1.put(1,"Ram");
		l1.put(2,"Sita");
		l1.put(3,"Jo");
		l1.put(4,"Jyothsna");
		for(Integer i1:l1.keySet())
		{
			System.out.println(i1);
		}
		for(String s1:l1.values())
		{
			System.out.println(s1);
		}
		for(Entry<Integer, String> e1: l1.entrySet())
		{
			System.out.println(e1);
			
		}
		
		
		

	}

}
