package StepDefinition;

import StandardUtils.DriverFactory;
import StandardUtils.InitPageObjectClasses;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends InitPageObjectClasses {
	
	
	
	
	
	
	@Given("User launch browser and enter application url")
	public void user_launch_browser_and_enter_application_url() {
	    
		DriverFactory.launchBrowser();
		
		
	}

	@When("User enters valid user name and valid password and click login button")
	public void user_enters_valid_user_name_and_valid_password_and_click_login_button() {
	    
		loginpage().login("Admin","admin123");
		
	}

	@When("User navigates to home page and verify the title of the application")
	public void user_navigates_to_home_page_and_verify_the_title_of_the_application() {
	 
		loginpage().verifyTheUrlOfTheApplication("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
	}

	@Then("Logged out the application and verify the login page title")
	public void logged_out_the_application_and_verify_the_login_page_title() {
	    
		loginpage().terarDown();
		
	}

}
