package basic;

import java.util.Date;

public class Assignment44_Printingdates {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());
		for(int i=0; i<30; i++)
		{
		Date d2=new Date(d1.getTime()-(1000*60*60*24*11)+(1000*60*60*24l*i));
		//System.out.println(d2);
		String format1=d2.toString();
		String month=format1.substring(4,7);
		String date=format1.substring(8,10);
		String year=format1.substring(format1.length()-4);
		String format=month.concat(date).concat(year);
		System.out.println(format);
		}
		
		

	}

}
