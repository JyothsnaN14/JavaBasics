package basic;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		String s1="heart";
		String s2="earns";
		if(s1.length()!=s2.length())
			
		{
			System.out.println("Since two Strings length is not equal, they can never be Anagram");
			
			
		}
		else
		{
			
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2))
		{
			System.out.println("Given Strings are Anagram");
			
		}
		else
		{
			System.out.println("Given Strings are not Anagram");
			
		}


	}}

}
