@chrome @firefox
Feature: Test Misc Functionality

  Background: 
    Given I am on the home page
    And I follow "Contact us" link

  @SmokeTest @chrome @firefox
  Scenario: Fill in Email form
    When I fill in "input[id='email']" with "<email>"

  @SmokeTest
  Scenario Outline: Contact US 2
    When I fill in "input[id='email']" with "<email>"
    When I fill in "input[id='email']" with "<email>"
    And I click on submit button

    Examples: 
      | email               | password   |
      | goswami.tarun77.com | Test@12345 |
