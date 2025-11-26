package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment58_CommonElements {

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
		s1.close();
		
		for(int i=0; i<array1.length; i++)
		{
			for(int j=0; j<array2.length; j++)
			{
				for(int k=0; k<array3.length; k++)
				{

					if((array1[i]==array2[j])&&(array2[j]==array3[k]))
					{
					
						System.out.println(array3[k]);
					}
				}
				}
			}
		}
	}

		

	


