package basic;
interface Firstinterface
{
	void interfacemethod1();
}
interface Secondinterface extends Firstinterface 
{
	void interfacemethod2();
}
public class Assignment38_Interfaceconcept implements Secondinterface {

	public static void main(String[] args) {
		Assignment38_Interfaceconcept a1=new Assignment38_Interfaceconcept();
		a1.interfacemethod1();
		a1.interfacemethod2();
}
    public void interfacemethod1() {
		System.out.println("First interface method");
	}

	public void interfacemethod2() {
		System.out.println("Second interface method");
	}
}
