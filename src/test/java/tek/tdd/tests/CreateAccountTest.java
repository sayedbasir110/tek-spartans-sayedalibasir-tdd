package tek.tdd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.UIBaseClass;
import tek.tdd.utility.RandomEmailGenerator;

public class CreateAccountTest extends UIBaseClass {
    @Test
    public void createValidAccount(){
        homePage.clickOnSignIn();
        signInPage.clickOnCreateAccountBtn();
        String email = RandomEmailGenerator.generateRandomEmail();
        signUpPage.fillNewAccountInfo("John", email, "Password@123", "Password@123");
        signUpPage.clickOnSignUp();
        String actualAccountEmail =  accountPage.getAccountEmail();
        Assert.assertEquals(actualAccountEmail, email, "Account email should match");
    }
}
