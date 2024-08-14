package tek.tdd.pages;

import org.openqa.selenium.By;

public class AccountPage {
    public static final By PROFILE_PAGE_TITLE = By.className("account__personal-title");
    public static final By PROFILE_EMAIL_TEXT = By.className("account__information-email");
    public static final By TOAST_MESSAGE = By.xpath("//div[@class='Toastify']");
    public static final By ACCOUNT_USER_NAME = By.className("account__information-username");
}
