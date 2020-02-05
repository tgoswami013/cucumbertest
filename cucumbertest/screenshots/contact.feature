@contactus
Feature: As an Ecommerce store owner,
  I want customer are able to contact me in case of any query

  Scenario: Fill in Contact Us form
    Given I am on the home page
    And I follow "Contact us"
    When I fill "email address" with "goswami.tarun77@gmail.com"
    And I fill in "message" with:
      """
      Dear,
      
      Its been more than a week, I have not received my order.
      
      Thanks,
      Tarun Goswami
      """