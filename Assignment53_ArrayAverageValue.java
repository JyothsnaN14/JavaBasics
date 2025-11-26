package basic;

import java.util.Arrays;

public class Assignment53_ArrayAverageValue {

	public static void main(String[] args) {
		int array1[]=new int[5];
		array1[0]=12;
		array1[1]=10;
		array1[2]=15;
		array1[3]=18;
		array1[4]=16;
		double sum=0;
		for(int i=0; i<array1.length; i++)
		{
			sum=sum+array1[i];
			
		}
		double Average=sum/array1.length;
		System.out.println("Average value is "+Average);

	}

}
