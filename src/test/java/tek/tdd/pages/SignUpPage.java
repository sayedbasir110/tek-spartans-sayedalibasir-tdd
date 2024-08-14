package tek.tdd.pages;

import org.openqa.selenium.By;

public class SignUpPage {
    public static final By PAGE_SUBTITLE = By.className("signup__subtitle");
    public static final By SIGN_UP_BTN = By.id("signupBtn");
    public static final By NAME_INPUT = By.id("nameInput");
    public static final By EMAIL_INPUT = By.id("emailInput");
    public static final By PASSWORD_INPUT = By.id("passwordInput");
    public static final By CONFIRM_PASSWORD_INPUT = By.id("confirmPasswordInput");
    public static final By PROFILE_IMAGE = By.id("profileImage");
    public static final By ERROR_MESSAGE = By.className("error");
    public static final By FIELDS_ERROR_MESSAGES = By.className("error");
}
