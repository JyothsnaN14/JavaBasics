package basic;

class MethodoverridingParent {
	
	 void add(int a, int b)
	{
		System.out.println("adding two int type variables");
	}}

public class Super_keyword_Assignment22 extends MethodoverridingParent{
	
	 void add(int a, int b)
		{
			
			int c=a+b;
			System.out.println(c);
		  super.add(50,60);
		}

	public static void main(String[] args) {
	
		Super_keyword_Assignment22 s1=new Super_keyword_Assignment22();
		s1.add(30,70);
	}

}
