package StandardUtils;

import Pages.AdminPage;
import Pages.LoginPage;
import Pages.PIMPage;
import Pages.RecruitmentPage;

public class InitPageObjectClasses {

	public LoginPage loginpage() {

		return new LoginPage();

	}

	public AdminPage adminPage() {

		return new AdminPage();
	}

	public PIMPage pimpage() {

		return new PIMPage();
	}

	public RecruitmentPage recruitmentpage() {

		return new RecruitmentPage();
	}

}
