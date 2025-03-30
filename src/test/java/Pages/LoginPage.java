package Pages;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testData.ReadTestData;

public class LoginPage extends BaseObjects {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbtn;

	/*
	 * public void launchBrowser() { WebDriverManager.chromedriver().setup(); driver
	 * = new ChromeDriver(); driver.get(
	 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
	 */

	/*
	 * ReadTestData.Root testData = readTestData(); String username =
	 * testData.login_Details.userName; String pwd =
	 * testData.login_Details.password;
	 */
	ReadTestData.Root loginData = BaseObjects.readJsonFile("LoginTestData.json", ReadTestData.Root.class);

	public void login() {

		inputhelper.getElementAndEnterData(userName,loginData.login_Details.userName );
		inputhelper.getElementAndEnterData(password, loginData.login_Details.password);
		inputhelper.getElementAndClick(loginbtn);
	}

	public void verifyTheUrlOfTheApplication(String acturl) {

		String url = browserHelper.getUrl();
		assertHelper.assertTwoString(url, acturl);
	}

	public void terarDown() {

		driver.quit();
	}

}
