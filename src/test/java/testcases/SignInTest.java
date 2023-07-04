package testcases;

import org.testng.annotations.Test;


public class SignInTest extends BaseTest{

   public String email_txt = "abs@gmail.com";
   public String password_txt = "password#3";

    @Test(groups = {"menu", "home"})
    public void sampleMavenTest() throws InterruptedException {
        homePage.takeMeToLoginPage();
    }

    //mvn -Dtest=LoginTest test

}
