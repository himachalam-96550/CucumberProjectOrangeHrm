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
	   adminPage().verifyTheNewJobTitleInTheAdminPage();
	}
	
	//Scenario 2
	
	@When("Navigates to Admin page and search the user with {string}")
	public void navigates_to_admin_page_and_search_the_user_with(String userName) throws InterruptedException {
		  adminPage().navigateToAdminMenu();
		  adminPage().searchUserWithValidDetails(userName);
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
	
	//Scenario 4
	@When("Delete the searched user in the admin page")
	public void delete_the_searched_user_in_the_admin_page() throws InterruptedException {
	    
		adminPage().deleteSearchedUser();
		
	}
	@Then("Verify the deleted user on below grid in the admin page")
	public void verify_the_deleted_user_on_below_grid_in_the_admin_page() {
	   
		
	}

	//Scenario 5
	
	@When("Navigates to jobs and add job role in the Admin page")
	public void navigates_to_jobs_and_add_job_role_in_the_admin_page() throws InterruptedException {
	    
		adminPage().navigateToAdminMenu();
		
		adminPage().addNewJobInTheAdminPage();
		
	}
	@Then("Verify the created job role on below grid in the jobs menu")
	public void verify_the_created_job_role_on_below_grid_in_the_jobs_menu() {
	   
		
	} 
	//Edit Scenario
    
	@When("Navigates to jobs and edit the job role created by the admin user")
	public void navigates_to_jobs_and_edit_the_job_role_created_by_the_admin_user() throws InterruptedException {
		adminPage().navigateToAdminMenu();
		adminPage().navigateToJobRoleMenu();
		adminPage().getRoleTitleAndClickEditButton();
	}
	
	@Then("Verify the edited job role on below grid in the jobs menu")
	public void verify_the_edited_job_role_on_below_grid_in_the_jobs_menu() {
	   
		adminPage().verifyTheEditedJobRoleInTheGrid();
	}
	//delete Scenario
	@When("Navigates to jobs and delete the job role created by the admin user")
	public void navigates_to_jobs_and_delete_the_job_role_created_by_the_admin_user() throws InterruptedException {
		adminPage().navigateToAdminMenu();
		adminPage().navigateToJobRoleMenu();
		adminPage().getRoleTitleAndClickDeleteButton();
		
	}
	@Then("Verify the edit job role on below grid in the jobs menu")
	public void verify_the_edit_job_role_on_below_grid_in_the_jobs_menu() {
	    
		
	}
	
	
	
	
	
	
	
}
