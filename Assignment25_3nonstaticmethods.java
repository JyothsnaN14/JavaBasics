package basic;
public class Assignment25_3nonstaticmethods {
	void add()
	{ int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
	void sub()
	{
		int a=10,b=20;
		int c=a-b;
		System.out.println(c);
	}

	void mul()
	{
		int a=10,b=20;
		int c=a*b;
		System.out.println(c);
	}

 public static void main(String[] args) {
	 Assignment25_3nonstaticmethods a1=new Assignment25_3nonstaticmethods();
	 a1.add();
	 a1.sub();
	 a1.mul();
	
}

}
