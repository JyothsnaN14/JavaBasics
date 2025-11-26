package basic;

import java.util.Scanner;

public class Assignment49_UserInputSwitchCase {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		switch(s1.nextInt())
		 {
		 case 1: System.out.println("Launch chrome browser");
		 break;
		 case 2: System.out.println("Launch edge browser");
		 break;
		 case 3: System.out.println("Launch firefox browser");
		 break;
		 case 4: System.out.println("Launch Internet explorer");
		// break;
		 case 5: System.out.println("Launch opera mini");
		 break;
		
		 }
		 s1.close();
	}

}
