package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment57_Merge3Arrays {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter size of the Array1");
		int array1[]=new int[s1.nextInt()];
		System.out.println("Enter values in the Array1");
		for(int i=0; i<array1.length; i++)
		{
			array1[i]=s1.nextInt();
		}
		System.out.println("Human input Array1 is"+Arrays.toString(array1));
		
		System.out.println("Enter size of the Array2");
		int array2[]=new int[s1.nextInt()];
		System.out.println("Enter values in the Array2");
		for(int i=0; i<array2.length; i++)
		{
			array2[i]=s1.nextInt();
		}
		System.out.println("Human input Array2 is"+Arrays.toString(array2));
		
		System.out.println("Enter size of the Array3");
		int array3[]=new int[s1.nextInt()];
		System.out.println("Enter values in the Array3");
		for(int i=0; i<array3.length; i++)
		{
			array3[i]=s1.nextInt();
		}
		System.out.println("Human input Array3 is"+Arrays.toString(array3));
		
		int mergedarray[]=new int[array1.length+array2.length+array3.length];
		System.out.println("Size of merged Array is:"+(array1.length+array2.length+array3.length));
		for(int i=0; i<array1.length; i++)
				{
			mergedarray[i]=array1[i];
				}
		for(int j=0; j<array2.length; j++)
				{
			mergedarray[array1.length+j]=array2[j];
				}
		for(int k=0; k<array3.length; k++)
		{
			mergedarray[array1.length+array2.length+k]=array3[k];
		}
		System.out.println("Merged Array is"+Arrays.toString(mergedarray));
		s1.close();
	}

}
