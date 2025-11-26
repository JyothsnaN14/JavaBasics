package basic;
interface Intface1
{
	void method1();
}
interface Intface2
{
	void method2();
}
public class Assignment35_Multipleinheritace implements Intface1,Intface2{
public void method2() {
    System.out.println("its a Abstract method2");
    }

	public void method1() {
	System.out.println("its a Abstract method1");
	}

	public static void main(String[] args) {
		Assignment35_Multipleinheritace a1=new Assignment35_Multipleinheritace();
		a1.method1();
		a1.method2();

	}



}
