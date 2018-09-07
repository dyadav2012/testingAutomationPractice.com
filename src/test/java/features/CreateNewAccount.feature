Feature: Being a user, I wants to create a new account

  Scenario: Create New Account.
    Given User logged into portal
    When user click on Sign In on home page
    And user input Email address on create an account section
    And user click on create an account
    And user select Title on YOUR PERSONAL INFORMATION section
    And user input First name on YOUR PERSONAL INFORMATION section
    And user input Last name on YOUR PERSONAL INFORMATION section
    And user verify Email on YOUR PERSONAL INFORMATION section
    And user input Password on YOUR PERSONAL INFORMATION section
    And user select Date of Birth on YOUR PERSONAL INFORMATION section
    And User check Sign up for our newsletter! on YOUR PERSONAL INFORMATION section
    And User check Receive special offers from our partners! on YOUR PERSONAL INFORMATION section
    And User input First name on YOUR Address section
    And User input Last name on YOUR Address section
    And User input Company on YOUR Address section
    And User input Last name on YOUR Address section
    And User input Company on YOUR Address section
    And User input Address on YOUR Address section
    And User input Address (Line 2) on YOUR Address section
    And User input City on YOUR Address section
    And User input State on YOUR Address section
    And User input Zip/Postal Code on YOUR Address section
    And User input Country on YOUR Address section
    And User input Mobile phone on YOUR Address section
    And User input Assign an address alias for future reference on YOUR Address section
    And user click on Register button
    Then User is able to see account created successfully message;

  
    
    