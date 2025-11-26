package basic;

public class Assignment12_LogicalOperators {

	public static void main(String[] args) {
		int a=10,b=20;
		if(a<=10 && b>10) {
			System.out.println("Executed with and logical operator");
		}
		if(a>10 || b>10) {
			System.out.println("Executed with or logical operator");
		}
		if(!(a<10) && b>10) {
			System.out.println("Executed with and not logical operator");
		}
		if(a>10 ||!(b>100)) {
			System.out.println("Executed with or not logical operator");
		}
	}

}
