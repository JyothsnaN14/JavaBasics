package basic;

public class buffer_builder {
	public static void main(String[] args) {
		StringBuffer a1=new StringBuffer("automation");
		a1.append("new");	
		System.out.println(a1);
		a1.insert(10, " ");
		System.out.println(a1);
		a1.replace(5,8,"Manual");
		System.out.println(a1);
		a1.delete(8,10);
		System.out.println(a1);
		
		System.out.println(a1.capacity());
		
		
	}


}
