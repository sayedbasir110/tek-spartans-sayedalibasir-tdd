package tek.tdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utility.SeleniumUtility;

public class HomePage extends SeleniumUtility {
    //At the constructor we have to initialize these elements with Instance of WebDriver
    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(className = "top-nav__logo") public WebElement topLeftLogo;
    @FindBy(id = "signinLink") public WebElement signInLink;
    @FindBy(id = "accountLink") public WebElement accountLink;

    public void clickOnSignIn(){
        clickOnElement(signInLink);
    }
    public void clickOnAccountLink(){ clickOnElement(accountLink);}
}
