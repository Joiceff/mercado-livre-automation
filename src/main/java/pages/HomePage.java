package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HomePage {
    AppiumDriver<MobileElement> driver;

    public HomePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void searchItem(String query) {
        driver.findElementById("com.mercadolibre:id/search").click();
        driver.findElementById("com.mercadolibre:id/search_input").sendKeys(query + "\n");
    }
}
