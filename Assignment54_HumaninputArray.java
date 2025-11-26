package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment54_HumaninputArray {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter size of the Array");
		int array[]=new int[s1.nextInt()];
		System.out.println("Enter values in the Array");
		for(int i=0; i<array.length; i++)
		{
			array[i]=s1.nextInt();
		}
		System.out.println("Human input Array is"+Arrays.toString(array));
		s1.close();

	}

}
