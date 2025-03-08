Feature: This is a login Page feature of orangeHRM Application 
  
  
  Scenario: Verify the Login with valid credentials in the application
    Given  User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   User navigates to home page and verify the title of the application
    Then  Logged out the application and verify the login page title
    
    