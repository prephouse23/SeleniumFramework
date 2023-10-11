package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;

public class BestBuyMainPage extends BaseMain{
    public BestBuyMainPage(WebDriver driver) {
        super(driver);
    }

    String domain = "https://www.bestbuy.com/";

    By suggestedItemSection = By.xpath("//ul[@class='c-carousel-list']");
    By searchField = By.id("gh-search-input");
    By searchButton = By.xpath("//button[@title='submit search']");

    public void openMainPage(){
        driver.get(domain);
    }

    public int suggestedItemSectionCount(){
        return driver.findElements(suggestedItemSection).size();
    }

    public void suggestedItemSectionScrollAndCount(){
        Assert.assertEquals(suggestedItemSectionCount(),1);
        for (int i = 2; i < 5; i++) {
            scrollBy(1600);
            waitForSuggestItemSection(i);
            Assert.assertEquals(suggestedItemSectionCount(), i);
        }
    }

    public void waitForSuggestItemSection(int expectedNumber){
        WebDriverWait sectionWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        sectionWait.until(ExpectedConditions.numberOfElementsToBe(suggestedItemSection,expectedNumber));
    }

    public void scrollToEndAndVerify4Sections(){
        scrollBy(50000);
        try {
            waitForSuggestItemSection(5);
            Assert.assertEquals(suggestedItemSectionCount(), 4); //will fail the test case if 5th element appears
        }catch(TimeoutException e){
            Assert.assertEquals(suggestedItemSectionCount(), 4); //will pass the test if 5th element didn't appear
        }
    }

    public void aa(){
        List<WebElement> hh = driver.findElements(suggestedItemSection);
        System.out.println(hh);
        Assert.assertTrue(hh.isEmpty());
    }

    public String substringLastName(String fullName){
        //FirstName_LastName
        //FirstName
        System.out.println(fullName);
        String result = fullName.substring(0,fullName.indexOf("s"));
        String h = "11";
        int number = Integer.parseInt(h);
        System.out.println(number+4);
        driver.get(domain);
        String className = "c-carousel-list";
        int bb = 1;
        String style = driver.findElement(By.xpath("//div[@class='pfc-img-fluid-bg bg-center bg-repeat-none bg-contain w-full'][" + bb + "]")).getAttribute("style");
        System.out.println(style);

        bb = 3;
        style = driver.findElement(By.xpath("//div[@class='big-image-" + bb + "]")).getAttribute("style");
        System.out.println(style);

        return result;
    }

    public void searchFor(String query){
        driver.findElement(searchField).sendKeys(query);
        driver.findElement(searchButton).click();
        
    }

    public List<String> fillTextFields(){
        // username(0), password(1), fullName, email(3), address
        List<String> actualValues = Arrays.asList("asdf", "dscasdc", "skadjc", "asdkjcnaskd", "acisdbciasd");
        driver.findElement(By.xpath("")).sendKeys(actualValues.get(0));//username
        driver.findElement(By.xpath("")).sendKeys(actualValues.get(1));//password
        driver.findElement(By.xpath("")).sendKeys(actualValues.get(2));
        return actualValues;

    }

    public Map<String, String> fillText(){
        Map<String,String> actualValues = new HashMap<>();
        actualValues.put("username", "akjsdnvlas");
        actualValues.put("password", "kdfjv nkwn");
        actualValues.put("fullName", "kdfjv nkwnkasjbdv");
        actualValues.put("email", "oasind@sn.dd");
        actualValues.put("address", "olkadf vl;ad");
        driver.findElement(By.xpath("")).sendKeys(actualValues.get("username"));
        driver.findElement(By.xpath("")).sendKeys(actualValues.get("password"));
        driver.findElement(By.xpath("")).sendKeys(actualValues.get("fullName"));
        driver.findElement(By.xpath("")).sendKeys(actualValues.get("email"));
        return actualValues;
    }


}
