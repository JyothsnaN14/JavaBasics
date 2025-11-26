package basic;
 class LogintoAmazon {
	 
	 static void LaunchBrowser() {
		 System.out.println("Able to launch browser successfully");
	 }	
	 void login()
		{
			System.out.println("enter username and password to login");	
		}
	
	}
	
	
public class InheritanceConcept extends LogintoAmazon
{
	static void logout() {
		System.out.println("User should be able to logout successfully");
		
	}
	public static void main(String[] args)
	{
		
		InheritanceConcept I1=new InheritanceConcept();
		LaunchBrowser();
		I1.login();
		logout();
		
		
	}
	
}


