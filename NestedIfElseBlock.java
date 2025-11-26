package basic;

public class NestedIfElseBlock {
	static int age=40; 
	static char Gender='F';

	public static void main(String[] args) {
		
		if(age<1)
		{
			System.out.println("you are not allowed into Swimming pool");
		}
		else if(age<10)
		{
		
			System.out.println("you are allowed into Kids pool");
		}
		else if(age<50)
		{
			 
			if(Gender=='M')
			 {
			System.out.println("you are allowed into Mens Swimming pool");
			 }
			 else
			 {
				System.out.println("you are allowed into Women Swimming pool");
			}
				 
		}
		else 
		{
			System.out.println("No Entry");
		}
		
		}

	}


