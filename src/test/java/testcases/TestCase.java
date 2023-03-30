package testcases;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCase {

    @Test
    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/krystynasylyvonchyk/IdeaProjects/SeleniumProject/src/test/resources/chromedriver" );

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.nytinytimes.com/mes.com/");
        driver.get("https://www.google.com");
        driver.get("https://www.google.com");

    }
}
