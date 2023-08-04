package testcases;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginFuntionalityValidation(){
        signInPage.fillTheSignInForm("user5656565656", "dfvbfndmsnbn");
    }
}
