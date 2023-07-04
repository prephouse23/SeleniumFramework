package testcases;

import org.testng.annotations.Test;


public class LoginTest extends BaseTest{

   public String email_txt = "abs@gmail.com";
   public String password_txt = "password#3";

    @Test(priority = 3, groups = {"menu"})
    public void fillEmailAndPasswordFields() throws InterruptedException {
        System.out.println("test 1 menu group");
        homePage.takeMeToLoginPage();
        loginPage.fillUpCredentials(email_txt, password_txt, true);
        loginPage.submitCredentials();
    }

    @Test(priority = 3, groups = {"feature"})
    public void fillEmailAndPasswordFieldsAndValidateError() throws InterruptedException {
        System.out.println("test 2");
        loginPage.fillEmailAndPasswordFieldsAndPressEnter();
        loginPage.displayError();
    }

    @Test(priority = 3, groups = {"feature"})
    public void fillEmailAndPasswordFieldsAndValidateCheckbox() throws InterruptedException {
        System.out.println("test 3");
        homePage.takeMeToLoginPage();
        loginPage.checkIfRememberMeIsSelected();
    }

    @Test(priority = 1, groups = "home")
    public void verifyCheckboxText() throws InterruptedException {
        System.out.println("test 4, home group");
        homePage.takeMeToLoginPage();
        loginPage.getTextFromRememberMeButton();
    }

}
