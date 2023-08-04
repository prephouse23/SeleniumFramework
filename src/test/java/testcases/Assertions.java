package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Assertions extends BaseTest{

    //Assertion = validation
    // 2 types: Hard Assert and Soft Assert

    //HardAssert - exit the test immediately after Assert Fail


    private String bestBuyUrl = "https://www.bestbuy.com/site/health-wellness/health-wellness-solutions/pcmcat1603917798858.c?id=pcmcat1603917798858";
    private int expectedCategoryListSize = 4;
    private int actualCategoryListSize;

    private String expectedTitleBlock1;
    private String expectedTitleBlock2 = "Eat well";
    private String expectedTitleBlock3 = "Create a healthy environment";
    private String actualTitleBlock1;
    private String actualTitleBlock2;
    private String actualTitleBlock3;

    int blockNumber = 3;

    private String locatorBlock = "//div[@class='sale-event-grid-wrapper rows-1']//div[@class='se-item dark-theme'][" + blockNumber + "]//div[@class='se-item-text']//a";
    private String locatorBlock3 = "//div[@class='sale-event-grid-wrapper rows-1']//div[@class='se-item dark-theme'][3]//div[@class='se-item-text']//a";
    private String locatorBlock2 = "//div[@class='sale-event-grid-wrapper rows-1']//div[@class='se-item dark-theme'][2]//div[@class='se-item-text']//a";
    private String locatorBlock1 = "//div[@class='sale-event-grid-wrapper rows-1']//div[@class='se-item dark-theme'][1]//div[@class='se-item-text']//a";
    private String loadedPageURL;

    String expectedTitle = "Quizzes";
    String actualTitle;
    String menuList = "//body/div[1]/div[2]/div[1]/nav[1]/ul[1]//li";
    String menuItem = "//div[contains(text(),'Development')]";
    String anotherMenuItem = "//div[contains(text(),'Project Management')]";
    int listSizeActual;
    int listSizeExpected = 6;
    boolean expectedMenuItem = true;
    boolean actualMenuItem;
    boolean expectedAnotherMenuItem = false;
    boolean actualAnotherMenuItem;

    @Test
    public void dropdown() {
        driver.get("https://test.my-fork.com");
        actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle, "titles are different");

        List<WebElement> elementList = driver.findElements(By.xpath("menuList"));
        listSizeActual = elementList.size();
        softAssert.assertNotEquals(listSizeActual, listSizeExpected, "list size is six");

        actualMenuItem = driver.findElement(By.xpath(menuItem)).isDisplayed();
        softAssert.assertEquals(actualMenuItem, expectedMenuItem);
        System.out.println("Menu item is not Development");

        actualAnotherMenuItem = driver.findElement(By.xpath(anotherMenuItem)).isDisplayed();
        softAssert.assertEquals(actualAnotherMenuItem, expectedAnotherMenuItem);
        System.out.println("Menu item is Project Management");

        softAssert.assertAll();
    }

        @Test( priority = 2, groups = "assert")
    public void hardAssert(){
        driver.get(bestBuyUrl);

        List<WebElement> categories = driver.findElements(By.xpath("//div[@class='sale-event-grid-wrapper rows-1']//div[@class='se-item-text']//a"));
        actualCategoryListSize = categories.size();

        for (WebElement element :categories){
            //System.out.println(element.getText());
        }

        expectedTitleBlock1 = "Stay fit and be well";
        actualTitleBlock1 = driver.findElement(By.xpath(locatorBlock1)).getText();

        Assert.assertEquals(actualCategoryListSize, expectedCategoryListSize); //fail
        System.out.println("after first asser");
        Assert.assertEquals(actualTitleBlock1, expectedTitleBlock1); //fail

        actualTitleBlock2 = driver.findElement(By.xpath(locatorBlock2)).getText();
        actualTitleBlock3 = driver.findElement(By.xpath(locatorBlock3)).getText();

    }

    @Test (priority = 1, groups = "assert")
    public void softAsserts(){

        driver.get(bestBuyUrl);
        List<WebElement> categories = driver.findElements(By.xpath("//div[@class='sale-event-grid-wrapper rows-1']//div[@class='se-item-text']//a"));
        actualCategoryListSize = categories.size();

        expectedTitleBlock1 = "Stay fit and be well";
        actualTitleBlock1 = driver.findElement(By.xpath(locatorBlock1)).getText();
        actualTitleBlock2 = driver.findElement(By.xpath(locatorBlock2)).getText();
        actualTitleBlock3 = driver.findElement(By.xpath(locatorBlock3)).getText();
        loadedPageURL = driver.getCurrentUrl();
        boolean serviceSite = loadedPageURL.contains("/site22/"); //false


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(serviceSite);
        Assert.assertEquals(actualCategoryListSize, expectedCategoryListSize); //int 4 vs 6 - fail
        softAssert.assertEquals(actualTitleBlock1, expectedTitleBlock1); //strings - fail
        softAssert.assertNotEquals(actualTitleBlock2, expectedTitleBlock2, "The title for block 2 doesn't match"); // fail
        softAssert.assertTrue(serviceSite, "Site service is not connected");

        softAssert.assertAll();
    }


}
