package basic;

public class Assignment70_finallyblockprogram {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		String s1="Exception Handling";
		try {
			int c=a/b;
			System.out.println(c);
			System.out.println(s1.charAt(50));
			}
		catch(ArithmeticException e1)
		{
		
			System.out.println("Handled the exception1");
		}
		catch(StringIndexOutOfBoundsException e2)
		{
		
			System.out.println("Handled the exception2");
		}
		finally
		{
			System.out.println("finally will always execute");	
		}


	}

}
