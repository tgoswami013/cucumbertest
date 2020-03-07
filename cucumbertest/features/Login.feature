Feature: Registration, Login and MyAccount

  Background: Title of Background
    Given I am on the home page
    And I follow "Sign in" link

  #Scenario Outline Example
  @scenariooutline
  Scenario Outline: Verify Login Functionality
    When I fill in "input[id='email']" with "<email>"
    And I fill in "input[id='passwd']" with "<password>"
    And I click on "button[id='SubmitLogin']"
    Then I should see heading "<heading>"

    Examples: 
      | email                       | password | heading        |
      | goswami.tarun77+7@gmail.com | test1234 | My account     |
      | wrongusername@gmail.com     | test     | Authentication |

  #Scenario Example
  @SmokeTest
  Scenario: Verify Forgot Password Functionality
    When I follow "Forgot your password?" link
    And I fill in "input[id='email']" with "goswami.tarun77+7@gmail.com"
    And I click on "button[type='submit'] span i"

#Scenario Example
  @RegressionTest
  Scenario: Verify Forgot Password Functionality
     When I fill in "input[id='email']" with "<email>"
    And I fill in "input[id='passwd']" with "<password>"
    And I click on "button[id='SubmitLogin']"
    
  #Data Table
  @datatable @vinay123
  Scenario: Verify Registration Functionlality
    When I fill in "input[id='email_create']" with "goswami.tarun77+77@gmail.com"
    And I click on "button[id='SubmitCreate']"
    Then I should see heading "Create an account"
    When I enter following details
      | Title      | Mr.     |
      | First Name | Tarun   |
      | Last Name  | Goswami |
      | Password   |  123456 |

  #Comparison of Data Tables
  @comparetable
  Scenario: Verify data response
    When I hit "user" api
    Then I gets following response
      | Username | Email                     |
      | tgoswami | goswami.tarun77@gmail.com |
      | mahuja   | manish.ahuja@gmail.com    |
      | ssharma  | sunil.sharma@gmail.com    |

  #Login with multiple users
  @loginusers
  Scenario: Verify Login with multiple users
    When I Logged in with users
      | UserName                    | Password |
      | goswami.tarun77+7@gmail.com | test1234 |
      | mahuja                      |   234567 |
      | ssharma                     |   975454 |
      
  #Login with multiple users
  @classobjects
  Scenario: Verify Login with multiple users
    When I Logged in with users using class objects
      | UserName                    | Password |
      | goswami.tarun77+7@gmail.com | test1234 |
      | mahuja                      |   234567 |
      | ssharma                     |   975454 |    
