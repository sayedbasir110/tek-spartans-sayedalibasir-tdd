package tek.tdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utility.SeleniumUtility;

public class SignUpPage extends SeleniumUtility {
    public SignUpPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(id="nameInput") public WebElement nameInput;
    @FindBy(id="emailInput") public WebElement emailInput;
    @FindBy(id="passwordInput") public WebElement passwordInput;
    @FindBy(id="confirmPasswordInput") public WebElement confirmPasswordInput;
    @FindBy(id="signupBtn") public WebElement signUpBtn;

    public void enterName(String name){
        sendTextToElement(nameInput, name);
    }
    public void enterEmail(String email){
        sendTextToElement(emailInput,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordInput, password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordInput, confirmPassword);
    }
    public void clickOnSignUp(){
        clickOnElement(signUpBtn);
    }
}
