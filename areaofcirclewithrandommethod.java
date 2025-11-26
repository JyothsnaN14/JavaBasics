package basic;

public class areaofcirclewithrandommethod {

	public static void main(String[] args) {
		for(int i=1; i<=50; i++)
		{
			double r=Math.random();
			System.out.println(i+".Radius r="+r);
			double areaofcircle=Math.PI*r*r;
			System.out.println(i+".Area of circle="+areaofcircle);
		}

	}

}
