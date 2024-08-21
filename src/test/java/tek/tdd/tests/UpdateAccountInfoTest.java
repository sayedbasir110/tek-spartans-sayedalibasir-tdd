package tek.tdd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.UIBaseClass;

public class UpdateAccountInfoTest extends UIBaseClass {
    @Test
    public void updateAccountInfoAndValidate(){
        homePage.clickOnSignIn();
        signInPage.doSignIn("john.doe@gmail.com","John@123");
        homePage.clickOnAccountLink();
        accountPage.updateAccountNameAndPhoneNumber("Ali", "2365918255");
        boolean isToastMessageDisplayed = isElementDisplayed(accountPage.toastMessage);
        Assert.assertTrue(isToastMessageDisplayed);
        Assert.assertEquals(accountPage.getAccountName(),"Ali", "Account name should match");
        accountPage.updateAccountNameAndPhoneNumber("John Doe", "5152568974");

    }
}
