package tek.tdd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.UIBaseClass;
import tek.tdd.utility.RandomEmailGenerator;

public class CreateAccountTest extends UIBaseClass {
    @Test
    public void createValidAccount(){
        clickOnElement(homePage.signInLink);
        clickOnElement(signInPage.createAccountBtn);
        sendTextToElement(signUpPage.nameInput, "John");
        String email = RandomEmailGenerator.generateRandomEmail();
        sendTextToElement(signUpPage.emailInput, email);
        sendTextToElement(signUpPage.passwordInput, "Password@123");
        sendTextToElement(signUpPage.confirmPasswordInput, "Password@123");
        clickOnElement(signUpPage.signUpBtn);
        String actualUserAccountEmail = getElementText(accountPage.accountEmail);
        Assert.assertEquals(actualUserAccountEmail, email, "Account email should match");
    }
}
