package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LoginWithDDT extends BaseTest{
    String btnSignIn =  "//button[text()='Sign In']";
    Boolean logBtnDisplayed;

    @Test(dataProvider = "LoginInfo")
    public void login(String username, String password, String isButtonDisplayed) throws InterruptedException {
        homePage.clickSignIn();
        signInPage.fillTheSignInForm(username, password);
        loginButtonDisplayed(isButtonDisplayed);
        Assert.assertEquals(driver.findElement(By.xpath(btnSignIn)).isDisplayed(), logBtnDisplayed);
        driver.findElement(By.xpath(btnSignIn)).submit();
    }

    public boolean loginButtonDisplayed(String isButtonDisplayed){
        if(isButtonDisplayed.contains("true")){
            logBtnDisplayed = true;
        } else {
            logBtnDisplayed = false;
        }
        return logBtnDisplayed;
    }

    @DataProvider(name = "LoginInfo")
    public static Object[][] loginPageValidations() throws IOException {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("LoginInfo.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2]});
        });

        return out.toArray(new Object[out.size()][]);
    }





}
