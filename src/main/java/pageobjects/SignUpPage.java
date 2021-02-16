package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage extends BasePage{

    public SignUpPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement zipCodeField;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement continueBtn;

    @FindBy(xpath="/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
    private WebElement firstName;

    @FindBy(xpath="/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement lastName;

    @FindBy(xpath="/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement eMail;

    @FindBy(xpath="/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
    private WebElement pswrd1;

    @FindBy(xpath="/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
    private WebElement pswrd2;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")
    private WebElement registerBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[4]/td/span")
    private WebElement elementSuccess;




    public void sendKeysZipCodeField(String a){
        zipCodeField.sendKeys(a);
    }

    public void clickContinueBtn(){
        continueBtn.click();
    }

    public void sendKeysFirstName(String a){
        firstName.sendKeys(a);
    }

    public void sendKeysLastName(String a){
        lastName.sendKeys(a);
    }

    public void sendKeysEMail(String a){
        eMail.sendKeys(a);
    }

    public void sendKeysPswrd1(String a){
        pswrd1.sendKeys(a);
    }

    public void sendKeysPswrd2(String a){
        pswrd2.sendKeys(a);
    }

    public void clickRegisterBtn(){
        registerBtn.click();
    }

    public String getTextConfirmationMessage() {
    return elementSuccess.getText();
    }
}
