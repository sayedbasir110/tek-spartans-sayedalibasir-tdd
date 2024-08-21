package tek.tdd.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tek.tdd.base.UIBaseClass;

public class UpdateAccountInfoTest extends UIBaseClass {
    @Test(dataProvider = "accountInfoData")
    public void updateAccountInfoAndValidateChanges(String name, String phoneNumber){
        homePage.clickOnSignIn();
        signInPage.doSignIn("john.doe@gmail.com","John@123");
        homePage.clickOnAccountLink();
        accountPage.updateAccountNameAndPhoneNumber(name, phoneNumber);
        boolean isToastMessageDisplayed = isElementDisplayed(accountPage.toastMessage);
        Assert.assertTrue(isToastMessageDisplayed, "Toast message should be displayed after updating account info");
        Assert.assertEquals(accountPage.getAccountName(),name, "Account name should match");
        accountPage.updateAccountNameAndPhoneNumber("John Doe", "5152568974");
    }
    @DataProvider(name = "accountInfoData")
    public String[][] accountInfoData(){
        return new String[][]{
                {"Ali", "2365918255"},
                {"Eric", "6041582565"},
                {"Michelle", "2024518796"},
        };
    }
}
