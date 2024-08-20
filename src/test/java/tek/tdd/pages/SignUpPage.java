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

    public void fillNewAccountInfo(String name, String email, String password, String confirmPassword) {
        sendTextToElement(nameInput, name);
        sendTextToElement(emailInput, email);
        sendTextToElement(passwordInput, password);
        sendTextToElement(confirmPasswordInput, confirmPassword);
    }
    public void clickOnSignUp(){
        clickOnElement(signUpBtn);
    }
}
