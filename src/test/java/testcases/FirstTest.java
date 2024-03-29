package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import java.sql.SQLException;
import java.time.Duration;

public class FirstTest extends BaseTest{


    //locators
    String urlBestBuy = "http://bestbuy.com";
    String urlBankOfAmerica = "https://secure.bankofamerica.com/secure-mycommunications/public/appointments/?marketingCode=NEWHP_ECHMPG";
    String btnAccount = "//span[text()='Account']";
    String btnSignIn = "//a[@data-lid='ubr_mby_signin_b']";
    

    @Test
    public void fillEmailAndPasswordFieldsAndPressEnter() {

        driver.get(urlBestBuy);

        driver.findElement(By.xpath(btnAccount)).click();
        WebDriverWait waitForDropdownToLoad = new WebDriverWait(driver,Duration.ofSeconds(10));
        waitForDropdownToLoad.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Create Account']")));
        driver.findElement(By.xpath(btnSignIn)).click();

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);
    }

    @Test
    public void fillEmailAndPasswordFieldsAndValidateError() throws InterruptedException {

        driver.get("https://test.my-fork.com/login");

//        driver.findElement(By.xpath(btnAccount)).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath(btnSignIn)).click();

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log In']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
//        System.out.println(driver.findElement(By.xpath("//div[@aria-label='Error']")).isDisplayed());
        System.out.println();
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



































