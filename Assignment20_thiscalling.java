package basic;

public class Assignment20_thiscalling {
	Assignment20_thiscalling(int a)
	{
		this(5.5);
		 System.out.println("Int constructor");
		
	}
	Assignment20_thiscalling()
	{
		this("String");
		System.out.println("constructor");
	}
	
	Assignment20_thiscalling(String a)
	{
		System.out.println("String constructor");
	}
	Assignment20_thiscalling(double a)
	{
		this();
		System.out.println("double constructor");
	}

	public static void main(String[] args) {
		
    new Assignment20_thiscalling(10);
	
	}

}
