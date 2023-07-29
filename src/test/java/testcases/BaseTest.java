package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageobjects.*;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class BaseTest {
    WebDriver driver;
    BaseMain baseMain;
    HomePage homePage;
    SignInPage signInPage;
    BestBuySearchResultsPage bestBuySearchResultsPage;
    BestBuyMainPage bestBuyMainPage;


    @BeforeMethod
    public void startDriver() throws IOException {
        System.setProperty("webdriver.chrome.driver", "/home/vboxuser/Documents/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        bestBuySearchResultsPage = new BestBuySearchResultsPage(driver);
        bestBuyMainPage = new BestBuyMainPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }


    public void saveLogs(Logger log) throws IOException {
        FileHandler fileHandler;
        fileHandler = new FileHandler("/Users/dmytrosylyvonchyk/Documents/GitHub/SeleniumFramework/MyLogs.log");
        log.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        log.info("This is the beginning of the test suit");
    }

    public int a(){
        return driver.findElements(By.xpath("//div[@class='pl-flex-carousel-slider']")).size();
    }

}
