@Login @Registration
Feature: Registration, Login and MyAccount

  Background: Login Background
    Given I am on the home page
   And I follow "Sign in" link

  #Scenario Outline Example
  @SmokeTest
  Scenario: Verify Login Functionality
    When I fill in username with "goswami.tarun777@gmail.com"
    And I fill in password with "123456"
    And I click on Sign in button


  #Scenario Example
  Scenario: Verify Forgot Password Functionality
    When I follow "Forgot your password?" link
    And I fill in email address with "goswami.tarun777@gmail.com"
  
