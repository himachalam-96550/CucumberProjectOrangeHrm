package StepDefinition;

import StandardUtils.InitPageObjectClasses;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RecruitmentSteps  extends InitPageObjectClasses {

	
	@When("User navigates to the recruitment page")
	public void user_navigates_to_the_recruitment_page() {
	    
		recruitmentpage().navigateToRecruitmentPage();
		
	}
	@When("Create a new vacancy role in the recruitment page")
	public void create_a_new_vacancy_role_in_the_recruitment_page() {
	   
		recruitmentpage().AddNewVacancyInrecruitmentMenu();
		
	}
	@Then("Verify the newly created role in the recruitment page under vacancy section")
	public void verify_the_newly_created_role_in_the_recruitment_page_under_vacancy_section() {
	   
		recruitmentpage().verifyTheCreatedVacancyInTheGrid();
		
	}
	
	//Edit Scenario
	@When("Search and edit the created vacancy in the vacancy menu")
	public void search_and_edit_the_created_vacancy_in_the_vacancy_menu() {
	    
		
	}
	@Then("Verify the edited vacancy in the vacancy page")
	public void verify_the_edited_vacancy_in_the_vacancy_page() {
	   
		
	}
	
	
	
}
