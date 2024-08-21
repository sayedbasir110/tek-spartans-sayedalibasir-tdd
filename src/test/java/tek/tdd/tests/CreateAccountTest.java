package tek.tdd.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.UIBaseClass;
import tek.tdd.utility.RandomEmailGenerator;
import java.util.List;

public class CreateAccountTest extends UIBaseClass {
    @Test
    public void createValidAccountSuccessfully(){
        homePage.clickOnSignIn();
        signInPage.clickOnCreateAccountBtn();
        String email = RandomEmailGenerator.generateRandomEmail();
        signUpPage.fillNewAccountInfo("John", email, "Password@123", "Password@123");
        signUpPage.clickOnSignUp();
        String actualAccountEmail =  accountPage.getAccountEmail();
        Assert.assertEquals(actualAccountEmail, email, "Account email should match");
    }
    @Test
    public void createAccountWithExcitingEmail(){
        homePage.clickOnSignIn();
        signInPage.clickOnCreateAccountBtn();
        signUpPage.fillNewAccountInfo("John", "johndoe@gmail.com","Password@123", "Password@123");
        signUpPage.clickOnSignUp();
        String actualErrorMessage = signUpPage.getExistingEmailError();
        Assert.assertEquals(actualErrorMessage, "this email is already exist, please use another email address", "Error message should match");
    }
    @Test
    public void createAccountWithoutFillingTheForm(){
        homePage.clickOnSignIn();
        signInPage.clickOnCreateAccountBtn();
        signUpPage.clickOnSignUp();
        List<WebElement> errorElements = getElements(signUpPage.fieldErrorMessages);
        List<String> expectedErrorMessages = List.of(
                "Name is a required field",
                "Email is a required field",
                "Password is a required field",
                "Confirm Password is a required field");
        Assert.assertEquals(errorElements.size(), expectedErrorMessages.size());
        for (int i=0; i<errorElements.size(); i++){
            Assert.assertEquals(errorElements.get(i).getText(), expectedErrorMessages.get(i));
        }

    }

}
