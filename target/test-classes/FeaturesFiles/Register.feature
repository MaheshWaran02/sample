
@regarssion
Feature: User Registration

  Scenario Outline: Register a New Account
    When I click the Login button
    And I click the New Member button
    And I Enter E-Mail ID "<EMailid>"
    And I Enter Password "<Password>"
    And I Enter Confirm Password "<Cpassword>"
    And I Enter Name "<Name>"
    And I Enter Address "<address>"
    And I Enter City "<city>"
    And I Click Sign-up button
    Then Validate If I got This MSG "<MSG>"
    Then I Validate the Login Value using Database "<EMailid>"

    Examples: 
      | EMailid        | Password | Cpassword | Name  | address | city  | MSG                                |
      | user2@user.com | user2    | user2     | user2 | user2   | user2 | Login to continue checking flights |



