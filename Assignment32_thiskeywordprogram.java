package basic;

public class Assignment32_thiskeywordprogram {
	
	int height;
	double weight;
	String name;
	void thiskeywordMethod(int height, double weight, String name)
	{
		
		this.height=height;
		this.weight=weight;
		this.name=name;
	}

	public static void main(String[] args) {
		Assignment32_thiskeywordprogram a1=new Assignment32_thiskeywordprogram();
		a1.thiskeywordMethod(6,75.5,"xyz");
		System.out.println(a1.height);
		System.out.println(a1.weight);
		System.out.println(a1.name);
		

	}

}
