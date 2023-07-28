package testcases;

import org.testng.annotations.Test;

public class SignInTest extends BaseTest{

    @Test
    public void test() throws InterruptedException {
        homePage.openHomePage();
        signInPage.fillTheSignInForm();
    }

    @Test
    public void search(){
        bestBuyMainPage.openWebsite();
        bestBuyMainPage.searchFor("TV");
    }

}
