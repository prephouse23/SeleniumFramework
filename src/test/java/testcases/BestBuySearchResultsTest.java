package testcases;

import org.testng.annotations.Test;

public class BestBuySearchResultsTest extends BaseTest{

    //search for item, sort by price High to Low and add 2 items and verify modal window has correct sum
    @Test
    public void TC238_ModalWindowPriceAddVerification() throws InterruptedException {
        bestBuyMainPage.openMainPage();
        String query = "blender";
        bestBuyMainPage.searchFor(query);
        for (int i = 0; i < bestBuySearchResultsPage.searchItemTitleCount();i++) {
            bestBuySearchResultsPage.verifySearchItemTitleTextContainsQuery(i, query);
        }
        bestBuySearchResultsPage.addItemToCart_And_ReturnPrice();

    }

    @Test
    public void s(){
        bestBuySearchResultsPage.aa();
    }
}
