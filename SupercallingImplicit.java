package basic;

class parentclasscons{
	parentclasscons()
	{
		 //Super calling statement is implicitly present
		 System.out.println("Parent class constructor");
	}
}
class childclasscons1 extends parentclasscons {
childclasscons1()
	{
	super();  //Super calling statement is explicitly present
		 System.out.println("child class constructor1");
	}
}
public class SupercallingImplicit extends childclasscons1{
	SupercallingImplicit()
	{
		 System.out.println("child class constructor2");
	}
	public static void main(String[] args) {
		
		
		new SupercallingImplicit();
	}

}
