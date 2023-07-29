package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.plaf.PanelUI;
import java.util.logging.Logger;

public class BaseMain {

    public WebDriver driver;

    public BaseMain (WebDriver driver){
        this.driver = driver;
    }

    public void clickUsingXpath(String xpath, String elementName){
        driver.findElement(By.xpath(xpath)).click();
        System.out.println("Element: " + elementName + " was successfully clicked");
    }

    public void clickUsingXpath(By xpath, String elementName){
        driver.findElement(xpath).click();
    }

    public void clickUsingWebElement(WebElement element, String elementName){
        element.click();
        System.out.println("Element: " + elementName + " was successfully clicked");
    }

    public void typeUsingXpath(String xpath, String elementName, String value){
        driver.findElement(By.xpath(xpath)).sendKeys(value);
    }

    public void typeUsingXpath(By xpath, String elementName, String value){
        driver.findElement(xpath).sendKeys(value);
    }

    public void clickUsingXpathAfterWait(String xpath, String elementName) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpath)).click();
        System.out.println("Element: " + elementName + " was successfully clicked");
    }

    public void scrollBy(int pixels){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }


}
