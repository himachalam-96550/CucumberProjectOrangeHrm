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
	
	//Scenario 2
	
	@When("Navigates to Admin page and search the user with valid data")
	public void navigates_to_admin_page_and_search_the_user_with_valid_data() throws InterruptedException {
	   
	    adminPage().navigateToAdminMenu();
		adminPage().searchUserWithValidDetails();
		
	}
	
	
	@Then("Verify the searched user on below grid in the admin page")
	public void verify_the_searched_user_on_below_grid_in_the_admin_page() {
	   
		adminPage().verifyTheSearchedUserInTheGrid();
	}
	
	//Scenario 3
	
	
	@When("Edit the searched user and change the details in the admin page")
	public void edit_the_searched_user_and_change_the_details_in_the_admin_page() throws InterruptedException {
	    
		adminPage().edituserinTheAdminPage();
	}
	@Then("Verify the edited user on below grid in the admin page")
	public void verify_the_edited_user_on_below_grid_in_the_admin_page() {
	   
		
	}
	
	
}
