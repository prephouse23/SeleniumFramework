package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class HomePage extends BaseMain{

    public HomePage(WebDriver driver){
        super(driver);
    }

    String urlBestBuy = "http://bestbuy.com";
    String skuCardsLocator = "//div[@data-testid='sku-card']/a/p";

    public void openHomePage(){
        driver.get(urlBestBuy);
    }

    public void ValidateSkuCards(){
        WebElement element = driver.findElement(By.xpath(skuCardsLocator));
        System.out.println(element.getText());
        System.out.println("__________________________");
        List<WebElement> skuCards = driver.findElements(By.xpath(skuCardsLocator));
        int listSize = skuCards.size();
        boolean listHasElements = listSize > 0;
        System.out.println(listHasElements);
        if (listHasElements) {
            for (int i = 0; i < listSize; i++) {
                System.out.println(i + ": " + skuCards.get(i).getText());
                System.out.println(i + ": " + skuCards.get(i).getText().contains("LG"));
            }
        } else {
            System.out.println("no elements were located");
        }
    }
}
