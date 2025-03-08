package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BaseObjects {

	public AdminPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul//span[.='Admin']")
	private WebElement adminMenu;

	@FindBy(xpath = "//button[normalize-space(.)='Add']")
	private WebElement addUser_btn;

	@FindBy(xpath = "(//div[.='-- Select --'])[1]")
	private WebElement userrole_dd;

	@FindBy(xpath = "//div[@role='listbox']/div/span[.='Admin']")
	private WebElement userrole_dd_option;

	@FindBy(xpath = "//div[@role='listbox']/div[position()>1]/span")
	private List<WebElement> userrole_dd_options;

	@FindBy(xpath = "//label[.='Status']/following::div[3]")
	private WebElement status_dd;

	@FindBy(xpath = "//div[@role='listbox']/div/span")
	private List<WebElement> statusdd_options;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement password;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement confirm_password;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employee_name;

	@FindBy(xpath = "//label[.='Username']/following::input[1]")
	private WebElement user_name;

	@FindBy(xpath = "//button[normalize-space(.)='Save']")
	private WebElement save_btn;

	/*
	 * @FindBy(xpath = "") private WebElement ;
	 */

	public void navigateToAdminMenu() {

		inputhelper.getElementAndClick(adminMenu);
	}

	public void AddUserInApplication() throws InterruptedException {

		
			Thread.sleep(3000);
		
		

		inputhelper.getElementAndClick(addUser_btn);
		
		
		
		inputhelper.getElementAndClick(user_name);
		inputhelper.getElementAndEnterData(user_name, "suamn");
		Thread.sleep(1000);
		inputhelper.getElementAndClick(password);
		inputhelper.getElementAndEnterData(password, "Auamn@1122");
		Thread.sleep(1000);
		inputhelper.getElementAndClick(confirm_password);
		inputhelper.getElementAndEnterData(confirm_password, "Auamn@1122");
		
		inputhelper.getElementAndClick(userrole_dd);
		WebElement ddel1 = driver.findElement(By.xpath("(//span[.='Admin'])[3]"));
		inputhelper.getElementAndClick(ddel1);
		
		inputhelper.getElementAndClick(status_dd);
		WebElement ddel2 = driver.findElement(By.xpath("//span[.='Enabled']"));
		inputhelper.getElementAndClick(ddel2);
		
		inputhelper.getElementAndClick(employee_name);
		inputhelper.getElementAndEnterData(employee_name, "a");
		
		Thread.sleep(2000);

        // Press Down Arrow key
		employee_name.sendKeys(Keys.ARROW_DOWN);

        // Wait for selection
        Thread.sleep(1000);

        // Press Enter
        employee_name.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		
		//dropdownhelper.selectDropDownByText(userrole_dd_options, "Admin");
		
		/*
		 * inputhelper.getElementAndClick(status_dd);
		 * dropdownhelper.selectDropDownByText(userrole_dd_options, "Enabled");
		 */
		
		
		
		
	}
}
