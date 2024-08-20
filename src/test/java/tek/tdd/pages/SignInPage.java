package tek.tdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utility.SeleniumUtility;

public class SignInPage extends SeleniumUtility {
    public SignInPage (){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "loginBtn")
    public WebElement loginBtn;

    @FindBy(id = "newAccountBtn")
    public WebElement createAccountBtn;

    @FindBy(className = "error")
    public WebElement errorMessage;

    public void doSignIn (String email, String password){
        sendTextToElement(emailInput,email);
        sendTextToElement(passwordInput,password);
        clickOnElement(loginBtn);
    }
}
