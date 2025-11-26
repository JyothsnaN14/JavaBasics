package basic;
import java.util.Scanner;

public class AreaAndCircumference {
	
	Scanner s1=new Scanner(System.in);
	void circle_areaAndCircumference()
	{
	System.out.println("Enter radius of circle r=");
	double r=s1.nextDouble();
	System.out.println(r);
	double areaofcircle=Math.PI*r*r;
	System.out.println("Area of circle="+areaofcircle);
	double circumferenceofcircle=2*Math.PI*r;
	System.out.println("Circumference of circle="+circumferenceofcircle);
	}
	void rectangle_areaAndCircumference()
	{	
		System.out.println("Enter Length l=");
		int l=s1.nextInt();
		System.out.println(l);
		System.out.println("Enter Breadth b=");
		int b=s1.nextInt();
		System.out.println(b);
		int areaofRectangle=l*b;
		System.out.println("Area of Rectangle="+areaofRectangle);
		double circumferenceofRectangle=2*(l+b);
		System.out.println("Circumference of Rectangle="+circumferenceofRectangle);
	}
	void square_areaAndCircumference()
	{
	System.out.println("Enter side s=");
	int s=s1.nextInt();
	System.out.println(s);
	double areaofsquare=s*s;
	System.out.println("Area of square="+areaofsquare);
	double circumferenceofsquare=4*s;
	System.out.println("Circumference of Square="+circumferenceofsquare);
	}
	void triangle_areaAndCircumference()
	{	
		System.out.println("Enter Base b=");
		double b=s1.nextDouble();
		System.out.println(b);
		System.out.println("Enter Height h=");
		double h=s1.nextDouble();
		System.out.println(h);
		double areaoftriangle=(0.5)*(b*h);
		System.out.println("Area of Triangle="+areaoftriangle);
		System.out.println("Enter Side a=");
		double a=s1.nextDouble();
		System.out.println(a);
		System.out.println("Enter Side c=");
		double c=s1.nextDouble();
		System.out.println(c);
		double circumferenceoftriangle=a+b+c;
		System.out.println("Circumference of Triangle="+circumferenceoftriangle);
	}
	public static void main(String[] args)
	{
		AreaAndCircumference a1=new AreaAndCircumference();
		a1.circle_areaAndCircumference();
		a1.rectangle_areaAndCircumference();
	    a1.square_areaAndCircumference();
	    a1.triangle_areaAndCircumference();
	
	}
}
