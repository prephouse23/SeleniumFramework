package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pageobjects.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class BaseTest {

    public RemoteWebDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    BestBuyMainPage bestBuyMainPage;
    BestBuySearchResultsPage bestBuySearchResultsPage;
    CourseGalleryPage courseGalleryPage;
    Logger log;


    @BeforeMethod(groups = "ownerRole, releaseSeptember, adminRole, participantRole, login")
    @Parameters("browser")
    public void startDriver(@Optional("chrome") String browser) throws MalformedURLException {

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/dmytrosylyvonchyk/Documents/chromedriver");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/dmytrosylyvonchyk/Documents/geckodriver");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("sauce-chrome")) {

            ChromeOptions browserOptions = new ChromeOptions();
            browserOptions.setPlatformName("Windows 11");
            browserOptions.setBrowserVersion("latest");

            Map<String, Object> sauceOptions = new HashMap<>();
            sauceOptions.put("username", "oauth-dsylyvonchyk-edff2");
            sauceOptions.put("accessKey", "4b5a296b-d45d-4c89-8103-731e9510bbe9");
            sauceOptions.put("build", "selenium-build-NTJNK");
            sauceOptions.put("name", "First Sauce Test");
            browserOptions.setCapability("sauce:options", sauceOptions);

            URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
            driver = new RemoteWebDriver(url, browserOptions);

        } else if (browser.equalsIgnoreCase("sauce-edge")) {

            EdgeOptions browserOptions = new EdgeOptions();
            browserOptions.setPlatformName("Windows 10");
            browserOptions.setBrowserVersion("latest-1");
            Map<String, Object> sauceOptions = new HashMap<>();
            sauceOptions.put("username", "oauth-dsylyvonchyk-edff2");
            sauceOptions.put("accessKey", "4b5a296b-d45d-4c89-8103-731e9510bbe9");
            sauceOptions.put("build", "Build 2103");
            sauceOptions.put("name", "Edge execution");
            browserOptions.setCapability("sauce:options", sauceOptions);

            URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
            driver = new RemoteWebDriver(url, browserOptions);

        }else {
            System.out.println("Correct browser name was not found, please check again");
        }

        homePage = new HomePage(driver, log);
        signInPage = new SignInPage(driver, log);
        bestBuyMainPage = new BestBuyMainPage(driver);
        bestBuySearchResultsPage = new BestBuySearchResultsPage(driver);
        courseGalleryPage = new CourseGalleryPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod(groups = "ownerRole, releaseSeptember, adminRole, participantRole")
    public void closeBrowser() {

        if(driver!=null){ driver.quit();}
    }


}
