package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import pages.HomePage;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NavigationTest {
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
    public void searchProductTest() {
        HomePage home = new HomePage(driver);
        home.searchItem("smartphone");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
