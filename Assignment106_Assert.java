package basic;

public class Assignment106_Assert {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		assert a<b:"Condition is not True";
		System.out.println(a+b);
		
		assert a>b:"Condition is not True";
		System.out.println(a*b);

	}

}
