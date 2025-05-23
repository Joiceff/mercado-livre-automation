package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginPage {
    private AppiumDriver<MobileElement> driver;

    private By emailField = By.id("com.mercadolibre.android:id/login_email");
    private By continueButton = By.id("com.mercadolibre.android:id/button_continue");
    private By passwordField = By.id("com.mercadolibre.android:id/login_password");
    private By loginButton = By.id("com.mercadolibre.android:id/button_login");

    public LoginPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(continueButton).click();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
