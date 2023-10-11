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
        bestBuyMainPage.openMainPage();
        bestBuySearchResultsPage.menuOptionsVerification();
    }

    @Test
    public void dd(){
        String initial = "21 cars";
        System.out.println(initial.substring(3));
        System.out.println(initial.substring(0,2));
        System.out.println(initial.indexOf(" "));
        System.out.println("----------------------");
        char first = '2';
        char second = '1';
        char third = ' ';
        initial = "321 cars";
        System.out.println(initial.substring(0,2));
        System.out.println(initial.indexOf("s"));
        System.out.println(initial.indexOf(" "));
        System.out.println("=======================");
        int index = initial.indexOf(" ");
        System.out.println(initial.substring(0,index));


        System.out.println("++++++++++++++++++");
        initial = "4321 cars";
        index = initial.indexOf(" ");
        System.out.println(initial.substring(0,index));
        System.out.println("------------");
        for (int i = 10; i < 15;i++) {
            System.out.println(initial + " are parked at spot " + i);
        }

    }
}
