package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest extends BaseTest{


    //locators
    String urlBestBuy = "http://bestbuy.com";
    String urlBankOfAmerica = "https://secure.bankofamerica.com/secure-mycommunications/public/appointments/?marketingCode=NEWHP_ECHMPG";
    String btnAccount = "//span[text()='Account']";
    String btnSignIn = "//a[@data-lid='ubr_mby_signin_b']";

    @Test ( groups = "login")
    public void signin() throws InterruptedException {

        homePage.clickSignIn();
    }
    @Test
    public void ss() throws InterruptedException {

        driver.get("https://www.amazon.com/Barbie-Camping-Backpack-Sleeping-Accessories/dp/B09BW2L2RF/ref=sr_1_3?crid=3CLSBSXKDOXOF&keywords=barbie+doll&qid=1695242202&sprefix=barbie+doll%2Caps%2C151&sr=8-3");
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//div[@id='apex_desktop_qualifiedBuybox']//div[@id='corePriceDisplay_desktop_feature_div']/div/span[2]/span[@class='a-offscreen']")).getAttribute("textContent"));
//        JavascriptExecutor j = ((JavascriptExecutor) driver).executeScript(
//                "return jQuery(arguments[0]).text();", driver.findElement(By.xpath("//div[@id='apex_desktop_qualifiedBuybox']//div[@id='corePriceDisplay_desktop_feature_div']/div/span[2]/span[@class='a-offscreen']"));
    }

    @Test ( groups = "login")
    public void singInWithDifferentData(){
        signInPage.fillTheSignInForm("username1", "password1");
    }

    @Test (priority = 1, groups = "data")
    public void fillEmailAndPasswordFields() throws InterruptedException {

        homePage.clickSignIn();
        signInPage.fillTheSignInForm("Admin@test.com", "password$55");
        driver.findElement(By.xpath(btnSignIn)).click();
    }

    @Test ( groups = "login")
    public void fillEmailAndPasswordFieldsAndPressEnter() {

        driver.get(urlBestBuy);

        driver.findElement(By.xpath(btnAccount)).click();
        signInPage.fillTheSignInForm("user4567890", "hkjlmlskp");

    }
    @Test (priority = 2)
    public void fillEmailAndPasswordFieldsAndValidateError() throws InterruptedException {

        driver.get(urlBestBuy);

        driver.findElement(By.xpath(btnAccount)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(btnSignIn)).click();

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//div[@aria-label='Error']")).isDisplayed());
    }

    //@Test
    public void fillEmailAndPasswordFieldsAndValidateCheckbox() throws InterruptedException {
        driver.get(urlBestBuy);

        driver.findElement(By.xpath(btnAccount)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(btnSignIn)).click();
        System.out.println(driver.findElement(By.id("cia-remember-me")).isSelected());
    }

    //@Test
    public void verifyCheckboxText() throws InterruptedException {

        driver.get(urlBestBuy);

        driver.findElement(By.xpath(btnAccount)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(btnSignIn)).click();
        System.out.println(driver.findElement(By.xpath("//label[@for='cia-remember-me']")).getText());
    }

   // @Test
    public void isEnabled() throws InterruptedException {

        driver.get(urlBankOfAmerica);

        driver.findElement(By.xpath("//h3[text()='Everyday Banking']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//button[text()='Cancel' and @href='javascript:void(0);']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//button[@id='nextBtnSubTopic']")).isEnabled());

    }

}



































