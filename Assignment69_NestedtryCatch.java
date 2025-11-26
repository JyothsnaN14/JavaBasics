package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment69_NestedtryCatch {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try{
			System.out.println("Enter 'a' value");
			int a=s1.nextInt();
			try
			{
				System.out.println("Enter string name");
				String str=s1.next();
				System.out.println(str.charAt(5));
				System.out.println(str.indexOf(null));
				
			}
			catch(NullPointerException e2)
			{
				System.out.println("Handled the exception2");
			}
			catch(StringIndexOutOfBoundsException e3)
			{
				System.out.println("Handled the exception3");
			}
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Handled the exception1");
		}
		s1.close();
		

	}

}
