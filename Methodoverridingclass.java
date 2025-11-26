package basic;

 class Methodoverridingclass1 {
	
	 void add(int a, int b)
	{
		System.out.println("adding two int type variables");
	}}
 
 public class Methodoverridingclass extends Methodoverridingclass1 {
		
	 void add(int a, int b)
	{
		
		int c=a+b;
		System.out.println(c);
	
	}

	public static void main(String[] args) {
		
		Methodoverridingclass m1=new Methodoverridingclass();
		m1.add(10,10);
	}

}
