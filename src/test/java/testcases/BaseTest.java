package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.ConnectionType;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageobjects.BaseMain;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import java.time.Duration;
import java.util.Optional;

public class BaseTest {

    WebDriver driver;
    HomePage homePage;
    SignInPage signInPage;


    @BeforeTest
    public void startDriver() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsyly\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsyly\\OneDrive\\Documents\\GitHub\\SeleniumFramework\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

    }

    @AfterTest
    public void closeBrowser() {
//        driver.quit();
    }

}
