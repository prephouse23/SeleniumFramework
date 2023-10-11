package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.BaseMain;

public class Developer extends BaseMain implements Quizzes{
    public Developer(WebDriver driver) {
        super(driver);
    }

    @Override
    public void quizName() {
        String quizNameTitle;
        //quizNameTitle = driver.findElement(By.xpath("//")).getText();
        quizNameTitle = "Developer Java ";
        System.out.println(quizNameTitle);
        driver.findElement(By.xpath("")) .sendKeys();
    }
}
