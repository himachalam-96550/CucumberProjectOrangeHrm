package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperClass.BrowserHelper;


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
    
	public void login() {
		
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbtn.click();
		
	}
	
	public void verifyTheUrlOfTheApplication(String acturl) {
		
	    String url = browserHelper.getUrl();
		assertHelper.assertTwoString(url,acturl);
	 }

    public void terarDown() {
	  
	  driver.quit();
    }


}
