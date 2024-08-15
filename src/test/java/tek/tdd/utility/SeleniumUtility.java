package tek.tdd.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.tdd.base.BaseSetup;

import java.time.Duration;
import java.util.List;

public class SeleniumUtility extends BaseSetup {
    private static final Logger LOGGER = LogManager.getLogger(SeleniumUtility.class);
    private WebDriverWait getWait()  {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(WAIT_TIME_IN_SECONDS));
    }

    public String getElementText(By locator) {
        LOGGER.debug("Returning element Text {}" , locator);
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator))
                .getText();
    }
    public WebElement waitForVisibility(WebElement element){
        return getWait().until(ExpectedConditions.visibilityOf(element));
    }

    public String getElementText(WebElement element) {
        LOGGER.debug("Returning element Text {}" , element);
        return waitForVisibility(element).getText();
    }

    public boolean isElementEnabled(WebElement element) {
        LOGGER.debug("Checking element enable status {}", element);
        boolean isEnabled = waitForVisibility(element).isEnabled();
        LOGGER.debug("element is enabled status {}", isEnabled);
        return isEnabled;
    }
    public void clickOnElement(WebElement element){
        LOGGER.debug("Clicking on element {}", element);
        getWait().until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void sendTextToElement (WebElement element, String text){
        LOGGER.info("Sending {} to {}",text,element);
        WebElement element1 = waitForVisibility(element);
        element1.sendKeys(text);
    }
    public boolean isElementDisplayed(WebElement element){
        LOGGER.info("Checking if {} is displayed",element);
        return waitForVisibility(element).isDisplayed();
    }
}
