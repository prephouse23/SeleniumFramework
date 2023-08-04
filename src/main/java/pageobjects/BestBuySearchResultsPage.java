package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestBuySearchResultsPage extends BaseMain{
    public BestBuySearchResultsPage(WebDriver driver) {
        super(driver);
    }

    private By searchItemTitle = By.xpath("//h4[@class='sku-title']/a");
    private By addToCartButton = By.xpath("//button[@data-button-state='ADD_TO_CART']");
    private By customerPriceTag = By.xpath("//div[@data-testid='large-price']//div[@data-testid='customer-price']");
    private By cartSubtotalText = By.xpath("//div[@class='sub-total v-fw-medium']");
    private By cartSubtotalWindowCloseButton = By.xpath("//button[@data-track='Attach Modal: Close']");
    public String searchItemTitleText(int searchResultRow){
        return driver.findElements(searchItemTitle).get(searchResultRow).getText();
    }
    private String customerPriceTagText(int searchResultRow){
        return driver.findElements(customerPriceTag).get(searchResultRow).getText();
    }
    private void addItemToCartFromRow(int searchResultRow){
        driver.findElements(addToCartButton).get(searchResultRow).click();
    }
    public int searchItemTitleCount(){
        return driver.findElements(searchItemTitle).size();
    }

    public void verifySearchItemTitleTextContainsQuery(int searchResultRow, String expected){
//        System.out.println(searchItemTitleText(searchResultRow));
//        Assert.assertTrue(searchItemTitleText(searchResultRow).toUpperCase().contains(expected.toUpperCase()));
    }

    private String modalWindowCartPrice(){
        String price = driver.findElement(cartSubtotalText).getText();
        return price.substring(1);
    }


    public void addItemToCart_And_ReturnPrice() throws InterruptedException {
        String firstItemPrice = customerPriceTagText(0);
        firstItemPrice = firstItemPrice.substring(1,firstItemPrice.indexOf("\n"));
        String secondItemPrice = customerPriceTagText(1);
        secondItemPrice = secondItemPrice.substring(1,secondItemPrice.indexOf("\n"));

        double firstItemPriceDouble = Double.parseDouble(firstItemPrice);
        double secondItemPriceDouble = Double.parseDouble(secondItemPrice);

        addItemToCartFromRow(0);
        Thread.sleep(5000);
        Assert.assertEquals(modalWindowCartPrice(),firstItemPrice);
        closeModal();

        addItemToCartFromRow(1);
        Thread.sleep(5000);
        String expectedSubtotal = String.valueOf(firstItemPriceDouble + secondItemPriceDouble);
        System.out.println(expectedSubtotal);
        Assert.assertEquals(modalWindowCartPrice(),expectedSubtotal);
    }

    public void closeModal(){
        driver.findElement(cartSubtotalWindowCloseButton).click();
    }


    By rows = By.xpath("//table/tbody/tr");
    By teamsLocator = By.xpath("//table/tbody/tr[5]//td[2]//a");

    public void aa() {

        driver.get("https://www.hltv.org/stats/players");
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        Map <String, List<String>> players = new HashMap<>();
        System.out.println(driver.findElements(rows).size());
        for (int i = 1;i<(driver.findElements(rows).size()-10);i++){
            System.out.println(i);
            String playerName = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]//td/a")).getText();
            List<String> teams = new ArrayList<>();
            for (int j = 1;j<driver.findElements(By.xpath("//table/tbody/tr[" + i + "]/td[2]//a/img[not(contains(@class,'night-only'))]")).size();j++){
                 teams.add(driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[2]//a[" + j + "]/img[not(contains(@class,'night-only'))]")).getAttribute("title"));
                players.put(playerName,teams);
            }

        }
        System.out.println(players);

    }
}
