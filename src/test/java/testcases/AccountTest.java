package testcases;

import org.testng.annotations.Test;


public class AccountTest extends BaseTest{

   public String email_txt = "abs@gmail.com";
   public String password_txt = "password#3";

    @Test(groups = {"menu"})
    public void sampleMavenTest() throws InterruptedException {
        System.out.println("Menu group");
        homePage.takeMeToLoginPage();
    }


}
