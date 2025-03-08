package HelperClass;

import java.util.List;

import org.openqa.selenium.WebElement;

import StandardUtils.DriverFactory;

public class DropDownHelper extends DriverFactory{

	
	public void selectDropDownByText(List<WebElement> elements , String text) {
		
		for(WebElement option : elements) {
			
			String elemtext = option.getText();
			
			  if(elemtext.equals(text)) {
				  
				  option.click();
			  }
			}

	}
	
}
