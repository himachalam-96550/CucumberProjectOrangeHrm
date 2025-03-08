package HelperClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import StandardUtils.DriverFactory;

public class InputHelper extends DriverFactory{

	
	
	
	public void getElementAndEnterData(WebElement element, String text) {
		
		element.clear();
		element.sendKeys(text);
	}
	
	public void getElementAndClick(WebElement element) {
		
		element.click();
	}
	
   public void getElementAndEnterDataWithJs(WebElement element, String text) {
	
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].value = arguments[1];", element, text);
		
	}
   
   public void getElementAndClickWithJs(WebElement element) {
		
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click();", element);	
	}
}
