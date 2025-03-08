package Pages;

import HelperClass.AlertHelper;
import HelperClass.AssertHelper;
import HelperClass.BrowserHelper;
import HelperClass.ButtonHelper;
import HelperClass.DropDownHelper;
import HelperClass.GeneralHelper;
import  HelperClass.InputHelper;
import HelperClass.JavaScriptHelper;
import StandardUtils.DriverFactory;

public class BaseObjects extends DriverFactory{

	
	
	 //public WebDriver  driver;
	 public static AlertHelper alertHelper = new AlertHelper();
	 public static AssertHelper assertHelper = new AssertHelper();
     public static ButtonHelper butonhelper = new ButtonHelper();
	 public static DropDownHelper dropdownhelper = new DropDownHelper();
	 public static GeneralHelper generalhelper = new GeneralHelper();
	 public static InputHelper inputhelper = new InputHelper();
	 public static JavaScriptHelper javascripthelper = new JavaScriptHelper();
	 public static DriverFactory  DriverFactory = new DriverFactory();
	 public static BrowserHelper  browserHelper = new BrowserHelper();
	 
}
