package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver){
        super(driver);
    }


    @FindBy(xpath="/html/body/center/table/tbody/tr[20]/td/p/a/b")
    private WebElement enterBnt;

    @FindBy(xpath="/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")
    private WebElement signUpRef;

    @FindBy(xpath="/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")
    private WebElement getEmailText;

    @FindBy(xpath="/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]")
    private WebElement getPasswordText;

    public void clickEnterBnt() {
    enterBnt.click();
    }

    public void clickSignUpRef() {
    signUpRef.click();
    }

    public String getEmailText() {
    return getEmailText.getText();
    }

    public String getPasswordText() {
    return getPasswordText.getText();
    }
}

