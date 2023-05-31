package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class JavaAndSeleniumPractise extends BaseTest {

    @Test
    public void closeOrQuit(){
        driver.get("http://amazon.com");
        driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
        System.out.println();
    }

    @Test
    public void dropdown(){
        driver.get("http://amazon.com");
        WebElement searchDropdownElement;
        searchDropdownElement = driver.findElement(By.id("searchDropdownBox"));
        Select searchDropdown = new Select(searchDropdownElement);
        List<WebElement> options = new ArrayList<>();
        options = searchDropdown.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
    }


}
