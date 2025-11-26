package basic;

public class ArithmeticOperators {

	static void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.print("Addition Result is");
		System.out.println(c);
		
	}
	static void subtract()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.print("Subtraction Result is");
		System.out.println(c);
		
	}
	static void multiply()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.print("Multiplication Result is");
		System.out.println(c);
		
	}
	static void division()
	{
		double a=10;
		double b=20;
		double c=a/b;
		System.out.print("Division Result is");
		System.out.println(c);
		
	}
	static void modulus()
	{
		int a=50;
		int b=10;
		int c=a%b;
		System.out.print("Modulus Result is");
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		
  add();
  subtract();
  multiply();
  division();
  modulus();
	}

}
