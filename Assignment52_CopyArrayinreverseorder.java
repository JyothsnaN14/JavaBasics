package basic;

import java.util.Arrays;

public class Assignment52_CopyArrayinreverseorder {

	public static void main(String[] args) {
		int array1[]=new int[5];
		array1[0]=12;
		array1[1]=10;
		array1[2]=15;
		array1[3]=18;
		array1[4]=16;
		int array2[]=new int[array1.length];
		for(int i=0, j=array1.length-1; i<array1.length; i++,j--)
		{
			
				array2[j]=array1[i];
			
		}
		System.out.println("Reverse Array is"+Arrays.toString(array2));
	}

}
