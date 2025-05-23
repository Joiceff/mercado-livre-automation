package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class HomePage {
    private AppiumDriver<MobileElement> driver;

    private By searchField = By.id("com.mercadolibre.android:id/search_input");
    private By cartIcon = By.id("com.mercadolibre.android:id/cart_icon");

    public HomePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void searchProduct(String query) {
        driver.findElement(searchField).click();
        driver.findElement(searchField).sendKeys(query + "\n");
    }

    public boolean isHomeDisplayed() {
        return driver.findElement(searchField).isDisplayed();
    }
}
