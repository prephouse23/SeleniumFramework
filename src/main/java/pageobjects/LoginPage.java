package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BaseMain{

    public LoginPage(ChromeDriver driver){
        super(driver);
    }

    public String emailTxtField = "//input[@type='email']";
    public By passwordInput = By.xpath("//input[@type='password']");
    public String email_txt = "abs@gmail.com";
    public String password_txt = "password#3";
    public String error = "//div[@aria-label='Error']";
    protected String signInbtn = "//button[text()='Sign In']";
    public String rememberMeId = "cia-remember-me";
    protected String rememberMebtn ="//label[@for='cia-remember-me']";

    public void fillUpCredentials(String email, String password, boolean rememberMe){
        driver.findElement(By.xpath(emailTxtField)).sendKeys(email);
        driver.findElement((passwordInput)).sendKeys(password);
    }

    public void fillEmailAndPasswordFieldsAndPressEnter() throws InterruptedException {
        fillUpCredentials(email_txt, password_txt, false);
        driver.findElement(passwordInput).sendKeys(Keys.ENTER);
    }

    public void displayError() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath(error)).isDisplayed());
    }

    public void submitCredentials(){
        driver.findElement(By.xpath(signInbtn)).submit();
    }

    public void checkIfRememberMeIsSelected(){
        System.out.println(driver.findElement(By.id(rememberMeId)).isSelected());
    }

    public void getTextFromRememberMeButton(){
        System.out.println(driver.findElement(By.xpath(rememberMebtn)).getText());
    }
}
