package utils;

import framework.Core;
import org.openqa.selenium.WebDriver;

public class Data {

    WebDriver driver = null;

    public Data() {
        driver = Core.getDriver();
    }

    public String onGetText(String elementName, String pageName){
        return Core.PageScreens.get(pageName).getElement(elementName,driver).getText();
    }

    public String onGetText(String elementName, String pageName, WebDriver driver1){
        return Core.PageScreens.get(pageName).getElement(elementName,driver1).getText();
    }



}
