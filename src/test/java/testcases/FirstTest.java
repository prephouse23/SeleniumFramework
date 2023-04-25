package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void startDriver(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsyly\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("");
    }

    @Test
    public void openWebsite(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsyly\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");
    }
    @Test
    public void openSignInPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsyly\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");

        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();
    }
    @Test
    public void fillEmailAndPasswordFields() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsyly\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");

        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();


        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Sign In']")).submit();
    }
    @Test
    public void fillEmailAndPasswordFieldsAndPressEnter() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsyly\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");

        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();


        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);
    }
    @Test
    public void fillEmailAndPasswordFieldsAndValidateError() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsyly\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");

        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@sdd.ut");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//div[@aria-label='Error']")).isDisplayed());
    }
    @Test
    public void fillEmailAndPasswordFieldsAndValidateCheckbox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsyly\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");

        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();
        System.out.println(driver.findElement(By.id("cia-remember-me")).isSelected());
    }
    @Test
    public void verifyCheckboxText() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsyly\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");

        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();
        System.out.println(driver.findElement(By.xpath("//label[@for='cia-remember-me']")).getText());
    }

    @Test
    public void isEnabled() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsyly\\IdeaProjects\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://secure.bankofamerica.com/secure-mycommunications/public/appointments/?marketingCode=NEWHP_ECHMPG");

        driver.findElement(By.xpath("//h3[text()='Everyday Banking']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//button[text()='Cancel' and @href='javascript:void(0);']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//button[@id='nextBtnSubTopic']")).isEnabled());

    }



































}
