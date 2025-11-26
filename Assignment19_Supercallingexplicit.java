package basic;

class parentclasscons1 extends childclass{
	parentclasscons1(int a)
	{
		 super("JO");
		 System.out.println("it is int type constructor");
	}}
	class childclass 
	{
		childclass(String a){
		 
		 System.out.println("it is string type constructor");
	}
}

public class Assignment19_Supercallingexplicit extends parentclasscons1 {
	
	Assignment19_Supercallingexplicit(double a){
		super(15);
		 System.out.println("it is double type constructor");
		
	}
	public static void main(String[] args) {
		
  new Assignment19_Supercallingexplicit(5.5);
	}

}
