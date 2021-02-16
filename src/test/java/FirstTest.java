import Steps.SignUpSteps;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.BaseTest;
import pageobjects.SignUpPage;

import java.util.concurrent.TimeUnit;

public class FirstTest extends BaseTest {

    SignUpSteps su = new SignUpSteps();

    @Test
    public void signUp() throws Exception{
        su.navigateToSignUpForm();
        su.enterZipCode();
        su.enterMainData();
        Assert.assertEquals("Account is created!", su.checkThatConfirmationMessageAppears());
        System.out.println("Email: "+su.getEmail());
        System.out.println("Password: "+su.getPassword());
    }
}
