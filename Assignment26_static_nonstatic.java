package basic;
public class Assignment26_static_nonstatic {
	static void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void sub(int a, int b)
	{
		int c=a-b;
		System.out.println(c);
	}
    static void mul(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	void div(int a, int b)
	{
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
	add(10,15);
	mul(20,13);
	Assignment26_static_nonstatic a1=new Assignment26_static_nonstatic();
	a1.sub(19,15);
	a1.div(500,100);
	}
}
