package StepDefinition;

import StandardUtils.InitPageObjectClasses;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminSteps extends InitPageObjectClasses {

	
	
	
	@When("Navigaates to adim page and add a user in the application")
	public void navigaates_to_adim_page_and_add_a_user_in_the_application() {
	 
		adminPage().navigateToAdminMenu();  
		
	}

	@Then("Verify the added user in the grid")
	public void verify_the_added_user_in_the_grid() throws InterruptedException {
	    
	   adminPage().AddUserInApplication();
	}
	
	
	
	
	
	
}
