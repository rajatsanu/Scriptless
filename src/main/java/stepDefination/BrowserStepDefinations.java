package stepDefination;

import cucumber.api.java.en.Given;
import framework.Core;
import org.openqa.selenium.WebDriver;
import utils.BrowserIntraction;

public class BrowserStepDefinations {

    BrowserIntraction browserIntraction = new BrowserIntraction();

    @Given("^I open url \"([^\"]*)\"$")
    public void i_open_url(String url) throws Throwable {
        browserIntraction.loadUrl(url);
    }


}
