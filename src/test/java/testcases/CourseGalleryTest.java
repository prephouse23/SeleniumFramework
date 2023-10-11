package testcases;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CourseGalleryTest extends BaseTest{


    @Test
    public void scenario2(){
        courseGalleryPage.openCourseGallery();
        List<String> actual = courseGalleryPage.quizTabNames();
        courseGalleryPage.assertion(actual);
    }
    @Test
    public void scenario23(){
        courseGalleryPage.ss();
    }
}
