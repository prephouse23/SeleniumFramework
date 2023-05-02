package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BaseMain{

    public HomePage(WebDriver driver){
        super(driver);
    }

    String urlBestBuy = "http://bestbuy.com";
    String btnAccount = "//span[text()='Account']";
    String btnSignIn = "//a[@data-lid='ubr_mby_signin_b']";

    public void clickSignIn() throws InterruptedException {
        driver.get(urlBestBuy);
        driver.findElement(By.xpath(btnAccount)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(btnSignIn)).click();
    }
}
