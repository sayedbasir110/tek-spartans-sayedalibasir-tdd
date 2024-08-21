package tek.tdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utility.SeleniumUtility;

public class AccountPage extends SeleniumUtility {
    public AccountPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(className = "account__information-email") public WebElement accountEmail;
    @FindBy(id = "nameInput") public WebElement nameInput;
    @FindBy(id = "personalPhoneInput") public WebElement phoneNumberInput;
    @FindBy(id = "personalUpdateBtn") public WebElement updateBtn;
    @FindBy(className = "Toastify") public WebElement toastMessage;
    @FindBy(className = "account__information-username") public WebElement accountName;

    public String getAccountEmail(){
        return getElementText(accountEmail);
    }
    public void updateAccountNameAndPhoneNumber(String name, String phoneNumber){
        sendTextToElement(nameInput, name);
        sendTextToElement(phoneNumberInput, phoneNumber);
        clickOnElement(updateBtn);
    }
    public String getAccountName(){ return getElementText(accountName);}
}
