package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.BaseMain;

public class Tester extends BaseMain  implements Quizzes{
    public Tester(WebDriver driver) {
        super(driver);
    }

    @Override
    public void quizName() {
        String quizNameTitle;
        //quizNameTitle = driver.findElement(By.xpath("//")).getText();
        quizNameTitle = "Manual Tester";
        System.out.println(quizNameTitle);
    }
}
