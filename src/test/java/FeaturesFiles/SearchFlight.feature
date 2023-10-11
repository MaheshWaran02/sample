Feature: Login to FlyAway website and Search for flights

@Scenario1
    Scenario: I logout and againg login with this EmailAdress and password
  When I click On Login and SingUp button
  And I enter User Name "user2@user.com"
  And I enter Password "user2"
  And I click on loginbutton
  Then I valided Logoutbutton in my homepage
  
  @Scenario2
 Scenario: sadasd
    When I click on the Home button
    And I select the Departure city
    And I select the Destination city
    And I click the Submit button
    Then I validate the Booking Flight ID
   @Scenario3 
   Scenario: asdasda
  When I click on the Book Flight button
  And I validate the page
  And I click on the Complete Booking button
  Then I validate this page as well

