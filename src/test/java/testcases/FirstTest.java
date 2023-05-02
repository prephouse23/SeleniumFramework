package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;

public class FirstTest extends BaseTest{


    //locators
    String urlBestBuy = "http://bestbuy.com";
    String urlBankOfAmerica = "https://secure.bankofamerica.com/secure-mycommunications/public/appointments/?marketingCode=NEWHP_ECHMPG";
    String btnAccount = "//span[text()='Account']";
    String btnSignIn = "//a[@data-lid='ubr_mby_signin_b']";



    @Test
    public void openWebsite() {
        driver.get(urlBestBuy);
    }

    @Test
    public void openSignInPage() throws InterruptedException {

        homePage.clickSignIn();
    }

    @Test
    public void fillEmailAndPasswordFields() throws InterruptedException {

        homePage.clickSignIn();
        signInPage.fillTheSignInForm();
    }

    @Test
    public void fillEmailAndPasswordFieldsAndPressEnter() throws InterruptedException {

        driver.get(urlBestBuy);

        driver.findElement(By.xpath(btnAccount)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(btnSignIn)).click();


        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);
    }

    @Test
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

    @Test
    public void fillEmailAndPasswordFieldsAndValidateCheckbox() throws InterruptedException {
        driver.get(urlBestBuy);

        driver.findElement(By.xpath(btnAccount)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(btnSignIn)).click();
        System.out.println(driver.findElement(By.id("cia-remember-me")).isSelected());
    }

    @Test
    public void verifyCheckboxText() throws InterruptedException {

        driver.get(urlBestBuy);

        driver.findElement(By.xpath(btnAccount)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(btnSignIn)).click();
        System.out.println(driver.findElement(By.xpath("//label[@for='cia-remember-me']")).getText());
    }

    @Test
    public void isEnabled() throws InterruptedException {

        driver.get(urlBankOfAmerica);

        driver.findElement(By.xpath("//h3[text()='Everyday Banking']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//button[text()='Cancel' and @href='javascript:void(0);']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//button[@id='nextBtnSubTopic']")).isEnabled());

    }

}



































