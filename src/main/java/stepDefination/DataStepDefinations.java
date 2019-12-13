package stepDefination;

import cucumber.api.java.en.When;
import utils.Data;

import java.util.HashMap;

public class DataStepDefinations {

    Data data = new Data();
    HashMap<String, String> storeValue = new HashMap<>();

    @When("^I should get text value of element \"([^\"]*)\" from page \"([^\"]*)\" and store in \"([^\"]*)\"$")
    public void i_should_get_value_from_from_page_and_store_in(String elementName, String pageName, String variableName) throws Throwable {
        storeValue.put(variableName,data.onGetText(elementName,pageName));
    }


}
