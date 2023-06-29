package testcases;

import org.testng.annotations.Test;


public class LoginTest extends BaseTest{

   public String email_txt = "abs@gmail.com";
   public String password_txt = "password#3";

    @Test
    public void fillEmailAndPasswordFields() throws InterruptedException {
        homePage.takeMeToLoginPage();
        loginPage.fillUpCredentials(email_txt, password_txt, true);
        loginPage.submitCredentials();
    }

    @Test
    public void fillEmailAndPasswordFieldsAndValidateError() throws InterruptedException {
        loginPage.fillEmailAndPasswordFieldsAndPressEnter();
        loginPage.displayError();
    }

    @Test
    public void fillEmailAndPasswordFieldsAndValidateCheckbox() throws InterruptedException {
        homePage.takeMeToLoginPage();
        loginPage.checkIfRememberMeIsSelected();
    }

    @Test
    public void verifyCheckboxText() throws InterruptedException {
        homePage.takeMeToLoginPage();
        loginPage.getTextFromRememberMeButton();
    }

}
