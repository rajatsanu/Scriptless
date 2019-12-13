package utils;

import com.relevantcodes.extentreports.LogStatus;
import framework.Core;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Assertion {

    WebDriver driver = null;

    public Assertion() {
        driver = Core.getDriver();
    }

    public void attributeShouldEqual(String attribute, String elementName, String pageName, String expectedText) {
        String actualValue = null ;
        try {
            actualValue = Core.PageScreens.get(pageName).getElement(elementName, driver).getAttribute(attribute);
            Assert.assertTrue("Attribute value " + attribute + " not matched. [Expected : " + expectedText + "] [Actual : " + actualValue + "]", actualValue.equalsIgnoreCase(expectedText));
            Core.logger.log(LogStatus.PASS, "Attribute value " + attribute + " matched. [Expected : " + expectedText + "] [Actual : " + actualValue + "]");
        }catch (Exception e){
            Core.logger.log(LogStatus.FAIL, "Attribute value " + attribute + " not matched. [Expected : " + expectedText + "] [Actual : " + actualValue + "]");
            Core.logger.log(LogStatus.FATAL, "Exception Occurred " + e.getMessage());
        }
    }

    public void attributeShouldEqual(String attribute, String elementName, String pageName, String expectedText, WebDriver driver1) {
        String actualValue = null ;
        try {
            actualValue = Core.PageScreens.get(pageName).getElement(elementName, driver1).getAttribute(attribute);
            Assert.assertTrue("Attribute value " + attribute + " not matched. [Expected : " + expectedText + "] [Actual : " + actualValue + "]", actualValue.equalsIgnoreCase(expectedText));
            Core.logger.log(LogStatus.PASS, "Attribute value " + attribute + " matched. [Expected : " + expectedText + "] [Actual : " + actualValue + "]");
        }catch (Exception e){
            Core.logger.log(LogStatus.FAIL, "Attribute value " + attribute + " not matched. [Expected : " + expectedText + "] [Actual : " + actualValue + "]");
            Core.logger.log(LogStatus.FATAL, "Exception Occurred " + e.getMessage());
        }
    }

    public void textShouldEqual(String elementName, String pageName, String expectedText) {
        String actualValue = Core.PageScreens.get(pageName).getElement(elementName, driver).getText();
        Assert.assertTrue("Text not matched. [Expected : " + expectedText + "] [Actual : " + actualValue + "]", actualValue.equalsIgnoreCase(expectedText));
    }

    public void textShouldEqual(String elementName, String pageName, String expectedText, WebDriver driver1) {
        String actualValue = Core.PageScreens.get(pageName).getElement(elementName, driver1).getText();
        Assert.assertTrue("Text not matched. [Expected : " + expectedText + "] [Actual : " + actualValue + "]", actualValue.equalsIgnoreCase(expectedText));
    }

    public void actualTextShouldContains(String elementName, String pageName, String expectedText) {
        String actualValue = Core.PageScreens.get(pageName).getElement(elementName, driver).getText();
        Assert.assertTrue("Text not matched. [Expected : " + expectedText + "] [Actual : " + actualValue + "]", actualValue.contains(expectedText));
    }

    public void actualTextShouldContains(String elementName, String pageName, String expectedText, WebDriver driver1) {
        String actualValue = Core.PageScreens.get(pageName).getElement(elementName, driver1).getText();
        Assert.assertTrue("Text not matched. [Expected : " + expectedText + "] [Actual : " + actualValue + "]", actualValue.contains(expectedText));
    }

    public void expectedTextShouldContains(String elementName, String pageName, String expectedText) {
        String actualValue = Core.PageScreens.get(pageName).getElement(elementName, driver).getText();
        Assert.assertTrue("Text not matched. [Expected : " + expectedText + "] [Actual : " + actualValue + "]", expectedText.contains(actualValue));
    }

    public void expectedTextShouldContains(String elementName, String pageName, String expectedText,WebDriver driver1) {
        String actualValue = Core.PageScreens.get(pageName).getElement(elementName, driver1).getText();
        Assert.assertTrue("Text not matched. [Expected : " + expectedText + "] [Actual : " + actualValue + "]", expectedText.contains(actualValue));
    }

    public void isDisplayed(String elementName, String pageName) {
        Assert.assertTrue("Element " + elementName + " not displayed.", Core.PageScreens.get(pageName).getElement(elementName, driver).isDisplayed());
    }

    public void isDisplayed(String elementName, String pageName, WebDriver driver1) {
        Assert.assertTrue("Element " + elementName + " not displayed.", Core.PageScreens.get(pageName).getElement(elementName, driver1).isDisplayed());
    }

    public void isEnable(String elementName, String pageName) {
        Assert.assertTrue("Element " + elementName + " not enable.", Core.PageScreens.get(pageName).getElement(elementName, driver).isEnabled());
    }

    public void isEnable(String elementName, String pageName, WebDriver driver1) {
        Assert.assertTrue("Element " + elementName + " not enable.", Core.PageScreens.get(pageName).getElement(elementName, driver1).isEnabled());
    }


}
