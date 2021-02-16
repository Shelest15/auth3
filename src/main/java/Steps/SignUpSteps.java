package Steps;

import pageobjects.BaseTest;
import pageobjects.MainPage;
import pageobjects.SignUpPage;

public class SignUpSteps extends BaseTest {
    MainPage mainPage = new MainPage(getDriver());
    SignUpPage signUpPage = new SignUpPage(getDriver());

    public void navigateToSignUpForm() {
        mainPage.clickEnterBnt();
        mainPage.clickSignUpRef();
    }

    public void enterZipCode() {
        signUpPage.sendKeysZipCodeField("11111");
        signUpPage.clickContinueBtn();
    }

    public void enterMainData() {
        signUpPage.sendKeysFirstName("Alex");
        signUpPage.sendKeysLastName("Test");
        signUpPage.sendKeysEMail("alextest@mail.su");
        signUpPage.sendKeysPswrd1("12345");
        signUpPage.sendKeysPswrd2("12345");
        signUpPage.clickRegisterBtn();
    }

    public String checkThatConfirmationMessageAppears() {
        return signUpPage.getTextConfirmationMessage();
    }

    public String getEmail() {
        return mainPage.getEmailText();
    }

    public String getPassword() {
        return mainPage.getPasswordText();
    }
}

