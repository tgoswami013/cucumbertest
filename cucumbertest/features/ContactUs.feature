Feature: Test Misc Functionality

  Background: 
    Given I am on the home page
    And I follow "Contact us" link

  @contactus
  Scenario Outline: Fill in Email form
    When I fill in "input[id='email']" with "<email>"
    And I fill in "textarea[id='message']" with:
      """
      Dear <team>,
      
      Please share the status of my <order>.
      
      Thanks,
      <user>
      """

    Examples: 
      | email                     | team    | order  | user   |
      | goswami.tarun77@gmail.com | Support | O21234 | Tarun  |
      | manish.kumar@gmail.com    | Sales   | O31234 | Manish |
