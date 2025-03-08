package HelperClass;

import StandardUtils.DriverFactory;

public class BrowserHelper extends DriverFactory {

	  public String getUrl() {
		
		  String url = driver.getCurrentUrl();
		  return url;
	  }
	
	
	
	
}
