package basic;

class Launchclass {
	 
	 static void LaunchBrowser() {
		 System.out.println("Able to launch browser successfully");
	 }	
	 void login()
		{
			System.out.println("enter username and password to login");	
		}
	
	}

public class Assignment_17_Hieraricallevel extends Launchclass{
	
	public static void main(String[] args) {
		LaunchBrowser();
		Assignment_17_Hieraricallevel a1=new Assignment_17_Hieraricallevel();
		a1.login();
	}

}
