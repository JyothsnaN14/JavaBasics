package basic;

public class Assignment37_PrimitivetypeCasting {

	public static void main(String[] args) {
		//int to long
		int a=10;
		long conv_a=a; //implicit widening
		System.out.println(conv_a);
		
		//short to double
		short s=5;
		double conv_s= (double)s;  //explicit widening
		System.out.println(conv_s);
		
		//float to byte
		float b=5.9876f;
		byte conv_b=(byte)b;  //explicit narrowing
		System.out.println(conv_b);
		
	

	}

}
