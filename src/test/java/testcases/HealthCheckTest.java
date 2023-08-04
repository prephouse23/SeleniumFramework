package testcases;

import org.testng.annotations.Test;

public class HealthCheckTest extends BaseTest{

    @Test(groups = "participantRole")
    public void signInParticipant() throws InterruptedException {
        homePage.clickSignIn();
        signInPage.fillTheSignInForm("user1", "password1");
    }

    @Test(groups = "adminRole")
    public void signInAdmin() throws InterruptedException {
        homePage.clickSignIn();
        signInPage.fillTheSignInForm("admin1", "password#1");
    }

    @Test(groups = "ownerRole, releaseSeptember")
    public void signInOwner() throws InterruptedException {
        homePage.clickSignIn();
        signInPage.fillTheSignInForm("owner1", "test1234");
    }

    @Test(priority = 1)
    public void homePageValidation() throws InterruptedException {
        homePage.clickSignIn();
    }


}
