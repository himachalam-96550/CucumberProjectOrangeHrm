package HelperClass;

import org.testng.Assert;

import StandardUtils.DriverFactory;

public class AssertHelper  extends DriverFactory {

	
	
	
	
	
	 public void assertTwoString(String expstring,String actsting) {
		 
		 Assert.assertEquals(expstring, actsting);
	 }
	
}
