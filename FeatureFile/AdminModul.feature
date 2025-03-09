Feature: This is Admin module feature scenarios


Scenario: Verify the Add user scenario in the admin page
    Given  User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   Navigaates to adim page and add a user in the application
    Then  Verify the added user in the grid
 
@searchuser    
Scenario: Verify the search user with valid details in the admin page
    Given User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   Navigates to Admin page and search the user with valid data
    Then  Verify the searched user on below grid in the admin page      
    
    @edituser
    Scenario: Verify the search and edit the user in the admin page
    Given User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   Navigates to Admin page and search the user with valid data
    And   Edit the searched user and change the details in the admin page
    Then  Verify the edited user on below grid in the admin page
    
    
    
          