package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setUp() throws Exception{

        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();


        /*System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();*/

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.sharelane.com/");
        Thread.sleep(0);
    }

    @AfterClass
    public static void tearDown() throws Exception{
        driver.quit();
        Thread.sleep(0);
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
