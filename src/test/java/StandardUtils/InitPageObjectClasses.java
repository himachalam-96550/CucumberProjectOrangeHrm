package StandardUtils;


import Pages.AdminPage;
import Pages.LoginPage;

public class InitPageObjectClasses {

	
	
	
	 public LoginPage loginpage() {
		 
		 return new  LoginPage();
		 
	 }
	 
    public AdminPage adminPage() {
		 
		 return new  AdminPage();	 
	 }
}
