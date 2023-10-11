package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class SignInPage extends BaseMain{


    public SignInPage(WebDriver driver, Logger log) {
        super(driver);
    }

    String inputEmail = "//input[@type='email']";
    String inputPassword = "//input[@type='password']";
    String btnLogin = "//button[text()='Sign In']";

    //parameters(values)
    String emailValue = "admin@user.com";
    String passwordValue = "password";

    public void fillTheSignInForm(String username, String password){
        driver.findElement(By.xpath(inputEmail)).sendKeys(username);
        driver.findElement(By.xpath(inputPassword)).sendKeys(password);
    }
}
