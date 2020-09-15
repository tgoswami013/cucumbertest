@login @registration 
Feature: Registration, Login and MyAccount 

Background: Login Background 
	Given I am on the home page 
	And I follow "Sign in" link 
	
@SmokeTest1 
Scenario: Verify Login Functionality 
	When I fill in username with "goswami.tarun777@gmail.com" 
	And I fill in password with "123456" 
	And I click on Sign in button 
#	
	
@SmokeTest 
Scenario: Verify Forgot Password Functionality 
	When I follow "Forgot your password?" link 
	And I fill in email with "goswami.tarun777@gmail.com" 
	
	
	#  @ignore1
	#  Scenario: Verify Logout Functionality
	#    When I fill in username with "goswami.tarun777@gmail.com"
	#    And I fill in password with "123456"
	#    And I click on Sign in button
	
	
