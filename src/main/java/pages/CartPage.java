package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class CartPage {
    private AppiumDriver<MobileElement> driver;

    private By checkoutButton = By.id("com.mercadolibre.android:id/checkout_button");

    public CartPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public boolean isCartDisplayed() {
        return driver.findElement(checkoutButton).isDisplayed();
    }
}
