package basic;

import java.util.Arrays;

public class Assignment59_Count_Alpha_Numeric_SC_Spaces {

	public static void main(String[] args) {
		String s="Jyothsna@1234 gmail com";
		int alphacount=0;
		int numericcount=0;
		int spacecount=0;
		
		char[] c1=s.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0; i<c1.length; i++)
		{
			if(Character.isAlphabetic(c1[i]))
			{
				alphacount++;
				
			}
			if(Character.isDigit(c1[i]))
			{
				numericcount++;
				
			}
			if(Character.isWhitespace(c1[i]))
			{
				spacecount++;
				
			}
		}
		System.out.println("Number of alphabets are:"+alphacount);
		System.out.println("Number of numerics are:"+numericcount);
		System.out.println("Number of spaces are:"+spacecount);
		 int specialcharactercount=s.length()-(alphacount+numericcount+spacecount);
		System.out.println("Number of special characters are:"+specialcharactercount);
		
	}

}
