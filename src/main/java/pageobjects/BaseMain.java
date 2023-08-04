package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class BaseMain {

    public WebDriver driver;
    public Logger log;

    public BaseMain (WebDriver driver){
        this.driver = driver;
//        this.log = log;

    }

    public void scrollBy(int pixels){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }

    public void clickUsingXpath(String xpath, String elementName){
        driver.findElement(By.xpath(xpath)).click();
        System.out.println("Element: " + elementName + " was clicked successfully");

    }

}
