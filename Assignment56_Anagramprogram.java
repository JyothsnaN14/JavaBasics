package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment56_Anagramprogram {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter two String names:");
		String name1=s1.next();
		String name2=s1.next();
		if(name1.length()!=(name2.length()))
		{
			System.out.println("Given Strings can never become Anagram");
		}
		else
		{
			char[] c1=name1.toCharArray();
			char[] c2=name2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Given Strings are Anagram");
			}
			else
			{
				System.out.println("Given Strings are not Anagram");
			}
		}
		s1.close();
	}

}
