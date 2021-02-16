import Steps.SignUpSteps;
import org.junit.Assert;
import org.junit.Test;
import pageobjects.BaseTest;

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
        Thread.sleep(5000);
    }
}
