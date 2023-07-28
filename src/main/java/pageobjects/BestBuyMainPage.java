package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Logger;


public class BestBuyMainPage extends BaseMain{

    public BestBuyMainPage(WebDriver driver) {
        super(driver);
    }
    String domain = "http://bestbuy.com";
    By searchField = By.id("gh-search-input");
    By searchFieldSubmitButton = By.xpath("//button[@title='submit search']");

    public void openWebsite(){
        driver.get(domain);
    }

    public void searchFor(String query){
        driver.findElement(searchField).sendKeys(query);
        driver.findElement(searchFieldSubmitButton).click();
    }


    public int a(){
        return driver.findElements(By.xpath("//div[@class='pl-flex-carousel-slider']")).size();

    }

    public void w(int bb) {
        WebDriverWait aw = new WebDriverWait(driver, Duration.ofSeconds(10));
        aw.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='pl-flex-carousel-slider']"),bb));
    }

}
