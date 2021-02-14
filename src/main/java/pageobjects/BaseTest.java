package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;


public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setUp() throws Exception{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.sharelane.com/");
    }

    @AfterClass
    public static void tearDown() throws Exception{
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
