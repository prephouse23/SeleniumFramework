package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BaseMain{

    public SignInPage(WebDriver driver){
        super(driver);
    }

    String inputEmail = "//input[@type='email']";
    String inputPassword = "//input[@type='password']";
    String btnLogin = "//button[text()='Sign In']";

    //parameters(values)
    String emailValue = "email@sdd.ut";
    String passwordValue = "password";

    public void fillTheSignInForm(){
        driver.findElement(By.xpath(inputEmail)).sendKeys(emailValue);
        driver.findElement(By.xpath(inputPassword)).sendKeys(passwordValue);
        driver.findElement(By.xpath(btnLogin)).submit();
    }
}
