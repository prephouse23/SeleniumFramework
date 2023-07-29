package pageobjects;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class BestBuySearchResultsPage extends BaseMain{

    public BestBuySearchResultsPage(WebDriver driver) {
        super(driver);
    }
    By searchField = By.id("gh-search-input");//to validate query is pre-printed

    By sortByDropdown = By.id("sort-by-select");//to sort by the price

    By searchItems = By.xpath("//div[@class='shop-sku-list-item']"); //to calculate items
    By searchItemImage = By.xpath("//div[contains(@id,'shop-sku-list-item')]//a/img"); //to get alt and verify query word in here

    By searchItemName = By.xpath("//h4[@class='sku-title']"); //to verify if query word contains here
    By searchItemAddToCartButton = By.xpath("//div[contains(@id,'fulfillment-add-to-cart-button')]//button"); //need to access via list
    By relatedSearchesTexts = By.xpath("//a[@data-track='[context:searchContext=RELATED]']");

    public String searchFieldCurrentInput(){
        return driver.findElement(searchField).getAttribute("value");
    }

    public int numberOfSearchResults(){
        return driver.findElements(searchItems).size();
    }

    public List<String> searchResultImageAlt(){
        List<WebElement> elements = new ArrayList<>(driver.findElements(searchItemImage));
        List<String> altValues = new ArrayList<>();
        for (WebElement element : elements) {
            String alt = element.getAttribute("alt");
            altValues.add(alt.substring(0,alt.indexOf(" - Front")));
        }
        return altValues;
    }
    public List<String> searchResultNames(){
        List<WebElement> elements = new ArrayList<>(driver.findElements(searchItemName));
        List<String> nameValues = new ArrayList<>();
        for (WebElement element : elements) {
            nameValues.add(element.getText());
        }
        return nameValues;
    }

    public void addSearchItemToCart(int elementInPageOrder){
        List<WebElement> elements = driver.findElements(searchItemAddToCartButton);
        elements.get(elementInPageOrder).click();

    }


}
