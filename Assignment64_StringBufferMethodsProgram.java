package basic;

public class Assignment64_StringBufferMethodsProgram {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("String ");
		s1.append("Methods");
		System.out.println(s1);
		
		s1.insert(6, "Buffer");
		System.out.println(s1);
		
		s1.replace(6, 12, "Builder");
		System.out.println(s1);
		
		s1.delete(6, 13);
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);
		
		System.out.println(s1.capacity());
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(4));
		
		System.out.println(s1.lastIndexOf("t"));
		
		System.out.println(s1.indexOf("t"));
		
		s1.reverse();
		System.out.println(s1.substring(7));
		
		System.out.println(s1.substring(0, 6));
		System.out.println(s1.isEmpty());	
	}

}
