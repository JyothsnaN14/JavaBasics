package basic;

interface A
{
	void add();
}

public class Assignment33_Implementskeyword implements A{

	public void add() {
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}
public static void main(String[] args) {
		
		Assignment33_Implementskeyword a1=new Assignment33_Implementskeyword();
		a1.add();
	}

	
	
}
