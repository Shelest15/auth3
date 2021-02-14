package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath="/html/body/center/table/tbody/tr[20]/td/p/a/b")
    private WebElement enterBnt;

    @FindBy(xpath="/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")
    private WebElement signUpRef;

    public void clickEnterBnt() {
        enterBnt.click();
    }

    public void setSignUpRef() {
        signUpRef.click();
    }
}

