Feature: Test Feature 1


Scenario: Sample Feature


  # ACTION
  When I click on "saveBtn" in page "HomePage1"
  When I enter value "Value for Text" on "inputUserName" in page "HomePage1"


  #ASSERTION
  When I verify attribute value "title" of element "titleElement" in page "HomePage" should be "Buy Books India"




  #BROWSERINTRACTION
  Given I open url "http://www.buybooksindia.com/"





  #STOREVALUE
  When I should get text value of element "lblHeader" from page "HomePage1" and store in "variableName"
