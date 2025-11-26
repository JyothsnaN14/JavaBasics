package basic;
import java.util.Scanner;

public class Assignment45_String_Reverse {
public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the String name:");
		String name=s1.next();
		String reversename="";
		for(int i=name.length()-1; i>=0;i--)
		{
			char c1=name.charAt(i);
			 reversename=reversename+c1;
		}
		System.out.println("Reverse name is:"+reversename);
	s1.close();
	}}
