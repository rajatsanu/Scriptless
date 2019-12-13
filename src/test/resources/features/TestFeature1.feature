Feature: Test Feature 1

@rajat
Scenario: Test POC Scenario
  Given I open url "http://www.buybooksindia.com/"
   When I verify attribute value "title" of element "titleElement" in page "HomePage" should be "Buy Books India"
   When I click on "menuHowToOrder" in page "HomePage"
   When I enter value "Value for Text" on "inputSearchBook" in page "HowToOrderPage"

@rajat
Scenario: Test POC Scenario 1
    Given I open url "http://www.buybooksindia.com/"
    When I verify attribute value "title" of element "titleElement" in page "HomePage" should be "Buy Books India"
    When I click on "menuHowToOrder" in page "HomePage"
    When I enter value "Value for Text" on "inputSearchBook" in page "HowToOrderPage"
