package tek.tdd.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tek.tdd.base.UIBaseClass;
import tek.tdd.pages.HomePage;
import tek.tdd.pages.SignInPage;

public class BasicSetupTest extends UIBaseClass {
    private void validateLogo() {
        String actualLogoText = getElementText(homePage.topLeftLogo);
        Assert.assertEquals(actualLogoText, "TEKSCHOOL", "Logo text should match");
    }

    @Test
    public void validateTopLeftCornerLogo() {
        validateLogo();
    }

    @Test
    public void testingLoginButtonAndLogo() {
        validateLogo();
        boolean isEnabled = isElementEnabled(homePage.signInLink);
        Assert.assertTrue(isEnabled, "Sign in button should be enabled");
    }

}
