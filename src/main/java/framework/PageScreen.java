package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class PageScreen {

    PageScreen pageScreen;
    String pageName;
    Map<String, Locator> locator;


    public PageScreen(){}

    public PageScreen setPageName(String pageName){
        this.pageName = pageName;
        this.pageScreen = new PageScreen();
        return this.pageScreen;
    }

    public PageScreen setLocator(String givenLocatorName, Locator locate){
        if(locate.typeOfLocator != null && !locator.containsKey(givenLocatorName)){
            locator.put(givenLocatorName, new Locator().setTypeOfLocator(locate.typeOfLocator).setAttributeValue(locate.attributeValue));
        }
        return this.pageScreen;
    }

    public Locator getLocator(String givenLocatorName){
        Locator locate = null;
        if(locator.containsKey(givenLocatorName)){
            locate = locator.get(givenLocatorName);
        }
        return locate;
    }

    public WebElement getElement(String attribute, WebDriver driver) {
        Locator locate = null;

        if(locator.containsKey(attribute)){
            locate = locator.get(attribute);
        }
        return locate.getWebElement(driver);
    }

    public PageScreen getPage(String pageName){
        return this.pageScreen;
    }

    public String getPageName(){
        return this.pageName;
    }
}
