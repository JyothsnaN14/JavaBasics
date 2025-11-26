package basic;

class Parent1{
	int a=10;
	static void parentclassMethod() {
		System.out.println("Single level Inheritance Program");
	}
}

public class SinglelevelInheritance extends Parent1{

	public static void main(String[] args) {
		
		SinglelevelInheritance s1=new SinglelevelInheritance();
		System.out.println(s1.a);
		parentclassMethod();
		
	}

}
