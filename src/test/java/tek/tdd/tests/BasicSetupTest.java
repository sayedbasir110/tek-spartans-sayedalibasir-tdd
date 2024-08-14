package tek.tdd.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.UIBaseClass;
import tek.tdd.pages.HomePage;

public class BasicSetupTest extends UIBaseClass {
    @Test
    public void validateTopLeftCornerLogo (){
        String actualLogoText = getElementText(By.className("top-nav__logo"));
        Assert.assertEquals(actualLogoText,"TEKSCHOOL", "Logo text should match");
    }
    @Test
    public void validateTopLeftCornerLogoAndSignInBtn(){
        String actualLogoText = getElementText(By.className("top-nav__logo"));
        Assert.assertEquals(actualLogoText,"TEKSCHOOL", "Logo text should match");
        boolean isSignInBtnEnabled = isElementEnabled(HomePage.SING_IN_LINK);
        Assert.assertTrue(isSignInBtnEnabled);
    }
}
