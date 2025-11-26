package basic;

public class Nonstaticmethod_Assignment23 {
	
	 void add(int a, int b)
		{
			
			int c=a+b;
			System.out.println(c);
		}


	public static void main(String[] args) {
		
		Nonstaticmethod_Assignment23 n1=new Nonstaticmethod_Assignment23();
		n1.add(50,1000);
	}

}
