package WrokWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActivityOne {
    WebDriver driver;
    @BeforeMethod
    public void beforeEachTest (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void afterEachTest(){
        driver.quit();
    }
    @Test
    public void TestOne(){
        driver.get("https://facebook.com");
        String title= driver.getTitle();
        Assert.assertEquals(title,"Facebook - log in or sign up");
    }
}
