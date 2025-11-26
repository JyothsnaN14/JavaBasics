package basic;


import java.util.Date;
import java.util.Scanner;

public class Assignment46_Ageofaperson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year of birth");
		int Yearofbirth = sc.nextInt();
		System.out.println("Your Year of birth is: "+Yearofbirth);
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		String format=d2.toString();
		String Current_Year=format.substring(format.length()-4);
		System.out.println("Current year is: "+Current_Year);
		int CurrentYear=Integer.parseInt(Current_Year);
		int age = CurrentYear -Yearofbirth ;
		System.out.println("Your age is -->" +age);
		sc.close();
		
	}

}
