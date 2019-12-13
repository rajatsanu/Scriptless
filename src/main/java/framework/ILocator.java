package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.InvocationTargetException;

public interface ILocator {

    Locator setTypeOfLocator(String locatorType);
    Locator setAttributeValue(String attributeValue);
    String getTypeOfLocator();
    String getAttributeValue();
    By getByLocator() throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, IllegalAccessException;
    WebElement getWebElement(WebDriver driver) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, IllegalAccessException;

}
