package utils;

import com.relevantcodes.extentreports.LogStatus;
import framework.Core;
import org.openqa.selenium.WebDriver;

public class BrowserIntraction {

    WebDriver driver = null;

    public BrowserIntraction() {
        driver = Core.getDriver();
    }

    public void loadUrl(String url) {
        try {
            driver.get(url);
            Core.logger.log(LogStatus.PASS, "URL Opened : " + url);
        } catch (Exception e) {
            Core.logger.log(LogStatus.FAIL, "URL not opened : " + url);
            Core.logger.log(LogStatus.FATAL, "Exception Occurred " + e.getMessage());
        }
    }


}
