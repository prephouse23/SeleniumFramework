package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BestBuySearchResultTest extends BaseTest{


    @Test
    public void e2() throws InterruptedException {
        bestBuyMainPage.openWebsite();
        System.out.println(bestBuyMainPage.a());
//        homePage.scrollBy(1500);
//        bestBuyMainPage.w(1);
//        homePage.scrollBy(1500);
//        bestBuyMainPage.w(2);
//        homePage.scrollBy(1500);
//        bestBuyMainPage.w(3);
////        homePage.scrollBy(1000);
////        bestBuyMainPage.w(3);
//        homePage.scrollBy(1500);
//        bestBuyMainPage.w(4);
        for (int i = 1; i < 5; i++){
        homePage.scrollBy(1000);
        if (i == 4){
            homePage.scrollBy(1000);
        }
        bestBuyMainPage.w(i);
        }
        System.out.println(bestBuyMainPage.a());
    }

    @Test
    public void e2e(){
        bestBuyMainPage.openWebsite();
        String query = "monitor";
        bestBuyMainPage.searchFor(query);
        Assert.assertEquals(bestBuySearchResultsPage.searchFieldCurrentInput(),query);
        Assert.assertEquals(bestBuySearchResultsPage.numberOfSearchResults(),18);
        homePage.scrollBy(6000);
        Assert.assertEquals(bestBuySearchResultsPage.numberOfSearchResults(),18);
        List<String> resultNames = bestBuySearchResultsPage.searchResultNames();
//        for (String name: resultNames) {
//            System.out.println(name.toUpperCase());
//            System.out.println(query.toUpperCase());
//            Assert.assertSame(name.toUpperCase().contains(query.toUpperCase()), true);
//        }
//        List<String> imageDescriptions = bestBuySearchResultsPage.searchResultImageAlt();
//        for (String desc: imageDescriptions){
//            Assert.assertEquals(desc.toUpperCase().contains(query.toUpperCase()), true);
//        }
//        System.out.println(imageDescriptions);
//        System.out.println(resultNames);
//        Assert.assertEquals(imageDescriptions,resultNames);
    }
}
