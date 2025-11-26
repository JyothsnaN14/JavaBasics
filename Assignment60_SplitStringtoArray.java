package basic;

import java.util.Arrays;

public class Assignment60_SplitStringtoArray {

public static void main(String[] args) {
String s1="jyO Is a Good girl";
String [] s2=s1.split(" ");
System.out.println("Splitting into Array based on space "+Arrays.toString(s2));
String [] s3=s1.split("[A-Z]",5);
System.out.println("Splitting into Array based on Capital letters "+Arrays.toString(s3));

	}

}
