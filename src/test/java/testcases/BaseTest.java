package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.time.Duration;

public class BaseTest {

    ChromeDriver driver;
    HomePage homePage;
    LoginPage loginPage;


    @BeforeMethod(groups = {"home", "menu", "feature"} , alwaysRun = true)
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/dmytrosylyvonchyk/Documents/GitHub/SeleniumFramework/src/test/resources/executables/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    }

    @AfterMethod(groups = {"home", "menu", "feature"}, alwaysRun = true)
    public void tearDown(){
        if(driver!= null){
            driver.quit();
        }
    }
}
