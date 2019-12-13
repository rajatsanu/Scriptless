package stepDefination;

import cucumber.api.java.en.When;
import utils.Assertion;

public class AssertionStepDefinations {

    Assertion assertion = new Assertion();

    @When("^I verify attribute value \"([^\"]*)\" of element \"([^\"]*)\" in page \"([^\"]*)\" should be \"([^\"]*)\"$")
    public void i_verify_attribute_value_of_element_in_page_should_be(String attributeName, String elementName, String pageName, String expectedText) throws Throwable {
        assertion.attributeShouldEqual(attributeName,elementName,pageName,expectedText);
    }


}
