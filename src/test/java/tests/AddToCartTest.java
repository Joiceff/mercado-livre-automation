package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AddToCartTest {
    AppiumDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/mercadolivre.apk");
        caps.setCapability("automationName", "UiAutomator2");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    @Test
    public void addItemToCart() {
        try {
            driver.findElementById("com.mercadolibre:id/search").click();
            driver.findElementById("com.mercadolibre:id/search_input").sendKeys("smartphone\n");
            Thread.sleep(3000);

            driver.findElementsById("com.mercadolibre:id/item_title").get(0).click();
            Thread.sleep(3000);

            driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Comprar agora\")").click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar item ao carrinho: " + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
