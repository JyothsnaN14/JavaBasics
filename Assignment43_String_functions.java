package basic;

import java.util.Arrays;

public class Assignment43_String_functions {

	public static void main(String[] args) {
		String a="GrotechMinds";
		//length()
		int a1=a.length();
		System.out.println(a1);
		
		//toLowerCase()
		String a2=a.toLowerCase();
		System.out.println(a2);
		
		//toUpperCase()
		String a3=a.toUpperCase();
		System.out.println(a3);
		
		//equals()
		boolean b1=a2.equals(a3);
		System.out.println(b1);
		
		//equalsIgnoreCase()
		boolean b2=a2.equalsIgnoreCase(a3);
		System.out.println(b2);
		
		//charAt()
		char c1=a.charAt(7);
		System.out.println(c1);
		
		//concat()
		String s1=a.concat("Assignments");
		System.out.println(s1);
		
		//indexOf()
		int i1=s1.indexOf('s');
		System.out.println(i1);
		
		//contains()
		boolean b3=a.contains("tech");
		System.out.println(b3);
		
		//subString() with one parameter
		String s2=a.substring(7);
		System.out.println(s2);
		
		//subString() with two parameters
		String s3=a.substring(0,3);
		System.out.println(s3);
		
		//toCharArray()
		char[] c2=a.toCharArray();
		System.out.println(Arrays.toString(c2));
		
		//trim()
		String t="      Grotech   Minds   ";
		System.out.println(t.trim());
		
		//replace(char,char)
		String r1=a.replace('G','B');
		System.out.println(r1);
		
		//replace(String,String)
		String r2=a.replace("Minds","Brain");
		System.out.println(r2);
		
		//replaceAll()
		String s4="Grotechminds12345";
		System.out.println(s4.replaceAll("[0-9]", "a"));
		
		//matches()
		boolean b4=a.matches("............");
		System.out.println(b4);
		
		//split() with one parameter
		String[] sa=a.split("tech");
		System.out.println(Arrays.toString(sa));
		
		//split() with two parameters
		String[] sa1=s1.split("tech",2);
		System.out.println(Arrays.toString(sa1));
		
		String str="world";
		str=str.concat("wr");
		System.out.println(str);
		
	}

}
