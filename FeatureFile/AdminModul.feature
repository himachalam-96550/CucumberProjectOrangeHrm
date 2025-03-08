Feature: This is Admin module feature scenarios


Scenario: Verify the Add user scenario in the admin page
    Given  User launch browser and enter application url
    When  User enters valid user name and valid password and click login button
    And   Navigaates to adim page and add a user in the application
    Then  Verify the added user in the grid 