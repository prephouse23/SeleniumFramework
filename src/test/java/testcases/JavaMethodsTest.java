package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JavaMethodsTest extends BaseTest{

    //locators
    String urlBestBuy = "http://bestbuy.com";
    String urlBankOfAmerica = "https://secure.bankofamerica.com/secure-mycommunications/public/appointments/?marketingCode=NEWHP_ECHMPG";
    String btnAccount = "//span[text()='Account']";
    String btnSignIn = "//a[@data-lid='ubr_mby_signin_b']";
    String inputEmail = "//input[@type='email']";
    String inputPassword = "//input[@type='password']";
    String btnLogin = "//button[text()='Sign In']";

    //parameters(values)
    String emailValue = "email@sdd.ut";
    String passwordValue = "password";


    @Test
    public void fillEmailAndPasswordFields() throws InterruptedException {

        driver.get(urlBestBuy);

        driver.findElement(By.xpath(btnAccount)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(btnSignIn)).click();

        driver.findElement(By.xpath(inputEmail)).sendKeys(emailValue);
        driver.findElement(By.xpath(inputPassword)).sendKeys(passwordValue);
        driver.findElement(By.xpath(btnLogin)).submit();
    }

    @Test
    public void testJavaMethods(){

        boolean access = true;
        int age = 20;
        boolean registered = true;
        boolean gardian = true;

        String accessGranted = "Congrats, you are granted a full access";
        String partialAccessGranted = "Congrats, you are granted a partial access";
        String accessIsNotGranted = "I'm sorry, you are not granted an access";

        String name = "a";
        int age22 = 22;


        System.out.println("my username is "+ name +" and my age is " + age22);




        //logical statement AND &&
        //logical statement OR ||

        if (age >= 21 && registered == true){
            System.out.println(accessGranted);
        }
        //(2+2)*4
        else if ((age >= 18 && age <21 )&& gardian == false){
            System.out.println(partialAccessGranted);
        }
        else {
            System.out.println(accessIsNotGranted);
        }

    }

    @Test
    public void testSwitch(){

        int day = 6;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

    @Test
    public void forLoop(){

        for (int age = 77; age < 100; age++) {
            System.out.println("You will receive your pension at " + age + " age");
        }
    }
}
