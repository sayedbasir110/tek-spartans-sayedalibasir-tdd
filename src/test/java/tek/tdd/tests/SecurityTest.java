package tek.tdd.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tek.tdd.base.UIBaseClass;
import tek.tdd.pages.SignInPage;

public class SecurityTest extends UIBaseClass {
    @Test
    public void validateSuccessfulLogin() {
        homePage.clickOnSignIn();
        signInPage.doSignIn("john.doe@gmail.com", "John@123");
        boolean isDisplayed = isElementDisplayed(homePage.accountLink);
        Assert.assertTrue(isDisplayed);
    }
    @Test(dataProvider = "invalidTestData")
    public void loginWithInvalidUsernameAndPasswordAndValidateError (String email, String password){
        homePage.clickOnSignIn();
        signInPage.doSignIn(email, password);
        String actualErrorMessage = signInPage.getErrorText();
        Assert.assertEquals(actualErrorMessage,"wrong username or password");
    }
    @DataProvider(name = "invalidTestData")
    private  String[][] invalidTestData(){
        String[][] data = {
                {"invalid@gmail.com", "Password@23"},
                {"nomail@gmail.com","WrongPassword123"},
                {"john.doe@gmail.com","WrongPassword"},
        };
        return data;
    }
}
