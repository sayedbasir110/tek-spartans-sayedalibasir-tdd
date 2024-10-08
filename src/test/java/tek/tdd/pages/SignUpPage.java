package tek.tdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utility.SeleniumUtility;

import java.util.List;

public class SignUpPage extends SeleniumUtility {
    public SignUpPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(id="nameInput") public WebElement nameInput;
    @FindBy(id="emailInput") public WebElement emailInput;
    @FindBy(id="passwordInput") public WebElement passwordInput;
    @FindBy(id="confirmPasswordInput") public WebElement confirmPasswordInput;
    @FindBy(id="signupBtn") public WebElement signUpBtn;
    @FindBy(xpath = "//div[contains(text(),'this email')]") public WebElement existingEmailError;
    @FindBy(className = "error") public List<WebElement> fieldErrorMessages;

    public void fillNewAccountInfo(String name, String email, String password, String confirmPassword) {
        sendTextToElement(nameInput, name);
        sendTextToElement(emailInput, email);
        sendTextToElement(passwordInput, password);
        sendTextToElement(confirmPasswordInput, confirmPassword);
    }
    public void clickOnSignUp(){
        clickOnElement(signUpBtn);
    }
    public String getExistingEmailError(){
        return getElementText(existingEmailError);
    }
}
