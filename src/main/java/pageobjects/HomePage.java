package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseMain{

    public HomePage(ChromeDriver driver){
        super(driver);
    }

    public String websiteURL = "http://bestbuy.com/";
    public String signIn_Btn = "//a[text()='Sign In']";
    public By account_Btn = By.xpath("//span[text()='Account']");

    public void takeMeToLoginPage() throws InterruptedException {
        driver.get(websiteURL);
        driver.findElement(account_Btn).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(signIn_Btn)).click();
    }
}
