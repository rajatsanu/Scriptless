package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.InvocationTargetException;

public class Locator implements ILocator{
    public Locator(){}

    String typeOfLocator;
    String attributeValue;

    @Override
    public Locator setTypeOfLocator(String typeOfLocator) {
        this.typeOfLocator  = typeOfLocator;
        return this;
    }

    @Override
    public Locator setAttributeValue(String attributeValue) {
        this.attributeValue  = attributeValue;
        return this;
    }

    @Override
    public String getTypeOfLocator() {
        return this.typeOfLocator;
    }

    @Override
    public String getAttributeValue() {
        return this.attributeValue;
    }

    @Override
    public By getByLocator() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        By byLocator = null;
        if(this.typeOfLocator.equals("id")){
            byLocator =  By.id(this.attributeValue);
        }else if(this.typeOfLocator.equals("css")){
            byLocator =  By.cssSelector(this.attributeValue);
        }
        return byLocator;
    }

    @Override
    public WebElement getWebElement(WebDriver driver) {
        WebElement webElement = null;
        if(this.typeOfLocator.equals("id")){
            webElement =  driver.findElement(By.id(this.attributeValue));
        }else if(this.typeOfLocator.equals("css")){
            webElement =  driver.findElement(By.cssSelector(this.attributeValue));
        }else if(this.typeOfLocator.equals("xpath")){
            webElement =  driver.findElement(By.xpath(this.attributeValue));
        }
        return webElement;
    }

    public String toString() {
        return this.typeOfLocator  +" :  "+this.attributeValue;
    }
}
