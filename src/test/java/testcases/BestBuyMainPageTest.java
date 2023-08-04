package testcases;

import org.testng.annotations.Test;

public class BestBuyMainPageTest extends BaseTest{

    //Main page should have 4 Suggested Item Sections, and display them as user scrolls
    @Test
    public void REQ92832_TC389_4SuggestItemSectionsOnMainPageOnScroll(){
        bestBuyMainPage.openMainPage();
        bestBuyMainPage.suggestedItemSectionScrollAndCount();
    }

    //Main page should have no more than 4 Suggested Item Sections, as user scrolls to the end of the page
    @Test
    public void REQ92833_TC394_4SuggestItemSectionsOnMainPageOnScroll(){
        bestBuyMainPage.openMainPage();
        bestBuyMainPage.suggestedItemSectionScrollAndCount();
        bestBuyMainPage.scrollToEndAndVerify4Sections();
    }



}
