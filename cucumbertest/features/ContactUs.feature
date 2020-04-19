Feature: Test Misc Functionality

  Background: 
    Given I am on the home page
    And I follow "Contact us" link

  @SmokeTest1
  Scenario: Fill in Email form
    When I fill in "input[id='email']" with "<email>"

	@SmokeTest1
  Scenario: Contact US 2
  When I fill in "input[id='email']" with "<email>"