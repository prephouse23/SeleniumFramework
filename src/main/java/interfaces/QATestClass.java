package interfaces;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

public class QATestClass{

    Util util;
    Quizzes quizzes;


    @Test
    public void test(){
        quizzes.quizName();
    }
}
