package basic;
abstract class Abs80
{
	abstract void add();
	abstract void sub();
	abstract void mul();
	abstract void div();
	static void mod()
	{
		System.out.println("Modulus method");
	}
}

public class Assignment39_Abstraction80percent extends Abs80 {
public static void main(String[] args) {
	Assignment39_Abstraction80percent	a1=new Assignment39_Abstraction80percent();
	a1.add();
	a1.sub();
	a1.mul();
	a1.div();
	mod();
}
void add() {
	System.out.println("add method");	
		}
void sub() {
	System.out.println("subtract method");	
		}
void mul() {
	System.out.println("multiply method");	
		}
void div() {
	System.out.println("Modulus method");	
		}
}
