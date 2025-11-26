package basic;
public class Assignment27_4nonstaticparameterizedmethods {
    void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void sub(int a, int b)
	{
		int c=a-b;
		System.out.println(c);
	}

	void mul(int a, int b)
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
		Assignment27_4nonstaticparameterizedmethods a1=new Assignment27_4nonstaticparameterizedmethods();
		 a1.add(10,20);
		 a1.sub(50,60);
		 a1.mul(100,23);
		 a1.div(500,100);

	}

}
