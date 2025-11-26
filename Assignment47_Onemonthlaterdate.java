package basic;
import java.util.Date;
public class Assignment47_Onemonthlaterdate {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());
		
		Date d2=new Date(d1.getTime());
		String format=d2.toString();
		String month=format.substring(4,7);
		String date=format.substring(8,10);
		String year=format.substring(format.length()-4);
		String format1=month.concat(date).concat(year);
		System.out.println("Current date is "+format1);
		
		Date d3=new Date(d1.getTime()+(1000*60l*60*24*30));
		String format2=d3.toString();
		String month1=format2.substring(4,7);
		String date1=format2.substring(8,10);
		String year1=format2.substring(format2.length()-4);
		String format3=month1.concat(date1).concat(year1);
		System.out.println("After 1 month date is "+format3);
	}

}
