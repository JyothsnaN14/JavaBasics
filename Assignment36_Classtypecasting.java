package basic;
class Parentclass_classtypecasting
{
	void add()
	{
		System.out.println("its a add method");
	}
}
public class Assignment36_Classtypecasting extends Parentclass_classtypecasting {
	void sub()
	{
		System.out.println("its a subtract method");
	}
	public static void main(String[] args) {
		Parentclass_classtypecasting p1=new Assignment36_Classtypecasting(); //implicit upcasting
		p1.add();
		Parentclass_classtypecasting p2=(Parentclass_classtypecasting) new Assignment36_Classtypecasting();//explicit upcasting
		p2.add();
		Assignment36_Classtypecasting a1= (Assignment36_Classtypecasting)p1;//explicit downcasting
		a1.add();
		a1.sub();	
	}
}
