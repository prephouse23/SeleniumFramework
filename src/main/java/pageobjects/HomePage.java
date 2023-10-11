package pageobjects;

import interfaces.Quizzes;
import interfaces.Util;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;


public class HomePage extends BaseMain{

    Quizzes quizzes;
    Util util;

    public HomePage(WebDriver driver, Logger log){

        super(driver);
        util = new Util(driver, "QA");
    }

    String urlBestBuy = "http://bestbuy.com";
    String btnAccount = "//span[text()='Account']";
    String btnSignIn = "//a[@data-lid='ubr_mby_signin_b']";

    public void clickSignIn() throws InterruptedException {
        driver.get(urlBestBuy);
        clickUsingXpath(btnAccount, "account button");
        Thread.sleep(5000);
        clickUsingXpath(btnSignIn, "sign in button ");
    }

    public int testParameters(int math, int eng, int art ){
        int averageGrade = (math + eng + art ) /3;
        return averageGrade;
    }

    public void returnQuizName(){
        util.quizzes.quizName();
    }

}
