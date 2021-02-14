package Steps;

import pageobjects.BaseTest;
import pageobjects.MainPage;
import pageobjects.SignUpPage;

public class SignUpSteps extends BaseTest {
    MainPage mainPage = new MainPage(getDriver());
    SignUpPage signUpPage = new SignUpPage(getDriver());

    public void navigateToSignUpForm() {
        mainPage.clickEnterBnt();
    }

    public void enterZipCode() {
        signUpPage.sendKeysZipCodeField("11111");
        signUpPage.clickContinueBtn();
    }

    public void enterMainData() {
        signUpPage.sendKeysFirstName("qqqq");
        signUpPage.sendKeysLastName("wwww");
        signUpPage.sendKeysEMail("eeee@example.com");
        signUpPage.sendKeysPswrd1("1111");
        signUpPage.sendKeysPswrd2("1111");
        signUpPage.clickRegisterBtn();
    }

    /*public String checkThatConfirmationMessageAppears() {
        return signUpPage.getTextConfirmationMessage();
    }

    public String getEmail() {
        return mainPage.getEmailText();
    }

    public String getPassword() {
        return mainPage.getPasswordText();*/
}

