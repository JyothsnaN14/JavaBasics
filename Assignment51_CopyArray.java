package basic;

import java.util.Arrays;

public class Assignment51_CopyArray {

	public static void main(String[] args) {
	
		int array1[]=new int[5];
		array1[0]=12;
		array1[1]=10;
		array1[2]=15;
		array1[3]=18;
		array1[4]=16;
		int array2[]=new int[array1.length];
		for(int i=0; i<array1.length; i++)
		{
			array2[i]=array1[i];
			
		}
		System.out.println("Copied Array is"+Arrays.toString(array2));

	}

}
