package utils;

import com.relevantcodes.extentreports.LogStatus;
import framework.Core;
import org.openqa.selenium.WebDriver;

public class Actions {

    WebDriver driver = null;

    public Actions() {
        driver = Core.getDriver();
    }

    public void onClick(String elementName, String pageName){
        try {
            Core.PageScreens.get(pageName).getElement(elementName, driver).click();
            Core.logger.log(LogStatus.PASS, "I click on " + elementName + " in page " + pageName);
        }catch (Exception e){
            Core.logger.log(LogStatus.FAIL, "I am not able click on " + elementName + " in page " + pageName);
            Core.logger.log(LogStatus.FATAL, "Exception Occurred " + e.getMessage());
        }
    }

    public void onClick(String elementName, String pageName, WebDriver driver1){
        try {
            Core.PageScreens.get(pageName).getElement(elementName,driver1).click();
            Core.logger.log(LogStatus.PASS, "I click on " + elementName + " in page " + pageName);
        }catch (Exception e){
            Core.logger.log(LogStatus.FAIL, "I am not able click on " + elementName + " in page " + pageName);
            Core.logger.log(LogStatus.FATAL, "Exception Occurred " + e.getMessage());
        }
    }

    public void onSendKey(String elementName, String pageName, String value){
        try {
            Core.PageScreens.get(pageName).getElement(elementName,driver).sendKeys(value);
            Core.logger.log(LogStatus.PASS, "I entered " + value + " on " + elementName + " in page " + pageName);
        }catch (Exception e){
            Core.logger.log(LogStatus.FAIL, "I am not able to entered " + value + " on " + elementName + " in page " + pageName);
            Core.logger.log(LogStatus.FATAL, "Exception Occurred " + e.getMessage());
        }
    }

    public void onSendKey(String elementName, String pageName, String value,WebDriver driver1){
        try {
            Core.PageScreens.get(pageName).getElement(elementName,driver1).sendKeys(value);
            Core.logger.log(LogStatus.PASS, "I entered " + value + " on " + elementName + " in page " + pageName);
        }catch (Exception e){
            Core.logger.log(LogStatus.FAIL, "I am not able to entered " + value + " on " + elementName + " in page " + pageName);
            Core.logger.log(LogStatus.FATAL, "Exception Occurred " + e.getMessage());
        }
    }

    public void onClear(String elementName, String pageName){
        try {
            Core.PageScreens.get(pageName).getElement(elementName,driver).clear();
            Core.logger.log(LogStatus.PASS, "I cleared " + elementName + " in page " + pageName);
        }catch (Exception e){
            Core.logger.log(LogStatus.FAIL, "I am not able to cleared " + elementName + " in page " + pageName);
            Core.logger.log(LogStatus.FATAL, "Exception Occurred " + e.getMessage());
        }
    }

    public void onClear(String elementName, String pageName, WebDriver driver1){
        try {
            Core.PageScreens.get(pageName).getElement(elementName,driver1).clear();
            Core.logger.log(LogStatus.PASS, "I cleared " + elementName + " in page " + pageName);
        }catch (Exception e){
            Core.logger.log(LogStatus.FAIL, "I am not able to cleared " + elementName + " in page " + pageName);
            Core.logger.log(LogStatus.FATAL, "Exception Occurred " + e.getMessage());
        }
    }




}
