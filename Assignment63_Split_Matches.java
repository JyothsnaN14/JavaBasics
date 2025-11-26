package basic;

import java.util.Arrays;

public class Assignment63_Split_Matches {

	public static void main(String[] args) {
		String s1="Automation Testing Is My Passion";
		String [] s2=s1.split(" ");
		System.out.println("Splitting into Array based on space "+Arrays.toString(s2));
		String [] s3=s1.split("[A-Z]",5);
System.out.println("Splitting into Array based on capital letters"+Arrays.toString(s3));
		boolean b1=s1.matches("............................");
		System.out.println(b1);
		boolean b2=s1.matches("A(.*)");
		System.out.println(b2);
		boolean b3=s1.matches("(.*)Passion(.*)");
		System.out.println(b3);
		boolean b4=s1.matches("(.*)ion");
		System.out.println(b4);
	}

}
