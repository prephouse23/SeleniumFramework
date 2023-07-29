package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SignInPage extends BaseMain{

    public SignInPage(WebDriver driver){ super(driver);}

    String url = "https://www.bestbuy.com/identity/signin?token=tid%3Ab7d8d41e-2a68-11ee-a393-0eee7f7bd321";
    String inputEmail = "//input[@type='email']";
    String inputPassword = "//input[@type='password']";
    String btnLogin = "//button[text()='Sign In']";

    //parameters(values)
    String emailValue = "email@sdd.ut";
    String passwordValue = "password";


    public void fillTheSignInForm() throws InterruptedException {
        typeUsingXpath(inputEmail, "Element name", emailValue);
        typeUsingXpath(passwordValue, "Password", passwordValue);
        clickUsingXpath(btnLogin, "Login button on Sign In page");
    }
}
