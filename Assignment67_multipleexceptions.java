package basic;

public class Assignment67_multipleexceptions {
	
	public static void main(String[] args) throws NullPointerException,ArithmeticException,StringIndexOutOfBoundsException{
	
	int a=1, b=20;
	
	if (a>5)
	{
		throw new NullPointerException("first exception");
		
	}
	else if (b<10)
	{
		throw new ArithmeticException("second exception");
	}
	else if (a<5)
	{
		throw new StringIndexOutOfBoundsException("third exception");
	}
	else
	{
		System.out.println("Program with three exceptions");
	}
	}
	
	
}
