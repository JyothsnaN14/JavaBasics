package basic;
abstract class Abs
{
	abstract void add();
	void sub()
	{
		System.out.println("its a concrete method");
	}}
public class Assignment34_50percentAbstraction extends Abs{

	public static void main(String[] args) {
		
		Assignment34_50percentAbstraction a1=new Assignment34_50percentAbstraction();
		a1.sub();
		a1.add();
	}
       void add() {
    	   System.out.println("its a Abstract method");
		}

}
