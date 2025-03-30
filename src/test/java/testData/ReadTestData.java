package testData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReadTestData {

	
	// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
	// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
	/* ObjectMapper om = new ObjectMapper();
	Root root = om.readValue(myJsonString, Root.class); */
	public static class LoginDetails{
	    @JsonProperty("UserName") 
	    public String userName;
	    @JsonProperty("Password") 
	    public String password;
	}

	public static class Root{
	    @JsonProperty("Login_Details") 
	    public LoginDetails login_Details;
	}


	
	
}
