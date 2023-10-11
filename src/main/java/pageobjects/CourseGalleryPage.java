package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseGalleryPage extends BaseMain{
    public CourseGalleryPage(WebDriver driver) {
        super(driver);
    }

    By quizTopicTab = By.xpath("//div[@class='expertise-areas-list']/div");


    public void openCourseGallery(){
        driver.get("https://test.my-fork.com/quizzes-list");
    }
    public List<String> quizTabNames(){
        List<String> actual = new ArrayList<>();
        List<WebElement> tabElements = driver.findElements(quizTopicTab);
        for (WebElement element : tabElements) {
            actual.add(element.getText());
            System.out.println(element.getText());
        }
        return actual;
    }

    List<String> expected = new ArrayList<>();

    public void assertion(List<String> actual){
        Assert.assertEquals(actual,expected);
    }
    List<String> list = Arrays.asList("foo", "bar");
    public void ss(){
        String initialText = "\n" +
                "                                                    0\n" +
                "                                                / 9058";
        initialText = initialText.substring(initialText.indexOf("/"));
        System.out.println(initialText);
        double a = 5;
        double b = 2;
        System.out.println(a/b);
        System.out.println(initialText+b);
        List<String> list = Arrays.asList("foo", "bar");
        double parsedFromText = Double.parseDouble(initialText);
        System.out.println(parsedFromText);
        int aa = Integer.parseInt(initialText);
        System.out.println(aa+2);

    }

    public void parseDouble(){
                String initialText = "\n" +
                "                                                    0\n" +
                "                                                / 9058";
        initialText = initialText.substring(initialText.indexOf("/"));

    }

}
