@Search @BasicSearch
Feature: Registration, Login and MyAccount

  Background: Title of Background
    Given I am on the home page
   And I follow "Sign in" link

  #Scenario Outline Example
  @SmokeTesting
  Scenario: Verify Login Functionality
    When I fill in "input[id='email']" with "test@gmail.com"


  #Scenario Example
  Scenario: Verify Forgot Password Functionality
    When I follow "Forgot your password?" link
  
