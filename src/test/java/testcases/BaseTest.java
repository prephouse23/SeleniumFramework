package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageobjects.BaseMain;
import pageobjects.HomePage;
import pageobjects.SignInPage;

public class BaseTest {

    WebDriver driver;
    HomePage homePage;
    SignInPage signInPage;


    @BeforeTest
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/krystynasylyvonchyk/IdeaProjects/SeleniumProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }

}
