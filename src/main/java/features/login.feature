#@SmokeFeature 
Feature: Feauture to Test the Login
#@smoketest
  Scenario: Check Login is successfull
    Given user is in Login page
    When user enters username and password
    And clicks on login button
    Then user navigated to home page
    #Scenario Outline
#<username> 
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |