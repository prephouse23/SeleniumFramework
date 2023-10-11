package interfaces;

import org.openqa.selenium.WebDriver;
import pageobjects.BaseMain;

public class Util extends BaseMain {

    public Quizzes quizzes;

    public Util(WebDriver driver, String quiz) {
        super(driver);

        if(getClass().getName().contains("Developer") || quiz.contains("Developer")){
            quizzes = new Developer(driver);
        }
        if (getClass().getName().contains("Tester") || quiz.contains("QA") || quiz.contains("Tester")){
            quizzes = new Tester(driver);
        }
    }
}

