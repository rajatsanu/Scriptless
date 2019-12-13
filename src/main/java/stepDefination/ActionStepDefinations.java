package stepDefination;

import cucumber.api.java.en.When;
import utils.Actions;

public class ActionStepDefinations {

    Actions actions = new Actions();

    @When("^I click on \"([^\"]*)\" in page \"([^\"]*)\"$")
    public void i_click_on_in_page(String elementName, String pageName) throws Throwable {
        actions.onClick(elementName,pageName);
    }

    @When("^I enter value \"([^\"]*)\" on \"([^\"]*)\" in page \"([^\"]*)\"$")
    public void i_enter_value_on_in_page(String value, String elementName, String pageName) throws Throwable {
        actions.onSendKey(elementName,pageName,value);
    }


}
