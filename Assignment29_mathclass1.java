package basic;

public class Assignment29_mathclass1 {

	public static void main(String[] args) {
		 int a=Math.addExact(13, 17);
		 System.out.println(a);
		 
		 long b=Math.addExact(1000000000000000l,200000000000000000l);
		 System.out.println(b);
		 
		 int a1=Math.subtractExact(15, 10);
		 System.out.println(a1);
		 
		 long b1=Math.subtractExact(10000000000l, 199999999999l);		 
		 System.out.println(b1);
		 
		 int c=Math.multiplyExact(15, 10);
		 System.out.println(c);	
		 
		double d= Math.min(22.3, 55.5);
		 System.out.println(d);	
	}

}
