package basic;

class Loginclass {
	 
	 static void LaunchBrowser() {
		 System.out.println("Able to launch browser successfully");
	 }	
	 void login()
		{
			System.out.println("enter username and password to login");	
		}
	
	}
class InheritanceConceptmultilevel extends LogintoAmazon
{
	static void logout() {
		System.out.println("User should be able to logout successfully");
		
	}}

public class Assignment16 extends InheritanceConceptmultilevel{

	public static void main(String[] args) {
		Assignment16 a1=new Assignment16();
		LaunchBrowser();
		a1.login();
		logout();
		}}
